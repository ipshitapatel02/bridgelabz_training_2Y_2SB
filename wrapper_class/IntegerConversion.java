package wrapper_class;

import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        Integer objNum = Integer.valueOf(num);
        System.out.println("Primitive value: " + num);
        System.out.println("Object value: " + objNum);
        sc.close();
    }
}
