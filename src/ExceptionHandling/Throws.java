package ExceptionHandling;

public class Throws {
    public static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(6000);
    }

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
}
