package Assignments.Assignment_2;

public class EmployeeTax extends TaxCalculator{
    public static void main(String[] args) {

        //case 1
        EmployeeTax t1=new EmployeeTax();
        t1.citizenship=true;
        t1.basicSalary=25000;
        t1.calculateTax();
        t1.deductTax();
        t1.validateSalary();

        //case 2
        EmployeeTax t2=new EmployeeTax();
        t2.citizenship=true;
        t2.basicSalary=125000;
        t2.calculateTax();
        t2.deductTax();
        t2.validateSalary();
    }
}
