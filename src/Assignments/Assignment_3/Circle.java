package Assignments.Assignment_3;

//Find Area and Circumference of a Circle

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        
        double radius, circumference, diameter, area;
        Scanner s=new Scanner(System.in);
        
        //options
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        System.out.println("Enter your choice:");

        //taking an option as input
        int option=s.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                radius=s.nextDouble();
                s.close();
                area=Math.PI*(radius*radius);
                circumference=2*Math.PI*radius;
                System.out.println("The area of the circle is: "+area);
                System.out.println("The circumference of the circle is: "+circumference); 
                break;
            
            case 2:
                System.out.println("Enter the diameter of the circle:");
                diameter=s.nextDouble();
                s.close();
                area=Math.PI*(diameter*diameter)/4;
                circumference=Math.PI*diameter;
                System.out.println("The area of the circle is: "+area);
                System.out.println("The circumference of the circle is: "+circumference); 
                break;

            case 3:
                System.out.print("Enter the circumference of the circle: ");
                circumference=s.nextDouble();
                s.close();
                area=(circumference*circumference)/(4*Math.PI);
                System.out.println("The area of the circle is: "+area);
                System.out.println("The circumference of the circle is: "+circumference);
                break;
            
            default:
                System.out.println("invalid choice!");
                s.close();
        }
    }
    
}
