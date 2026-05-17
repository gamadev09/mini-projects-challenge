import java.util.Scanner;
import java.util.Random;
public class ticket_generator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // variables
            String name;
            String department;
            int priority;
            // user input
            System.out.println("Type your name:");
            name = input.nextLine();
            System.out.println("Type your department:");
            department = input.nextLine();
            System.out.println("Type the priority of your issue (1-3):");
            priority = input.nextInt();
            input.nextLine(); // consume the newline character
            // generate random id
            Random ticketid = new Random();
            int ticketId = ticketid.nextInt(9000) + 1000;
            // print ticket
            System.out.println("Ticket ID: " + ticketId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Priority: " + priority);
        }
    }
}