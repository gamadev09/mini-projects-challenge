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

            // convert priority to text
            String priorityText;
            switch (priority) {
                case 1:
                    priorityText = "LOW";
                    break;
                case 2:
                    priorityText = "MEDIUM";
                    break;
                case 3:
                    priorityText = "HIGH";
                    break;
                default:
                    priorityText = "UNKNOWN"; // if he enters a number outside of 1-3
            }

            // generate random id
            Random ticketid = new Random();
            int ticketId = ticketid.nextInt(9000) + 1000;
            // print ticket
            System.out.println("Ticket ID: " + ticketId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Priority: " + priorityText);
            System.out.println("Your ticket has been created successfully!, thanks you for using our services");
        }
    }
}