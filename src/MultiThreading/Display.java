package MultiThreading;

public class Display {
    public synchronized void print(String task) {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            System.out.println(task);
        }
    }
}
