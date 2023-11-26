package oops.Inheritance;

public class OverridingC extends OverridingP {

    public void add(int x, int y) {
        System.out.println("ADD=" + (x + y + 100));
    }

    public static void main(String[] args) {

        // case 1
        OverridingP p1 = new OverridingP();
        p1.add(100, 100);// 200

        // case 2
        OverridingC c = new OverridingC();
        c.add(100, 100);// 300

        // case 3
        OverridingP p2 = new OverridingC();
        p2.add(100, 100);
    }
}
