package Assignments.Assignment_11;

public class Student {

    Double Fees;

    public void calculateFeesStructure(Long studentId, Character studentGrade, Double monthlyFees,
            Boolean isScholarshipEligible) {

        if (studentId != 0 && studentGrade == 'A' && isScholarshipEligible == true) {
            Fees = monthlyFees - (monthlyFees * 10) / 100;
            System.out.println("10% fees is exempted, the calculated fees is " + Fees.intValue());
        } else if (studentId != 0 && studentGrade == 'B' && isScholarshipEligible == true) {
            Fees = monthlyFees - (monthlyFees * 8) / 100;
            System.out.println("8% fees is exempted, the calculated fees is " + Fees.intValue());
        } else if (studentId != 0 && studentGrade == 'C' && isScholarshipEligible == true) {
            Fees = monthlyFees - (monthlyFees * 6) / 100;
            System.out.println("6% fees is exempted, the calculated fees is " + Fees.intValue());
        } else if (studentId != 0 && studentGrade == 'D' && isScholarshipEligible == true) {
            Fees = monthlyFees - (monthlyFees * 4) / 100;
            System.out.println("4% fees is exempted, the calculated fees is " + Fees.intValue());
        } else {
            System.out.println("Not Eligible for Exemption");
        }
    }

    public static void main(String[] args) {

        Student s = new Student();

        // Test Case 1
        s.calculateFeesStructure(Long.valueOf(234), Character.valueOf('C'), Double.valueOf(600),
                Boolean.valueOf(true));

        // Test Case 2
        s.calculateFeesStructure(Long.valueOf(115), Character.valueOf('B'), Double.valueOf(909.50),
                Boolean.valueOf(true));

        // Test Case 3
        s.calculateFeesStructure(Long.valueOf(980), Character.valueOf('G'), Double.valueOf(1810),
                Boolean.valueOf(false));
    }
}
