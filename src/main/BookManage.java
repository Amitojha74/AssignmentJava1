package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManage {
    Scanner s=new Scanner(System.in);

    public void ShowBook(List<Book> list){
        System.out.println(list);
    }

    public List<Book> AddBook(int i,List<Book> book){
        Book b=new Book();

        System.out.println("Enter Name: ");
        b.setName(s.next());
        System.out.println("Enter Author: ");
        b.setAuthor(s.next());
        System.out.println("Enter Subject: ");
        b.setSubject(s.next());
        System.out.println("Enter Copies: ");
        b.setCopies(s.nextInt());
        b.setUserId(i);
        book.add(b);
        System.out.println("Book Added Successfully");
        return book;
    }

    public void SearchBook(){
        System.out.println("Book Search");
    }

    public void ShowMyBooks(int i, List<Book> book){
        for (Book a: book) {
            if(i==a.getUserId()){
                System.out.println(book);
            }
        }
    }
}
