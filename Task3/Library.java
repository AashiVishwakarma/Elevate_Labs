package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc=new Scanner(System.in);
    List<User> users = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    void adduser(User user){
        users.add( user);
        System.out.println("User added successfully ");
    }

    public void addbook(Book book){
        books.add(book);
        System.out.println("book added successfully ");
    }
    public void View_all_book(){
        if(books.isEmpty()){
            System.out.println("No books available");
        }
        else {

            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void View_all_users(){
        if(users.isEmpty()){
            System.out.println("No users found");
        }
        else {
            for (User user : users) {
                System.out.println(user);
            }
        }

    }
    //Main : issue feature to implemented
    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available for issuing.");
    }
    //Main : return feature implemented
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.isIssued();
                System.out.println("Book returned successfully.");
                return ;
            }
        }
        System.out.println("Book is available for issuing.");
    }
}
