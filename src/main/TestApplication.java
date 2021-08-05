package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BookManage b = new BookManage();
        int i,ch,ch1,c=0;
        List<Book> book=new ArrayList<>();

        List<User> user=new ArrayList<>();
        user.add(new User(101,"Amit"));
        user.add(new User(102,"Aman"));
        user.add((new User(103,"Ankit")));

        List<Book> list=new ArrayList<>();
        list.add(new Book("Lion","PP","Novel",3,101));
        while(true) {
            System.out.println("Welcome to the Book App");
            System.out.println("1. For Enter into System");
            System.out.println("2. For Exit()");
            ch1 = sc.nextInt();
            if(ch1==1) {
                System.out.println("Enter User Id: ");
                i = sc.nextInt();
                for (User u1 : user) {
                    if (i == u1.getUserId()) {
                        c = 1;
                    }
                }
                if (c == 1) {
                    while (true) {
                        System.out.println("1. For Showing The All Books");
                        System.out.println("2. For Adding A Book");
                        System.out.println("3. For Searching A Book");
                        System.out.println("4. Show My Books");
                        System.out.println("5. For Exit()");
                        ch = sc.nextInt();
                        if (ch == 1) {
                            b.ShowBook(book);
                        } else if (ch == 2) {
                            book = b.AddBook(i, book);
                        } else if (ch == 3) {
                            b.SearchBook();
                        } else if (ch == 4) {
                            b.ShowMyBooks(i,book);
                        } else
                            break;
                    }
                }
                else{
                    System.out.println("You enter Wrong Id pls give Right Id");
                }
            }
            else
                break;
        }
    }
}
