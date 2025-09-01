package bridgelabz_assignment;

import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        int customLength = findLength(text);
        int builtInLength = text.length();
        System.out.println("\n--- Results ---");
        System.out.println("Original text: " + text);
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);

        sc.close();
    }
}
