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
        int outPut1 = (sum-dif)/2;
        int outPut2 = sum-outPut1;
        if((-100 <= sum && sum <=150) && (-100 <=dif && dif<=150)) {
            if (outPut1 < sum) {
                System.out.println(outPut1 + "\n" + outPut2);
            } else {
                System.out.println(outPut2 + "\n" + outPut1);
            }
        }
        
    }
}
