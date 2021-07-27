package staging.time.codinggame;

import java.util.Scanner;

/**
 *You have a sum and difference of two numbers. Your task is to find these numbers.
 * Input
 * Line 1: An integer sum of these numbers.
 * Line 2: An integer difference of these numbers.
 * Output
 * Line 1 : First number (smaller)
 * Line 2 : Second number
 * Constraints
 * -100 ≤ sum,difference ≤ 150
 * Example
 * Input
 * 92
 * 16
 * Output
 * 38
 * 54
 *
 * Note: codinggame challenge for 07/27/2021
 */

public class FindSumAndDifOfTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first digit:");
        int sum = scanner.nextInt();
        System.out.println("Please enter the second digit: ");
        int dif = scanner.nextInt();
        int a =  (sum + dif) / 2;
        System.out.println("The bigest number : " + a);
        System.out.println("The smallest number is : " + (sum - a));
    }
}
