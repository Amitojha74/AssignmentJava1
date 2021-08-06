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

    public void AddBook(int i){
        book1=new ArrayList<>();
        book1.add(new Book(1,"Programming in java","AO","CS",2,i));
        book1.add(new Book(2,"Programming in java","A","CS",2,i));
        book1.add(new Book(3,"Programming in C++","O","CS",2,i));
        book1.add(new Book(4,"Programming in Python","AO1","CS",2,i));
        System.out.println("Book Added Successfully");
    }
    public void IssueBook(int i,int bid){
        String s=Integer.toString(bid);
        Book b=new Book();
        book2=new ArrayList<Book>();
        List<Book> book=new ArrayList<>();
        for(Book c:book1) {
                if(s.equals(c.getBid())){
                    book.add(c);
            }
        }
        System.out.println(book2);

        //SearchBook();
//        if(book1.isEmpty() || b.equals(book1.get(b.getCopies()))){
//            System.out.println("Book Not available");
//        }
//        else
//            System.out.println("Book is issue");
    }

    public void ReturnBook(List<Book> book1){
        Book b=new Book();
        //SearchBook();
        System.out.println("Book Search");
        AddBook(b.getUserId());
    }

    public void SearchBook(String name){
        List<Book> b2=new ArrayList<>();
        //String name="Programming in java";
        for (Book b:book1) {
            if(b.getName().equals(name) || b.getAuthor().equals(name) || b.getSubject().equals(name)){
                //book1.indexOf(b);
                b2.add(b);
            }
        }
        System.out.println("Book Search found");
        System.out.println(b2);
    }
}
