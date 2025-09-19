package bridgelabz_assignment;

import java.util.Scanner;

public class NumberCheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.print("\nComparison of first and last element: ");
        if (first == last) {
            System.out.println("Both are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
