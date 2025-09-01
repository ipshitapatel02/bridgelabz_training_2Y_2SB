package bridgelabz_assignment;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
        handleException(names);

        sc.close();
    }
}
