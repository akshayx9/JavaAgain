package Assignments.Assignment_6;

public class InheritanceActivity {
    public static void main(String[] args) {
        Manager m = new Manager(126534l, "Peter", "Chennai, India", 237844l, 65000);
        m.calculateSalary();
        m.calculateTransportAllowance();

        Trainee t = new Trainee(29846l, "Jack", "Mumbai, India", 442085l, 45000);
        t.calculateSalary();
        t.calculateTransportAllowance();
    }
}
