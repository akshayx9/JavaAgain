package oops.AbstractClasses;

public class AbstractBike extends AbstractVehicle {
    public void noOfWheels() {
        System.out.println("2 Wheels");
    }

    public static void main(String[] args) {
        AbstractBike b = new AbstractBike();
        b.noOfWheels();// 2
        b.speed();// 60
    }
}