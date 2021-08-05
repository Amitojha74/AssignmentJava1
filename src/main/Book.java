package main;

public class Book {
    private int bid;
    private String name;
    private String author;
    private String subject;
    private int copies;
    private int userId;

    static int bid1=0;

    public Book() {
    }

    public Book(String name, String author, String subject, int copies, int userId) {
        this.bid = setBid();
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.copies = copies;
        this.userId = userId;
    }

    public int getBid() {
        return bid;
    }

    public static int setBid() {
         bid1++;
         return bid1;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + this.bid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", copies='" + copies + '\'' +
                ", userId=" + userId +
                '}';
    }
}
