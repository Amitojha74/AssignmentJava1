package main;
import java.util.Objects;

public class Book {
    private int bid;
    private String name;
    private String author;
    private String subject;
    private int copies;
    private int userId;

    public Book() {
    }

    public Book(int bid, String name, String author, String subject, int copies, int userId) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.copies = copies;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", copies=" + copies +
                ", userId=" + userId +
                '}';
    }
}
