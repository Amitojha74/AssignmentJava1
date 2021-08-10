package main;

public class User {

    private int userId;
    private String name;

    //private Book book;

    public User() {
    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

//    public User(int userId, String name, Book book) {
//        this.userId = userId;
//        this.name = name;
//        this.book = book;
//    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
