package staging.time.codinggame;

import java.util.Scanner;

public class SwapCharInEvenPositionWithTheNextOne {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        // first solution
        swapCharInEvenPosWithTheNextChar(s);
        // second solution
        swapCharInEvenPosWithTheNextChar1(s);
        //print value of n in different types based on the msg command
        printNBasdedOnCommandMsg(15,"D");
    }

    public static void swapCharInEvenPosWithTheNextChar(String s) {
        char[] c = s.toCharArray();
        char temp;
        for (int i = 1; i < c.length; i += 2) {
            if (i + 1 < c.length) {
                temp = c[i];
                c[i] = c[i + 1];
                c[i + 1] = temp;
            }
        }
        String str = new String(c);
        System.out.println("The value before swapping: " + s);
        System.out.println("The value after swapping: " + str);
    }

    /**
     * the method will swap the char in even position with the one
     * next to it
     * @param S
     */
    public static void swapCharInEvenPosWithTheNextChar1(String S) {
        System.out.println("The value before swapping: " + S);
        System.out.print("The value after swapping: ");
        for (int i = 0; i < S.length(); i += 2) {
            if (i + 1 < S.length()) {
                System.out.print(S.charAt(i + 1));
            }
            System.out.print(S.charAt(i));
        }

    }

    /**
     * the mehtod will get n value and based on the msg value
     * will print the value of n, the commands are: +,-,H,B,O,D
     * @param n
     * @param msg
     */
    public static void printNBasdedOnCommandMsg(int n,String msg){
        if(msg.equals("H")){
            n++;
        }if(msg.equals("-")){
            n--;
        }if(msg.equals("H")){
            System.out.println("\nValue of n in Hex: "+Integer.toHexString(n));
        }
        if(msg.equals("B")){
           //String bin = Integer.toBinaryString(n);
            System.out.println("\nValue of n in Binary: "+Integer.toBinaryString(n));

        }
        if(msg.equals("O")){
            //Integer.toOctalString(n);
            System.out.println("\nValue of n in Octal: "+Integer.toOctalString(n));
        }
        if(msg.equals("D")){
            System.out.println("\nValue of n in decimal: "+(double)n);

        }
        System.out.println("\nValue of n: "+n);



    }

}
