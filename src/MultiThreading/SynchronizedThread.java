package MultiThreading;

public class SynchronizedThread {
    public static void main(String[] args) {
        Display d = new Display();
        ChildThread2 t1 = new ChildThread2(d, "task1");
        ChildThread2 t2 = new ChildThread2(d, "task2");
        t1.start();
        t2.start();
    }
}
