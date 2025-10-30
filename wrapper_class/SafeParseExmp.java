package wrapper_class;

public class SafeParseExmp {
	public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        String[] tests = {"123", "abc", "45.6", "0"};
        for (String value : tests) {
            System.out.println("Input: " + value + " -> Output: " + safeParseInt(value));
        }
    }
}