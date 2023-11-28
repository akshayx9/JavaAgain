package MultiThreading;

public class ChildThread2 extends Thread {
    Display d;
    String name;

    public ChildThread2(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.print(name);
    }
}
