package oops.AbstractClasses;

public class AbstractCar extends AbstractVehicle {
    public void noOfWheels() {
        System.out.println("4 Wheels");
    }

    public void speed() {
        System.out.println("100 KMPH");
    }

    public static void main(String[] args) {
        AbstractCar c = new AbstractCar();
        c.noOfWheels();// 4
        c.speed();// 100
    }

}
