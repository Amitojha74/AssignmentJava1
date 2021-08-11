package main;

import java.util.List;
import java.util.Queue;

public interface BookService {

    public List<Book> addBook(int userId);

    public List<Book> issueBook(int bookId, int id, int userId, List<Book> searchBook);

    public void returnBook(int bookId, List<Book> issueBook);

    public List<Book> searchBook(String name);

    public Queue<RequestBook> requestBook(int requestedUserId);

}
