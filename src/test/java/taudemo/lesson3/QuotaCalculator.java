package taudemo.lesson3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision on the path to take - Output
        if(sales >=quota)
            System.out.println("Congrats!");
        else {
            int salesShort = quota - sales;
            System.out.println("You need " + salesShort + " more");
        }
    }
}
