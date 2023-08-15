package gr.aueb.cf.exceptions;

public class InsufficientBalanceException extends Exception{
    private static final long serialVersionUID = 1L;

    // προβληματικό διότι δεν εχει πληροφορια
    public InsufficientBalanceException() {}

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance " + balance + " for amount " + amount);
    }

}
