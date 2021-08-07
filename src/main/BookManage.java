package main;

import java.util.ArrayList;
import java.util.List;

public class BookManage {

    private List<Book> book1;
    private List<Book> book2;

    public void ShowBook()
    {
        System.out.println(book1);
    }

    public void IssueBookList(){
        System.out.println(book2);
    }

    public void AddBook(int i){
        book1=new ArrayList<>();
        book1.add(new Book(1,"Programming in java","AO","CS",2,i));
        book1.add(new Book(2,"Programming in java","A","CS",2,i));
        book1.add(new Book(3,"Programming in C++","O","CS",2,i));
        book1.add(new Book(4,"Programming in Python","AO1","CS",2,i));
        System.out.println("Book Added Successfully");
    }

    public void IssueBook(int i,String name){
        book2=new ArrayList<>();
        List<Book> b3=SearchBook(name);
        Book b1=new Book();
        for (Book b:b3) {
            int c=b.getCopies();
            int id=b.getBid();
            if(c==0)
            {
                System.out.println("Book Not Available");
            }
            else{
                b1.setBid(b.getBid());
                b1.setName(b.getName());
                b1.setAuthor(b.getAuthor());
                b1.setSubject(b.getSubject());
                b1.setUserId(i);
                b1.setIssueDate("23 dec");
                book2.add(b1);
                c=c-1;
                for (Book b2:book1) {
                    if(b2.getBid()==id) {
                        b2.setCopies(c);
                        b2.setIssueDate("23 dec");
                    }
                }
            }
        }
        System.out.println(book2);
        //book3.add book2;
    }

    public void ReturnBook(int id){
        book2=new ArrayList<>();
//        List<Book> b1=SearchBook(name);
//        for (Book b2: b1) {
//            id=b2.getUserId();
//            id2=b2.getBid();
//        }
        for (Book b3:book2) {
            if(id==b3.getBid()){
                b3.setReturnDate("24 dec");
                //book2.add(b3);
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
        System.out.println("Book Returned");
        System.out.println(book2);
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
}
