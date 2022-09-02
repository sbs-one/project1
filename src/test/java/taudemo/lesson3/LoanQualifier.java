package taudemo.lesson3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args){

        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmpoloyed = 2;

        //Get what we don't know
        System.out.println("Enter salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter years");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmpoloyed){
                System.out.println("Congrats!");
            }
            else{
                System.out.println("Sorry you need more years");
            }
        }
        else{
            System.out.println("Sorry you need more salary");
        }
    }
}
