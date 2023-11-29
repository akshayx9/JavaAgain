package Assignments.Assignment_6;

public class Employee {
    long employeeId;
    String employeeName, employeeAddress;
    Long employeePhone;
    double basicSalary, specialAllowance = 250.80, hra = 1000.50;

    Employee(long id, String name, String address, Long phone) {
        id = employeeId;
        name = employeeName;
        address = employeeAddress;
        phone = employeePhone;
    }

    Employee() {
    }

    public void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println(salary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = (10 * basicSalary) / 100;
        System.out.println(transportAllowance);
    }
}
