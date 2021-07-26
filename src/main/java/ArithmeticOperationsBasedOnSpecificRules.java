import java.util.Arrays;

public class ArithmeticOperationsBasedOnSpecificRules {
    public static void main(String[] args) {
        /**
         * Given a list of values for "teeth" in a key, determine the arithmetic operations
         * and final result based on the following rule set:
         * Compare the first two values, then compare the result with the third, and so on.
         * Example key(read left to right) 1 7 2 5 <-- value A would be 1, value B would be 7
         * - If A is greater than B, SUBTRACT
         * - if B is greater than or equal A, ADD, but only if both values are odd, or both are even.
         * Otherwise MULTIPLY
         * - if at ANY time B is a divisor of A, DIVIDE
         * - A pin is never valued at 0
         * - At no time will the result of an equation be 1 or 0
         * Example:
         * 1 7 2 5 <-- 1 and 7 are compared and added to make 8
         * 8 and 2 are compared and divided to make 4
         * 4 and 5 are compared and multiplied, and the final result is 20
         * Input
         * - A single integer n stating the number of pins
         * - A string x listing each pin value, space separated
         * Example Input:
         * 4
         * 1 7 2 3
         * Output
         * A single line listing the arithmetic operators used to the final result,
         * followed by the final result, space separated
         * Example Output:
         * +/- 20
         * Constraints
         * 4<=N<=10
         * 0<Pin Value<10
         * Example
         * Input
         * 4
         * 1 5 9 4
         * Output
         */
        int n = 4;
        String s = "1 7 2 3";
        String [] sp = s.split(" ");

        Object[] c = Arrays.stream(sp).toArray();

        System.out.println(sp.length);
        StringBuilder sb = new StringBuilder();
        int val = 0;
        int a, b;
        for(int i = 0; i<n; i+=2){
            for(int j = 1; j<n+1; j+=2){
                a = Integer.parseInt(sp[i]);
                b = Integer.parseInt(sp[j]);
                if(a > b){
                    val+=(a-b);
                    sb.append("-");
                }
                //if B is greater than or equal A, ADD, but only if both values are odd, or both are even.
                else if(b >= b &&((a%2 == 0 && b%2 == 0) || (a%2 != 0 && b%2 != 0))){
                    val+=(a+b);
                    sb.append("+");
                }else{
                    val+= (a*b);
                    sb.append("*");
                }
            }
        }
        System.out.println(sb+" "+val);

    }

    /**
     * A web color is represented by a number sign #, followed by three bytes, each of them represented by two hexadecimal digits, which are the rate of each Red, Green and Blue color (between 0 and 255).
     * You are given a hexadecimal triplet, and you have to return the value of each RGB color rate.
     * Input
     * Line 1: A hexadecimal triplet (three bytes, one per color): #RRGGBB
     * Output
     * Line 1: The red rate (0-255) in base 10
     * Line 2: The green rate (0-255) in base 10
     * Line 3: The blue rate (0-255) in base 10
     * Constraints
     * Each input character (excepted #) is a hexadecimal digit (0-9, A-F)
     * Example
     * Input
     * #FF0000
     * Output
     * 255
     * 0
     * 0
     * @param args
     */

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String color = in.nextLine();
        StringBuilder sb = new StringBuilder(color);
        int val = 0;
        for(int i = 0; i<color.length(); i++){
            val += Integer.valueOf(sb.charAt(i), 16);

            System.out.println(val);


        }

    }
    /**
     * The Collatz conjecture is a opened mathematics problem: given a number N, the repetition of the following operation will always eventually reach the loop 1 ⇒ 4 ⇒2 ⇒1 ...
     * * If N is even, N becomes N/2
     * * If N is odd, N becomes 3*N+1
     *
     * Can you try it with the given numbers and print the number of steps it took to reach 1?
     * Input
     * A starting number N
     * Output
     * The number of steps to reach 1
     * Constraints
     * 0 < N <=10^12
     * Example
     * Input
     * 16
     * Output
     * 4
     */
    class Solution {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            long N = in.nextLong();
            int count=0;
            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            while(N!=1){
                if(N%2==0){
                    N=N/2;
                    count++;
                }
                else{
                    N=3*N+1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }



}
