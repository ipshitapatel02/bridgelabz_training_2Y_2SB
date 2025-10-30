package wrapper_class;

public class BankLimitCheck {
    public static double getRemainingLimit(Double limit) {
        if (limit == null) {
            return 0.0;
        }
        return limit;
    }
    public static void main(String[] args) {
        Double newAccountLimit = 5000.0;
        Double oldAccountLimit = null;
        double primitiveLimit = 3000.0;
        System.out.println("New Account: " + getRemainingLimit(newAccountLimit));
        System.out.println("Old Account: " + getRemainingLimit(oldAccountLimit));
        System.out.println("Primitive Account: " + getRemainingLimit(primitiveLimit));
    }
}
