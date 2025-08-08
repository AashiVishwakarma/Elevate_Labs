package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NOTES_APP {
    static String file_name = "notes.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notes = true;
        while (notes) {
            System.out.println(" ---- NOTES APP ---- ");
            System.out.println("1. Write note");
            System.out.println("2. Read note");
            System.out.println("3. Exit");
            System.out.print("Choose your option - ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Write your note : ");
                     String note=sc.nextLine();
                    write_note(note);
                    break;
                case 2:
                    read_note();
                    break;
                case 3:
                    notes = false;
                    System.out.println("Exiting from Notes App!!!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void write_note(String note) {
        try (FileWriter writer = new FileWriter(file_name, true)) {
            writer.write(note + "\n");
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }

    private static void read_note() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
            String line;
            System.out.println("Your Notes:");
            boolean empty = true;

            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
                empty = false;
            }
            if (empty) {
                System.out.println("No notes found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }

}