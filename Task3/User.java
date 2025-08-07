package Task3;

import java.util.Scanner;

public class User {
    private String name;
    private int id;
    private boolean isIssued;
    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.isIssued=false;
    }
    Scanner sc=new Scanner(System.in);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    @Override
    public String toString() {

        return "User ID: " + id + ", Name: " + name;
    }
}