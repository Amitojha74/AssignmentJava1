package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManage {

    private List<Book> book1;
    private List<Book> issueBook;
    private List<Book> book3;
    private List<RequestBook> reqBook;

    Scanner sc=new Scanner(System.in);

    public void ShowBook()
    {
        System.out.println(book1);
    }

    public void AddBook(int i){
        book1=new ArrayList<>();
        book1.add(new Book(1,"Java","AO","CS",2,i));
        book1.add(new Book(2,"C","A","CS",2,i));
        book1.add(new Book(3,"C++","O","CS",2,i));
        book1.add(new Book(4,"Python","AO1","CS",2,i));
        System.out.println("Book Added Successfully");
    }

    public void IssueBook(String name,int uid,int i) {
        int c = 0, id = 0, a = 0;
        issueBook = new ArrayList<>();
        //book3=new ArrayList<>();
        List<Book> b3 = SearchBook(name);
        System.out.println("Enter Book Id");
        id = sc.nextInt();
        Book b1 = new Book();
        for (Book b : b3) {
            if (id == b.getBid()) {
                c = b.getCopies();
                a = b.getUserId();
                if (a == i) {
                    if (c == 0) {
                        System.out.println("Book Not Available");
                    } else {
                        b1.setBid(id);
                        b1.setName(b.getName());
                        b1.setAuthor(b.getAuthor());
                        b1.setSubject(b.getSubject());
                        b1.setUserId(uid);
                        b1.setIssueDate("23 dec");
                        issueBook.add(b1);
                    }
                    c = c - 1;
                    for (Book b2 : book1) {
                        if (b2.getBid() == id) {
                            b2.setCopies(c);
                            b2.setIssueDate("23 dec");
                        }
                    }
                    for (RequestBook req: reqBook) {
                        if(req.getBid()==id){
                            int index=reqBook.indexOf(req);
                            reqBook.remove(index);
                        }
                    }
                } else {
                    System.out.println("You have not permission to issue a book");
                }
            }
        }
        System.out.println(issueBook);
    }


    public void IssueBookList(){
        System.out.println(issueBook);
    }

    public void ReturnBook(int id){
        issueBook=new ArrayList<>();
        for (Book b3:issueBook) {
            if(b3.getBid()==id){
                b3.setReturnDate("24 dec");
                issueBook.add(b3);
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
        System.out.println("Book Returned Successfully");
    }

    public List<Book> SearchBook(String name){
        List<Book> b2=new ArrayList<>();
        int c=1;
            for (Book b : book1) {
                if (b.getName().toLowerCase().equals(name.toLowerCase()) || b.getAuthor().equals(name) || b.getSubject().equals(name)) {
                    b2.add(b);
                    c++;
                }
            }
        if(c==1){
            System.out.println("Book Not Found");
        }
        else{
            System.out.println("Book Search Result:");
            System.out.println(b2);
        }
        return b2;
    }

    public void RequestBook(int i){
        reqBook=new ArrayList<>();
        reqBook.add(new RequestBook(1,"Java","AO","CS",i));
        reqBook.add(new RequestBook(2,"C","A","CS",i));
        System.out.println("Book Is Requested");
        System.out.println(reqBook);
    }

    public void ShowRequestBook(){
        System.out.println(reqBook);
    }
}
