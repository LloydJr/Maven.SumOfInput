/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello! Welcome to an only addition calculator.\nBelow when you enter two numbers, you should be able to get the sum of both numbers.\nIf you enter in anything that is not a number, you will exit the calculator.");

        int sum;

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int add = scan.nextInt();

            System.out.print("Enter the second number: ");
            int numb = scan.nextInt();
            sum = add + numb;
            System.out.println("The sum is: " + sum + " Enter any letter key to exit.");
        }
    }
}
