package Assignments.Assignment_8;

public class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal) {

        double taxAmount;
        if (isIndian == false) {
            CountryNotValidEx ex = new CountryNotValidEx(
                    "Country not valid:  The employee should be an Indian citizen for calculating tax");
            throw ex;
        }

        if (empName == null || empName.isEmpty() == true) {
            EmployeeNameInvalidEx ex1 = new EmployeeNameInvalidEx(
                    "Employee name not valid:  The employee name cannot be empty");
            throw ex1;
        }

        if (empSal > 100000 && isIndian == true) {
            taxAmount = (empSal * 8) / 10;
        } else if (empSal > 50000 && isIndian == true) {
            taxAmount = (empSal * 6) / 100;
        } else if (empSal > 30000 && isIndian == true) {
            taxAmount = (empSal * 5) / 100;
        } else if (empSal > 10000 && isIndian == true) {
            taxAmount = (empSal * 4) / 100;
        } else {
            TaxNotEligibleEx ex2 = new TaxNotEligibleEx(
                    "Not eligible for Tax calculation:  The employee does not need to pay tax");
            throw ex2;
        }

        return taxAmount;
    }
}
