package MultiThreading;

public class ChildThread3 extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child Thread is starting...");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child Thread giving notification");
            this.notify();
        }
    }
}
