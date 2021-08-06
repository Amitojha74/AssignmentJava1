package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BookManage b = new BookManage();
        Book b1=new Book();
        int i,ch,ch1,c=0,id;
        String name;
        List<User> user=new ArrayList<>();
        user.add(new User(101,"Amit"));
        user.add(new User(102,"Aman"));
        user.add((new User(103,"Ankit")));

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
                        System.out.println("3. For Searching A Book with Name,Author,Subject");
                        System.out.println("4. For Issue A Book");
                        System.out.println("5. For Returning A Book");
                        System.out.println("6. For Requesting A Book");
                        System.out.println("7. For Exit()");
                        ch = sc.nextInt();
                        if (ch == 1) {
                            b.ShowBook();
                        } else if (ch == 2) {
                            b.AddBook(i);
                        } else if (ch == 3) {
                            name=sc.next();
                            b.SearchBook(name);
                        }
                        else if(ch==4){
                            id=sc.nextInt();
                            b.IssueBook(i,id);
                        }
                        else if(ch==5){

                        }
                        else if(ch==6){

                        }
                        else
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
