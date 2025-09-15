package bridgelabz_assignment;

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("The program works only for year >= 1582 (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println("Leap Year.");
            } else {
                System.out.println("Not a Leap Year.");
            }
        }
        sc.close();
    }
}
