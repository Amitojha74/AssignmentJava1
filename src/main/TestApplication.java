package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestApplication {

    public static void main(String[] args) {
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
                        System.out.println("1. For Showing All Books");
                        System.out.println("2. For Showing Issue Book List");
                        System.out.println("3. For Adding A Book");
                        System.out.println("4. For Searching A Book with Name,Author,Subject");
                        System.out.println("5. For Issue A Book");
                        System.out.println("6. For Returning A Book");
                        System.out.println("7. For Requesting A Book");
                        System.out.println("8. Requesting Book List");
                        System.out.println("9. For Exit()");
                        ch = sc.nextInt();
                        if (ch == 1) {
                            b.ShowBook();
                        } else if (ch == 2) {
                            b.IssueBookList();
                        } else if (ch == 3) {
                            b.AddBook(i);
                        }
                        else if(ch==4){
                            name=sc.next();
                            b.SearchBook(name);
                        }
                        else if(ch==5){
                            System.out.println("Enter string to search book");
                            name=sc.next();
                            System.out.println("Enter Id to which you issue book");
                            id=sc.nextInt();
                            b.IssueBook(name,id,i);
                        }
                        else if(ch==6){
                            System.out.println("Enter Book Id");
                            id=sc.nextInt();
                            b.ReturnBook(id);
                        }
                        else if(ch==7){
                            b.RequestBook(i);
                        }
                        else if(ch==8){
                            b.ShowRequestBook();
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
