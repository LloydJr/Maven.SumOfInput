/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        System.out.println("---Sum of Input---");
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int add = input.nextInt();

        for( int i = 1; i <= add; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
