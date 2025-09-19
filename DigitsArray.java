package bridgelabz_assignment;

import java.util.Scanner;

public class DigitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            if (index == maxDigit) {
                System.out.println("Reached maximum digit limit (10). Remaining digits ignored.");
                break;
            }

            digits[index] = digit;
            index++;
        }
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest digit = " + secondLargest);
        } else {
            System.out.println("Second Largest digit = Not found (all digits are same)");
        }

        sc.close();
    }
}
