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
        ;
    }

    /**
     * The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
     * 01 Test 1
     * Input
     * Expected output
     * 0x7f000001
     * 127.0.0.1
     * 02 Test 2
     * Input
     * Expected output
     * 0xc0a80001
     * 192.168.0.1
     * 03 Test 3
     * Input
     * Expected output
     * 0x77777777
     * 119.119.119.119
     * 04 Test 4
     * Input
     * Expected output
     * 0x00000000
     * 0.0.0.0
     * 05 Test 5
     * Input
     * Expected output
     * 0xffffffff
     * 255.255.255.255
     */
    /**
     * The method will convert hex value of IPv4 and print it in decimal do notation
     * @param hex
     */
    public static void IPv4IsInHexPrintInDecimalDotNotation(String hex){
        String val="";
        int count = 0;
        for(int i = 2; i<hex.length(); i+=2){
            val+= Integer.valueOf(hex.substring(i, i+2), 16);
            if(count<3) {
                val+= ".";
                count++;
            }
        }
        System.out.println(val);
    }
}
