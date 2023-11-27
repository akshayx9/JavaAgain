package ExceptionHandling;

public class InsufficientBalEx extends RuntimeException { // extending RuntimeException Class

    public InsufficientBalEx(String message) { // creating param constructor
        super(message);
    }
}
