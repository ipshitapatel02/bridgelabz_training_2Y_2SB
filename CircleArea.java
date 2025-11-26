package class_object;

import java.util.Scanner;

class CircleArea {
    double r;
    double getArea() {
    		double A= 3.14 * r * r;
        return A;
    }
    double getCircumference() {
    		double C=2 * 3.14 * r;
        return C;
    }
    void display() {
        System.out.println("Radius: " + r);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        CircleArea c = new CircleArea();
        c.r = sc.nextDouble();
        c.display();
        sc.close();
    }
}
