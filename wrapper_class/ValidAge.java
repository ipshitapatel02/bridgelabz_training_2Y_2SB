package wrapper_class;

import java.util.Scanner;

public class ValidAge {
    public static boolean isValidAdult(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();
        if (isValidAdult(input)) {
            System.out.println("Valid age. You are eligible.");
        } else {
            System.out.println("Invalid age or under 18. Not eligible.");
        }
        sc.close();
    }
}
