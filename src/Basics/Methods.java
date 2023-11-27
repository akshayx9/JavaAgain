package Basics;

public class Methods {
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void mul(int x, int y) {
        System.out.println("MUL=" + (x * y));
    }

    public static void main(String[] args) {
        Methods c = new Methods();
        System.out.println(c.add(100, 100));// Instance method call requires creation of object
        Methods.mul(10, 10);// Static method can be called directly
    }
}
