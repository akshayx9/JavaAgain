package Assignments.Assignment_6;

public class Manager extends Employee {
    Manager(long id, String name, String address, Long phone, double salary) {
        super.employeeId = id;
        super.employeeName = name;
        super.employeeAddress = address;
        super.employeePhone = phone;
        super.basicSalary = salary;
    }

    public void calculateTransportAllowance() {
        double transportAllowance = (15 * basicSalary) / 100;
        System.out.println(transportAllowance);
    }
}
