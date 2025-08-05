import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int ID;
    String name;
    float marks;

    public Student(int ID, String name, float marks) {
        this.ID = ID;
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Task2 {
    static ArrayList<Student>  student=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void add_student(){
        System.out.print("Enter Student ID :");
        int ID = sc.nextInt();
        System.out.print("Enter Student Name :");
        String name = sc.next();
        System.out.print("Enter Student marks :");
        float marks = sc.nextFloat();
        student.add(new Student(ID,name,marks));
        System.out.println("Student details added successfully!!");
    }
    public static void read_student_data(){
        System.out.println("--- Student List ---");
        for (Student s : student) {
            System.out.println(s);
        }
    }
    static void update_student_data() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (Student s : student) {
            if (s.ID == id) {
                boolean updating = true;
                while (updating) {
                    System.out.println("What do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Marks");
                    System.out.println("3. Both");
                    System.out.println("4. Cancel");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter new Name: ");
                            s.name = sc.next();
                            System.out.println("Name updated successfully.");
                            break;
                        case 2:
                            System.out.print("Enter new Marks: ");
                            s.marks = sc.nextFloat();
                            System.out.println("Marks updated successfully.");
                            break;
                        case 3:
                            System.out.println("Enter new Name: ");
                            s.name = sc.next();
                            System.out.println("Enter new Marks: ");
                            s.marks = sc.nextFloat();
                            System.out.println("Name and Marks updated successfully.");
                            break;
                        case 4:
                            updating = false;
                            System.out.println("Update cancelled.");
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }

                    if (choice >= 1 && choice <= 3) {
                        updating = false;
                    }
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void delete_student_data() {
        System.out.println("Delete Options:");
        System.out.println("1. Delete  ID");
        System.out.println("2. Delete  Name");
        System.out.println("3. Cancel");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                for (Student s : student) {
                    if (s.ID == id) {
                        student.remove(s);
                        System.out.println("Student with ID " + id + " deleted successfully.");
                        return;
                    }
                }
                System.out.println("Student with ID " + id + " not found.");
                break;

            case 2:
                System.out.print("Enter Name to delete: ");
                String name = sc.next();
                for (Student s : student) {
                    if (s.name.equalsIgnoreCase(name)) {
                        student.remove(s);
                        System.out.println("Student with name '" + name + "' deleted successfully.");
                        return;
                    }
                }
                System.out.println("Student with name '" + name + "' not found.");
                break;

            case 3:
                System.out.println("Delete operation cancelled.");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void main(String[] args) {

        boolean crud_operation=true;
        int choice;
        while(crud_operation) {
            System.out.println("----  STUDENT MANAGEMENT SYSTEM  ----");
            System.out.println("1. Add student");
            System.out.println("2. Read student data");
            System.out.println("3. Update student data");
            System.out.println("4. Delete student data");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add_student();
                    break;
                case 2:
                    read_student_data();
                    break;
                case 3:
                    update_student_data();
                    break;
                case 4:
                    delete_student_data();
                    break;
                case 5:
                    crud_operation = false;
                    System.out.println("Exiting program!!!");
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }

    }
}
