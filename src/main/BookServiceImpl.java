package main;

import java.util.*;

public class BookServiceImpl implements BookService {

    private List<Book> issueBook;
    private Queue<RequestBook> reqBook=new PriorityQueue<>();
    private List<Book> book1=new ArrayList<>();


    public List<Book> addBook(int i){
        BookList bmp=new BookList();
        List<Book> book=bmp.addBook(i);
        book1.addAll(book);
        return book1;
    }


    public List<Book> issueBook(int bookId, int id, int i, List<Book> b3) {
        int c = 0, a = 0;
        issueBook = new ArrayList<>();
        Book b1 = new Book();
        for (Book b : b3) {
            if (bookId == b.getBid()) {
                c = b.getCopies();
                a = b.getUserId();
                if (a == i) {
                    if (c != 0) {
                        b1.setBid(b.getBid());
                        b1.setName(b.getName());
                        b1.setAuthor(b.getAuthor());
                        b1.setSubject(b.getSubject());
                        b1.setUserId(id);
                        b1.setIssueDate("23 dec");
                        issueBook.add(b1);
                        c = c - 1;
                        for (Book b2 : book1) {
                            if (b2.getBid() == bookId) {
                                b2.setCopies(c);
                                b2.setIssueDate("23 dec");
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
            for (RequestBook req : reqBook) {
                if (req.getBid() == bookId) {
                    reqBook.poll();
                }
            }
        }
        return issueBook;
    }


    public void returnBook(int id, List<Book> issueBook){
        for (Book b3:issueBook) {
            if(b3.getBid()==id){
                b3.setReturnDate("24 dec");
                break;
            }
        }
        for (Book b3:book1) {
            if(b3.getBid()==id){
                int c= b3.getCopies();
                c=c+1;
                b3.setCopies(c);
                b3.setReturnDate("24 dec");
                break;
            }
        }
    }

    public List<Book> searchBook(String name){
        List<Book> searchBook =new ArrayList<>();
        for (Book b : book1) {
            if (b.getName().toLowerCase().equals(name.toLowerCase()) || b.getAuthor().toLowerCase().equals(name.toLowerCase())
                    || b.getSubject().toLowerCase().equals(name.toLowerCase())) {
                searchBook.add(b);
            }
        }
        return searchBook;
    }


    public Queue<RequestBook> requestBook(int i){
        reqBook.add(new RequestBook(1,"Java","AO","CS",i));
        return reqBook;
    }
}
