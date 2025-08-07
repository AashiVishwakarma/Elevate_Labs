package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         Library lib=new Library();
         boolean library=true;
         while (library) {
             System.out.println(" -----  Library Management System  -----");
             System.out.println("1. Add User");
             System.out.println("2. Add Book");
             System.out.println("3. View all book");
             System.out.println("4. View all users");
             System.out.println("5. Issue Book");
             System.out.println("6. Return Book");
             System.out.println("7. Exit");
             System.out.println("Enter your choice : ");
             int choice = sc.nextInt();
             sc.nextLine();
             switch (choice) {
                 case 1:
                     System.out.print("Enter user name : ");
                     String name = sc.nextLine();
                     System.out.print("Enter user id : ");
                     int id = sc.nextInt();
                     sc.nextLine();
                     lib.adduser(new User(name, id));
                     break;
                 case 2:
                     System.out.print("Enter book name : ");
                     String book_name = sc.nextLine();
                     System.out.print("Enter author name : ");
                     String author = sc.nextLine();
                     Book b = new Book(book_name, author);
                     lib.addbook( b);
                     break;

                 case 3:
                     lib.View_all_book();
                     break;
                 case 4:
                     lib.View_all_users();
                     break;
                 case 5:
                     System.out.print("Enter the title of book you want to issue : ");
                     String title=sc.nextLine();
                     lib.issueBook(title);
                     break;
                 case 6:
                     System.out.print("Enter the title of book you want to return : ");
                     String title1=sc.nextLine();
                     lib.returnBook(title1);
                     break;
                 case 7:
                     library = false;
                     System.out.println("Exiting program!!!");
                     break;
                 default:
                     System.out.println("Invalid choice !!!");
                     }
         }
    }

}
