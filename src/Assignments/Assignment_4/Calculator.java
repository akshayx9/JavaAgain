package Assignments.Assignment_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option;

        do {
            System.out.println("Enter Option:\n" + "Add-1\n" + "Subtract-2\n" + "Multiply-3\n" + "Quit-4\n");
            option = s.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter two numbers to be added:");
                    int x = s.nextInt();
                    int y = s.nextInt();
                    System.out.println("The result is " + (x + y));
                    break;
                }
                case 2: {
                    System.out.println("Enter two number to be subtracted:");
                    int x = s.nextInt();
                    int y = s.nextInt();
                    System.out.println("The result is " + (x - y));
                    break;
                }
                case 3: {
                    System.out.println("Enter two numbers to be multiplied:");
                    int x = s.nextInt();
                    int y = s.nextInt();
                    System.out.println("The result is " + (x * y));
                    break;
                }
                case 4: {
                    System.out.println("Exiting Program...");
                    break;
                }
                default: {
                    System.out.println("Invalid input!!");
                    break;
                }
            }
        } while (option != 4);
        s.close();
        System.exit(0);
    }
}
