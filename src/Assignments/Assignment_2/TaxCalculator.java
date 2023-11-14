package Assignments.Assignment_2;

public class TaxCalculator {
    float basicSalary;
    boolean citizenship;
    float tax;

    public void calculateTax(){
        tax=30*basicSalary/100;
        System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
    }

    public void deductTax(){
        float dt=basicSalary-tax;
        int nettSalary=(int)dt;
        System.out.println("The nett salary of the employee is "+nettSalary);
    }

    public void validateSalary(){
        if(basicSalary>100000 && citizenship==true){
            System.out.println("The salary and citizenship eligibility: true");
        } else{
            System.out.println("The salary and citizenship eligibility: false");

        }
    }
}
