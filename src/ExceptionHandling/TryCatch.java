package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Exception occurred..." + (10 / 2));
            ex.printStackTrace();// prints the entire info about the exception including the line index
            System.out.println(ex.toString()); // just provides the exception name & message
            // We can also use - System.out.println(ex); - above, as it would call the
            // toString() internally
            System.out.println(ex.getMessage());// just provides the exception message
        }
        System.out.println("Statement 3");

        try {
            String s = "abc";
            s.charAt(10);
        } catch (Exception e) // we can have mutiple catch blocks in a single try-catch & we can also use
                              // "Exception e" to include all exceptions
        {
            System.out.println("Exception-->" + e.toString());
        }
        System.out.println("Statement 4");
    }
}
