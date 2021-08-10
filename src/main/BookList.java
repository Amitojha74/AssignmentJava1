package main;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    List<Book> book1=new ArrayList<>();

    public List<Book> addBook(int i){
        book1.add(new Book(1,"Java","AO","CS",2,i));
        book1.add(new Book(2,"C","A","CS",2,i));
        book1.add(new Book(3,"C++","O","CS",2,i));
        book1.add(new Book(4,"Python","AO1","CS",2,i));
        return book1;
    }
}

