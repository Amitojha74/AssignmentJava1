package main;

import java.util.*;

public class BookServiceImpl implements BookService {

    private List<Book> issueBook;
    private Queue<RequestBook> reqBook=new PriorityQueue<>();
    private List<Book> allBook =new ArrayList<>();


    public List<Book> addBook(int userId){
        BookList bookList=new BookList();
        List<Book> book=bookList.addBook(userId);
        allBook.addAll(book);
        return allBook;
    }


    public List<Book> issueBook(int bookId, int id, int userId, List<Book> searchBook) {
        int copies = 0, bookOwnerId = 0;
        issueBook = new ArrayList<>();
        Book bookAdd = new Book();
        for (Book book : searchBook) {
            if (bookId == book.getBid()) {
                copies = book.getCopies();
                bookOwnerId = book.getUserId();
                if (bookOwnerId == userId) {
                    if (copies != 0) {
                        bookAdd.setBid(book.getBid());
                        bookAdd.setName(book.getName());
                        bookAdd.setAuthor(book.getAuthor());
                        bookAdd.setSubject(book.getSubject());
                        bookAdd.setUserId(id);
                        bookAdd.setIssueDate("23 dec");
                        issueBook.add(bookAdd);
                        copies = copies - 1;
                        for (Book book2 : allBook) {
                            if (book2.getBid() == bookId) {
                                book2.setCopies(copies);
                                book2.setIssueDate("23 dec");
                                break;
                            }
                        }
                    }
                }
                else {
                    break;
                }
            }
        }
        if(reqBook.size()!=0){
            for (RequestBook requestBook : reqBook) {
                if (requestBook.getBid() == bookId) {
                    reqBook.poll();
                }
            }
        }
        return issueBook;
    }


    public void returnBook(int bookId, List<Book> issueBook){
        for (Book book3 :issueBook) {
            if(book3.getBid()== bookId){
                book3.setReturnDate("24 dec");
                break;
            }
        }
        for (Book book4 : allBook) {
            if(book4.getBid()== bookId){
                int copy= book4.getCopies();
                copy=copy+1;
                book4.setCopies(copy);
                book4.setReturnDate("24 dec");
                break;
            }
        }
    }

    public List<Book> searchBook(String name){
        List<Book> searchBook =new ArrayList<>();
        for (Book book : allBook) {
            if (book.getName().toLowerCase().equals(name.toLowerCase()) || book.getAuthor().toLowerCase().equals(name.toLowerCase())
                    || book.getSubject().toLowerCase().equals(name.toLowerCase())) {
                searchBook.add(book);
            }
        }
        return searchBook;
    }


    public Queue<RequestBook> requestBook(int requestedUserId){
        reqBook.add(new RequestBook(1,"Java","AO","CS", requestedUserId));
        return reqBook;
    }
}
