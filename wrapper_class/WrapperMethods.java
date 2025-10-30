package wrapper_class;

public class WrapperMethods {
    public static void main(String[] args) {
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("3.14");
        boolean booleanVal = Boolean.parseBoolean("true");
        String binaryStr = Integer.toBinaryString(10);
        boolean isDig = Character.isDigit('5');
        char upChar = Character.toUpperCase('a');
        System.out.println("Integer.parseInt(\"123\") = " + intVal);
        System.out.println("Double.parseDouble(\"3.14\") = " + doubleVal);
        System.out.println("Boolean.parseBoolean(\"true\") = " + booleanVal);
        System.out.println("Integer.toBinaryString(10) = " + binaryStr);
        System.out.println("Character.isDigit('5') = " + isDig);
        System.out.println("Character.toUpperCase('a') = " + upChar);
    }
}
