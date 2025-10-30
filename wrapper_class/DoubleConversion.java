package wrapper_class;

public class DoubleConversion {
    public static void main(String[] args) {
        Double ob = 45.67;
        double primitiveDouble = ob;
        int primitiveInt = (int) primitiveDouble;
        System.out.println("Double object: " + ob);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int: " + primitiveInt);
    }
}
