package main;

import java.util.List;
import java.util.Queue;

public interface BookService {

    public List<Book> addBook(int i);

    public List<Book> issueBook(int bookId, int id, int i, List<Book> b3);

    public void returnBook(int id, List<Book> issueBook);

    public List<Book> searchBook(String name);

    public Queue<RequestBook> requestBook(int i);

}
