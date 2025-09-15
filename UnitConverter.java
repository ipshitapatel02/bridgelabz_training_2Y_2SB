package bridgelabz_assignment;

import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for conversion: ");
        double value = sc.nextDouble();
        System.out.println("\nConversions for value " + value + ":");
        System.out.println(value + " km = " + convertKmToMiles(value) + " miles");
        System.out.println(value + " miles = " + convertMilesToKm(value) + " km");
        System.out.println(value + " meters = " + convertMetersToFeet(value) + " feet");
        System.out.println(value + " feet = " + convertFeetToMeters(value) + " meters");
        sc.close();
    }
}
