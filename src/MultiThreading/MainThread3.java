package MultiThreading;

public class MainThread3 {
    public static void main(String[] args) throws InterruptedException {
        ChildThread3 t = new ChildThread3();
        t.start();
        synchronized (t) {
            System.out.println("Main Thread is calling wait...");
            t.wait();
            System.out.println("Main Thread got notification");
            System.out.println(t.total);
        }
    }
}
