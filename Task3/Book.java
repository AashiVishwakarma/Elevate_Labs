package Task3;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued=false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void issueBook() {
        this.isIssued=true;
    }
    public void returnBook(){
        this.isIssued=false;
    }

    @Override
    public String toString() {

        return title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
        //return "Book title: " + getTitle() + ", Author Name: " + getAuthor();
    }


}
