package wrapper_class;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int letterCount = 0;
        int digitCount = 0;
        int specialCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } 
            else if (Character.isDigit(ch)) {
                digitCount++;
            } 
            else if (!Character.isWhitespace(ch)) {
                specialCount++;
            }
        }
        System.out.println("Total Letters: " + letterCount);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Special Characters: " + specialCount);
        sc.close();
    }
}
