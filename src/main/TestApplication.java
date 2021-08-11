package main;

import java.util.*;

public class TestApplication {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        BookServiceImpl bookServiceImpl = new BookServiceImpl();
        Book b1=new Book();
        int userId,ch,ch1,c=0,id;
        String name;
        List<Book> book1=new ArrayList<>();
        List<Book> issue=new ArrayList<>();
        Queue<RequestBook> reqBook=new PriorityQueue<>();

        List<User> user=new ArrayList<>();
        user.add(new User(101,"Amit"));
        user.add(new User(102,"Aman"));
        user.add((new User(103,"Ankit")));

        while(true) {
            System.out.println("Welcome to the Book App");
            System.out.println("1. For Enter into System");
            System.out.println("2. For Exit()");
            ch1 = input.nextInt();
            if(ch1==1) {
                System.out.println("Enter User Id: ");
                userId= input.nextInt();
                for (User user1 : user) {
                    if (userId == user1.getUserId()) {
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
                        ch = input.nextInt();
                        if (ch == 1) {
                            System.out.println("All Book List");
                            System.out.println(book1);
                        } else if (ch == 2) {
                            System.out.println("Issue Book List");
                            System.out.println(issue);
                        } else if (ch == 3) {
                            book1= bookServiceImpl.addBook(userId);
                            System.out.println("Book Added Successfully");
                        }
                        else if(ch==4){
                            List<Book> searchBook=new ArrayList<>();
                            System.out.println("Enter string to search book");
                            name= input.next();
                            searchBook= bookServiceImpl.searchBook(name);
                            System.out.println("Search Result is:");
                            System.out.println(searchBook);
                        }
                        else if(ch==5) {
                            System.out.println("Enter string to search book");
                            name = input.next();
                            List<Book> searchBook = new ArrayList<>();
                            searchBook = bookServiceImpl.searchBook(name);
                            if (searchBook.isEmpty()) {
                                System.out.println("Book Not Available with Search String");
                            } else {
                                System.out.println(searchBook);
                                System.out.println("Enter Id to which you issue book");
                                id = input.nextInt();
                                System.out.println("Enter Book Id");
                                int bookId = input.nextInt();
                                issue = bookServiceImpl.issueBook(bookId, id, userId, searchBook);
                                if (issue.isEmpty()) {
                                    System.out.println("Book Not Available or you have not authority to issue");
                                } else {
                                    System.out.println("Book Issue Details");
                                    System.out.println(issue);
                                }
                            }
                        }
                        else if(ch==6){
                            System.out.println("Enter Book Id");
                            id= input.nextInt();
                            bookServiceImpl.returnBook(id,issue);
                            System.out.println("Book Returned Successfully");
                        }
                        else if(ch==7){
                            reqBook= bookServiceImpl.requestBook(userId);
                            System.out.println("Book Is Requested");
                            System.out.println(reqBook);
                        }
                        else if(ch==8){
                            System.out.println("Requested book List:");
                            System.out.println(reqBook);
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
