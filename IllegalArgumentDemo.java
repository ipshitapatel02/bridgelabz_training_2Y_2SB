package bridgelabz_assignment;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.next();
        System.out.println("\n--- Generating IllegalArgumentException ---");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n--- Handling IllegalArgumentException ---");
        handleException(userInput);

        sc.close();
    }
}
