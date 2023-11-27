package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("1.Open the connection");
            System.out.println("2.Perform all operations");
            System.out.println(10 / 0);
        } catch (Exception ex) {
            System.out.println("Exception Occurred-->" + ex.toString());
        } finally {
            System.out.println("3.Closing the connection");// finally block is used to execute important code such as
                                                           // closing the connection, because finally block is always
                                                           // executed whether an exception is handled or not.
        }
    }
}
