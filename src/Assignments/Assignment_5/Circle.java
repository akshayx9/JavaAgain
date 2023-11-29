package Assignments.Assignment_5;

public class Circle {
    private float radius;
    protected float pi = 3.5f;

    public Circle() {
        radius = 1.5f;
        System.out.println(radius);
    }

    protected Circle(float radius) {
        this(10.0f, 3.5f);
        this.radius = radius;
    }

    private Circle(float radius, float pi) {
        this.radius = radius;
    }

    public float calculateCircleArea(float radius) {
        float area = pi * radius * radius;
        return area;
    }

    public float calculateCircumference(float radius) {
        float circumference = 2 * pi * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle cc = new Circle();
        System.out.println("Area of the Circle is " + cc.calculateCircleArea(10.0f));
        System.out.println("Circumference of the Circle is " + cc.calculateCircumference(10.0f));
    }
}
