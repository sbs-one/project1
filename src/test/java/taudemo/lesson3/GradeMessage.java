package taudemo.lesson3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){

        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Good job";
                break;
            case "C":
                message = "Not bad";
                break;
            default:
                message = "Error";
                break;
        }

        System.out.println(message);
    }
}
