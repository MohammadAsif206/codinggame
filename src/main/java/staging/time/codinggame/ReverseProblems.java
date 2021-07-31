package staging.time.codinggame;

import java.util.Scanner;

public class ReverseProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the value that whose longest consecutive zeros be counted: ");
        String s = in.nextLine();
        //print count of zeros in a string
        reverseOne(s);

        //find the total of alphabet positional value of a word
        System.out.println("Please enter the word that want its " +
                "positional value are counted and added:");
        String word = in.nextLine();
        calculatePositionalValueOfAlphabetsInAWord(word);


    }

    /**
     * The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
     * 01
     *
     * Test 1
     * Input
     * Expected output
     * 100020300001
     * 4
     * 02
     *
     * Test 2
     * Input
     * Expected output
     * 1000000000
     * 9
     * 03
     *
     * Test 3
     * Input
     * Expected output
     * 0
     * 1
     *
     * the method will print the count of zeros in a string; it only print the longest consecutive zeros
     * not all the zeros present in a string
     * @param s
     */
    public static void reverseOne(String s){
        int count = 0;
        int max = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(max);
    }

    /**
     * the method will calculate the positional value of English alphabet in a word.
     * @param word
     *
     * Remembering my network/information security instructor, saying that 'knowledge' makes
     * someone 96% good enough, 'hardwork' 98% good enough but it is 'attitude' that makes
     * someone 100% good enough
     */

    public static void calculatePositionalValueOfAlphabetsInAWord(String word){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for(int i = 0; i <word.length(); i++){
            for(int j = 0; j <alphabet.length(); j++){
                if(alphabet.charAt(j)== word.charAt(i)){
                    index+= alphabet.indexOf(alphabet.charAt(j)+1);
                }
            }
        }
        System.out.println(index);
    }

}
