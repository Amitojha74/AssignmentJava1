package main;

import java.util.Date;

public class IssueBook {
    private int bid;
    private String name;
    private int userid;
    private Date issueDate;
    private Date returnDate;

    public IssueBook() {
    }

    public IssueBook(int bid, String name, int userid, Date issueDate, Date returnDate) {
        this.bid = bid;
        this.name = name;
        this.userid = userid;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "IssueBook{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", userid=" + userid +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
