package main;

public class RequestBook {

    private int bid;
    private String name;
    private String author;
    private String subject;
    private int reqUserId;
    //private int adminUserId;

    public RequestBook() {
    }

    public RequestBook(int bid, String name, String author, String subject, int reqUserId) {
        this.bid = bid;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.reqUserId = reqUserId;
        //this.adminUserId = adminUserId;
    }

//    public int getAdminUserId() {
//        return adminUserId;
//    }
//
//    public void setAdminUserId(int adminUserId) {
//        this.adminUserId = adminUserId;
//    }

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

    public int getReqUserId() {
        return reqUserId;
    }

    public void setReqUserId(int reqUserId) {
        this.reqUserId = reqUserId;
    }

    @Override
    public String toString() {
        return "RequestBook{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", reqUserId=" + reqUserId +
                '}';
    }
}
