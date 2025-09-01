package bridgelabz_assignment;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String userInput = sc.next();

        System.out.println("\n--- Generating NumberFormatException ---");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n--- Handling NumberFormatException ---");
        handleException(userInput);

        sc.close();
    }
}
