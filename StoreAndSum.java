package bridgelabz_assignment;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }
            numbers[index] = num;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.print("\nNumbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);

        sc.close();
    }
}
