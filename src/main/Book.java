package main;
import java.util.Objects;

public class Book {
    private int bid;
    private String name;
    private String author;
    private String subject;
    private int copies;
    private int userId;
    private String issueDate;
    private String returnDate;

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

    public Book(int bid, String name, String author, String subject, int copies, int userId, String issueDate, String returnDate) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.copies = copies;
        this.userId = userId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
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
                ", issueDate='" + issueDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBid() == book.getBid() && getCopies() == book.getCopies() && getUserId() == book.getUserId() && getName().equals(book.getName()) && getAuthor().equals(book.getAuthor()) && getSubject().equals(book.getSubject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBid(), getName(), getAuthor(), getSubject(), getCopies(), getUserId());
    }
}
