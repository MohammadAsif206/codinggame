package staging.time.codinggame;

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

    }
    /**
     * #FFFFFF is the RGB hex-triplet colour format for the colour white, each pair of characters after the "#" represent the 2-hexit quantity of red, green or blue in the colour.
     *
     * Here "FF" = 255 is at the maximum value of all three colours because "FF" in hexadecimal is 255. This colour is pure white. (Pure black is #000000)
     *
     * #FF0000 is pure red, #00FF00 is pure green, #0000FF is pure blue.
     *
     * Given an arbitrary input colour-code code, name the colour according to the relative proportions of red, green and blue. Colours can also be black, white, grey, magenta, cyan and yellow.
     *
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
    public static void findColor(String s){
        int r = 0, g =0, b = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int count = 1;
        for(int i = 1; i<s.length(); i++){
            if(count <= 2) {
                sb1.append(s.charAt(i));
                count++;
            }
            if(2<count && count <=4){
                sb2.append(s.charAt(i));
                count++;
            }
            if(4<count && count <=6){
                sb3.append(s.charAt(i));
                count++;
            }
        }
        r = Integer.parseInt(String.valueOf(sb1), 16);
        g = Integer.parseInt(String.valueOf(sb2), 16);
        b = Integer.parseInt(String.valueOf(sb3), 16);
        //int i = Integer.parseInt(s,16);
        System.out.println(sb1+" "+sb2+" "+sb3);
        System.out.println(r+" "+g+" "+b);
        //black
        if(r < 10 && g < 10 && b < 10)
            System.out.println("black");
        else if(245<=r && g >= 245 && b>=245)
            System.out.println("white");
        else if( 10< r && g < 10 && b<10)
            System.out.println("red");
        else if(r <10 && b>10 && g<10)
            System.out.println("green");
        else if(r<10 && g<10 && b>10)
            System.out.println("blue");
        else if(r<10 && g>10 && b>10)
            System.out.println("cyan");
        else if(10<r && g>10 && b<10)
            System.out.println("yellow");
        else if(10 < r && g < 10 && b > 10)
            System.out.println("magenta");
        else System.out.println("grey");

    }
    /**
     * Reverse problem.
     * input string: HI!, output: 0
     * input string: Hello My Name Is X, output: 9
     */
    public static void findThePattern(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i)) && Character.isLetter(s.charAt(i)))
                count++;
        }
        System.out.println("The answer is: "+count);
    }

}
