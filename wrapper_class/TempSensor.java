package wrapper_class;

public class TempSensor {
    public static void logTemp(Double temp) {
        System.out.println("Stored Temperature (Double): " + temp);
    }
    public static double readTemp(Double temp) {
        return temp;
    }
    public static void main(String[] args) {
        double primTemp = 36.5;
        Double objectTemp = 40.2;
        logTemp(primTemp);
        logTemp(objectTemp);
        double t1 = readTemp(objectTemp);
        System.out.println("Read Temperature (double): " + t1);
        double t2 = readTemp(primTemp);
        System.out.println("Read Temperature (double): " + t2);
    }
}
