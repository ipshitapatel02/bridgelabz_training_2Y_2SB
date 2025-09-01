package bridgelabz_assignment;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.next();
        System.out.println("\n--- Generating StringIndexOutOfBoundsException ---");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n--- Handling StringIndexOutOfBoundsException ---");
        handleException(userInput);
        sc.close();
    }
}
