package exception_handling;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class ATM {
    private int balance = 10000;
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed, Insufficient balance");
        } else {
            System.out.println("Withdrawal successful");
        }
    }
}
public class Insufficient_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        try {
            atm.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
