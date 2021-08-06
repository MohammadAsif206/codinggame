package staging.time.codinggame;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrintColorBasedOnGivenHexValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the RGB color preceded with #, eg. #FFFFFF");

        String s = in.nextLine();
        findColor(s);

        System.out.println("Please enter the string value: ");
        String str = in.nextLine();
        findThePattern(str);
        printOnlyUniqueNum();

        //status of a flight
        System.out.println("Please enter the scheduled arrival time in the format hh:mm:ss");
        String t = in.nextLine();
        System.out.println("Please enter the estimated arrival time in the format hh:mm:ss");
        String t2 = in.nextLine();
        reportTheStatusOfFlight(t, t2);


    }

    /**
     * #FFFFFF is the RGB hex-triplet colour format for the colour white, each pair of characters after the "#" represent the 2-hexit quantity of red, green or blue in the colour.
     * <p>
     * Here "FF" = 255 is at the maximum value of all three colours because "FF" in hexadecimal is 255. This colour is pure white. (Pure black is #000000)
     * <p>
     * #FF0000 is pure red, #00FF00 is pure green, #0000FF is pure blue.
     * <p>
     * Given an arbitrary input colour-code code, name the colour according to the relative proportions of red, green and blue. Colours can also be black, white, grey, magenta, cyan and yellow.
     * <p>
     * Convert the code into the three RGB values [0-255,0-255,0-255] and then follow the rules below:
     * If all values are < 10 then the colour is black
     * If all values are ≥ 245 then the colour is white
     * If one value is ≥ 10 and the other two are < 10 then the answer is the high-value colour (red, green or blue)
     * If two colours are ≥ 10 and the other is < 10 then the answer is a 'secondary' colour (follow the below rules for what 'secondary' colour is formed:
     * red + blue = magenta
     * red + green = yellow
     * blue + green = cyan
     * All other colours are then called grey. This applies when all three colours are ≥ 10 but the colour is not white.
     * Input
     * A colour-code: code (e.g. #0F0F0F)
     * Output
     * The colour's rough name (red, blue, green, cyan, magenta, yellow, white, grey or black)
     * Constraints
     * Input is always a 7 character string. A # followed by 6 hexadecimal digits in upper case.
     * Example
     * Input
     * #AF0000
     * Output
     * red
     *
     * @param s
     */
    public static void findColor(String s) {
        int r = 0, g = 0, b = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count <= 2) {
                sb1.append(s.charAt(i));
                count++;
            }
            if (2 < count && count <= 4) {
                sb2.append(s.charAt(i));
                count++;
            }
            if (4 < count && count <= 6) {
                sb3.append(s.charAt(i));
                count++;
            }
        }
        r = Integer.parseInt(String.valueOf(sb1), 16);
        g = Integer.parseInt(String.valueOf(sb2), 16);
        b = Integer.parseInt(String.valueOf(sb3), 16);
        //int i = Integer.parseInt(s,16);
        System.out.println(sb1 + " " + sb2 + " " + sb3);
        System.out.println(r + " " + g + " " + b);
        //black
        if (r < 10 && g < 10 && b < 10)
            System.out.println("black");
        else if (245 <= r && g >= 245 && b >= 245)
            System.out.println("white");
        else if (10 < r && g < 10 && b < 10)
            System.out.println("red");
        else if (r < 10 && b > 10 && g < 10)
            System.out.println("green");
        else if (r < 10 && g < 10 && b > 10)
            System.out.println("blue");
        else if (r < 10 && g > 10 && b > 10)
            System.out.println("cyan");
        else if (10 < r && g > 10 && b < 10)
            System.out.println("yellow");
        else if (10 < r && g < 10 && b > 10)
            System.out.println("magenta");
        else System.out.println("grey");

    }

    /**
     * Reverse problem.
     * input string: HI!, output: 0
     * input string: Hello My Name Is X, output: 9
     */
    public static void findThePattern(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i)) && Character.isLetter(s.charAt(i)))
                count++;
        }
        System.out.println("The answer is: " + count);
    }

    /**
     * The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
     * 01 Test 1
     * Input: 12234441
     * Expected output: 12341
     * 02 Test 2
     * Input: 1234
     * Expected output: 1234
     * 03 Test 3
     * Input: 0
     * Expected output: 0
     * 04 Test 4
     * Input: 11200000013333
     * Expected output: 12013
     */
    public static void printOnlyUniqueNum() {
        int num = 1120001333;
        String s = Integer.toString(num);

        char c = s.charAt(s.length() - 1);
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            }

        }
        list.forEach(n -> {
            System.out.print(n);
        });
        System.out.println(c);
    }

    /**
     * A flight was scheduled to arrive at a particular time and is now estimated to arrive at another time. Write a function that returns the flight's status : On time, early or delayed
     * Input
     * Line 1: scheduled time t for the flight to arrive (format: hh:mm:ss)
     * Line 2: estimated time t2 for the flight to arrive (format: hh:mm:ss)
     * Output
     * Line 1: "EARLY", "DELAYED" or "ON TIME" depending on the status of the flight
     * Constraints
     * 0:00:00 ≤ t ≤ 24:00:00
     * 0:00:00 ≤ t2 ≤ 24:00:00
     * Length of t and t2 = 8
     * Example
     * Input
     * 23:18:32
     * 22:19:40
     * Output
     * EARLY
     *
     * The method will calculate the scheduled arrival time and estimated arrival time
     * of a flight, and report if the flight is on time, delayed, or early
     * @param t
     * @param t2
     */
    public static void reportTheStatusOfFlight(String t, String t2) {

        String[] s = t.split(":");
        String[] s1 = t2.split(":");
        int sum = 0;
        int sum1 = 0;

        sum = (Integer.parseInt(s[0]) * 3600 + Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]));
        sum1 = (Integer.parseInt(s1[0]) * 3600 + Integer.parseInt(s1[1]) * 60 + Integer.parseInt(s1[2]));
        if (sum < sum1)
            System.out.println("DELAYED");
        if (sum == sum1)
            System.out.println("ON TIME");
        if (sum > sum1)
            System.out.println("EARLY");

    }
}




