import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingGame {

    public static int unchangedIndex(int N, int A[]) {

        int result = 0;
        int [] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = A[i];
        }


        for(int i = 0; i<B.length; i++){
            if(A[i] == B[i]){
                result++;
            }
        }
        return result;
    }

    public static int smallInteger(int N, int X, int A[]) {
        int n = (int) (Math.pow(10, 90));
        if (1 <= N && N <= 1000) {
            for (int i = 0; i < A.length; i++) {
                if (1 <= (A[i]) && (A[i]) <= n || 1 <= X && X <= n) {
                    if (A[i] > X && A[i] < n) {
                        n = A[i];
                    }

                }
            }
        }
        return n;
    }


    public static void main(String[] args) {

//        String sentence = "I want to manipulate this string";
//        System.out.println(manipulateString(sentence));
//        System.out.println(sumOfAsciiValOfString(sentence));
//        System.out.println(calculateMeanOfString(sentence));
//        System.out.println(returnAllOddValueOfStringLetters(sentence));
//        System.out.println(returnAllEvenValueOfStringLetters(sentence));
//        printMatrix(8,6);
//        int[] array = {1, 3, 5, 6, 7, 8, 8, 9, 8, 8, 9, 9};
//        findSecondToLargestAccurance(array);
//        palandirom();
//        palindromS();
//        String e = "mohamm26@hotma.af";
//        System.out.println(validateEmail(e));
//          System.out.println(sumOfPrime(10));
//          CodingGame c = new CodingGame();
//          c.sumOfModOfNNum();
//          bingo("Bingo");
       // correctMySpelling();
        //------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//        int L = sr.nextInt();
//        int R = sr.nextInt();
//        int N = sr.nextInt();
//        int A[] = new int[N];
//        for(int i =0; i<A.length; i++){
//            A[i] = sr.nextInt();
//        }
//        System.out.println(favorite(L,R,N,A));
//        sr.close();
//        // test smaller integer
//        int N = sc.nextInt();
//        int X = sc.nextInt();
//        int A [] = new int[N];
//        for(int i = 0; i<A.length; i++){
//            A[i]= sc.nextInt();
//        }
//        System.out.println(smallInteger(N,X,A));
//        int N = sc.nextInt();
//        int A [] = new int[N];
//        for(int i = 0; i<N; i++){
//            A[i] = sc.nextInt();
//        }
//        System.out.println(unchangedIndex(N,A));
//        int L = sc.nextInt();
//        int R = sc.nextInt();
//        int N = sc.nextInt();

        String text="Hello World";
        int N = 3;
        for(int i = 0; i <text.length()-N+1; i++){
            System.out.println(text.substring(i, i+N));
        }






//-------------------------------------------------------------------------------------------------------------


    }
    //---------------------------------------------------------------------------------------------------------------
    public static int favorite(int L, int R, int N, int A[]) {

        int result=0;

        //Write Your Logic Here
        int count = 0;
        if((1<=L && L<=105) && (1<=R && R<=105)&&(1<=Math.abs(N)&& Math.abs(N)<=105)) {

            for (int i = 0; i < N; i++) {
                if (L <= A[i] && A[i] <= R) {

                    result= A[i];
                    count++;

                }

            }
        }

        return count;

    }









    //---------------------------------------------------------------------------------------------------------------


    /**
     * This method will get string and capitalize every other letter in a the word forming the text.
     *
     * @param s
     * @return String
     */
    public static String manipulateString(String s) {
        char[] array = {};
        array = s.toCharArray();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] == ' ') {
                i -= 1;
            } else {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        s = new String(array);
        return s;
    }

    /**
     * This method will get string, find the ascii value of character and return the difference between
     * The maximum and the minimum value of the characters available in the string.
     *
     * @param s
     * @return int
     */
    public static int sumOfAsciiValOfString(String s) {
        char[] array = {};
        array = s.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            arrayList.add((int) array[i]);
        }
        arrayList.sort(Collections.reverseOrder());
        int result = arrayList.get(0) - arrayList.get(arrayList.size() - 1);
        return result;
    }

    /**
     * This method will get the ascii value of each character of a string and finds the mean
     *
     * @param s
     * @return int
     */
    public static int calculateMeanOfString(String s) {
        char[] array = {};
        array = s.toCharArray();
        int sum = 0, mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (int) array[i];
        }
        mean = sum / array.length;
        return mean;
    }

    /**
     * This method will get the ascii value of each character of a string and return the odd values available
     * in the string
     *
     * @param s
     * @return array list
     */
    public static ArrayList<Integer> returnAllOddValueOfStringLetters(String s) {
        char[] array = {};
        array = s.toCharArray();
        ArrayList<Integer> oddVal = new ArrayList<>();
        for (Character c : array) {
            int curVal = (int) c;
            if (curVal % 2 != 0) {
                oddVal.add((curVal));
            }
        }
        return oddVal;
    }

    /**
     * This method will get the ascii value of each character in the string and will return the even value
     * available in the string.
     *
     * @param s
     * @return array list
     */
    public static ArrayList<Integer> returnAllEvenValueOfStringLetters(String s) {
        char[] array = {};
        array = s.toCharArray();
        ArrayList<Integer> evenVal = new ArrayList<>();
        for (Character c : array) {
            int curVal = (int) c;
            if (curVal % 2 == 0) {
                evenVal.add(curVal);
            }
        }
        return evenVal;
    }

    /**
     * This method will print out the result either in two columns and x/2 rows, or one row with x columns
     * or with one column x rows.
     *
     * @param x
     * @param y
     */
    public static void printMatrix(float x, float y) {

        if (x / y > 1 && (x / y) != x) {
            for (int i = 0; i < x; i += 2) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else if (x / y == 1) {
            for (int i = 1; i < x + 1; i++) {

                System.out.print(i + " ");
            }
        } else if (x / y == x) {
            for (int i = 1; i < x + 1; i++) {
                System.out.println(i);
            }
        }
    }

    public static void findSecondToLargestAccurance(int[] arr) {
        Map<Integer, Integer> sl = new HashMap<>();
        int[] count = new int[arr.length];
        int[] num = new int[arr.length];
        int i, temp = 0;
        for (i = 0; i < arr.length; i++) {
            num[i] = arr[i];
            if (num[i] == 0) break;
        }
        for (i = 0; i < arr.length; i++) {
            temp = num[i];
            count[temp]++;
        }
        for (i = 0; i < count.length; i++) {
            if (count[i] > 0 && count[i] == 1) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            } else if (count[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
                sl.put(i, count[i]);


            }
            Stream.of(sl).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);

        }

        // System.out.println(sl.get("key"), sl.values());
    }

    public static void palandirom() {
        int n = 20;
        String s = "";
        int i = 0;
        while (s.length() != n + 1) {
            i++;
            String b = "";
            String a = String.valueOf(i);
            for (int j = a.length() - 1; j >= 0; j--) {
                b += a.charAt(j);
                if (b.equals(a)) {
                    s += a;

                }
            }
        }
        System.out.printf("vale of %s\n ", s);
        System.out.println(s.charAt(n));
        System.out.println();

    }

    /**
     * This method will find the number of palindromes in a string
     */
    public static void palindromS() {
        String str = "nun mim sis lil how are you doing ingigni";
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        String [] str_split = str.split(" ");
        String [] str1_split = stringBuffer.toString().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0, j = str1_split.length-1; i < str_split.length-1 && j >=0; i++, j--) {
            if(str_split[i].equals(str1_split[j])){
                stringBuilder.append(str_split[i]+" ");
                count++;
            }
        }
        System.out.println(" "+stringBuilder.toString()+ " ");
        System.out.printf("There are %d palindromes in the text ", count);
    }

    /**
     * This method will validate an email based on the criteria
     * [1-9 alphanumeric][@][1-7 alphanumeric][.][1-3 alphabetic]
     * @param e
     * @return
     */
    public static boolean validateEmail(String e){

        String str = e.substring(0, e.indexOf("@"));
        String str1 = e.substring(e.indexOf("2")+1,e.indexOf("."));
        String str2 = e.substring(e.indexOf(".")+1);
        int c = 0, c1=0, c2 = 0;
        for(int i = 0; i < str.length(); i++){
                    if(Character.isLetterOrDigit(str.charAt(i))){
                        c++;
            }
        }
        for(int i = 0; i < str1.length(); i++){
            if(Character.isLetterOrDigit(str1.charAt(i))){
                c1++;
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(Character.isAlphabetic(str2.charAt(i))){
                c2++;
            }
        }
        if((0<c && c <10) && (0< c1 && c1 < 8) && (0<c2 && c2<4))
            return true;
        else
            return false;
    }

    /**
     * This method finds the sum of prime numbers in n
     * @param n
     * @return int
     */
    public static int sumOfPrime(int n){
        int c = 0;
        for(int i = 0; i<n; i++){
            boolean p = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
                if(p==true){
                    c++;
            }
        }
        return c;
    }

    /**
     * The method will find the sum of mod on n numbers;
     */
    public void sumOfModOfNNum(){

        int sum = 0;
        int [] arr = new int[]{4, 5, 8, 12};
        int divisor = 3;
        for(int i = 0; i<arr.length; i++){
            sum+= (arr[i]%divisor);
            //sum%=divisor;
        }
        System.out.println(sum);
    }
    public static void bingo(String s){
        s = "Bingo";
        StringBuilder sb = new StringBuilder(s);
        String str1 = "*";
        for(int i = sb.length(); i >=0; i--){
            sb.replace(i, sb.length(),str1);
            System.out.println(sb.toString());
            str1+= "*";
        }
    }
    public static void correctMySpelling(){
        String s_c = "Hello my name is mohammad. I am 30 years old.";
        String s_m = "Hollo my nume is mohammad I am 30 years oll";
        StringBuilder sb = new StringBuilder();
        String [] sp_c = s_c.split(" ");
        String [] sp_m = s_m.split(" ");
        int m = 0, p=0;
        for(int i = 0; i< sp_c.length; i++) {
            if (sp_c[i].contains(".") && !sp_m[i].contains(".") || !sp_c[i].contains(".") && sp_m[i].contains(".")) {
                p++;
            }
            sp_c[i] = sp_c[i].replace(".", "");
            sp_m[i] = sp_m[i].replace(".", "");
            if (!sp_c[i].equals(sp_m[i])) {
                m++;
            }
        }
        System.out.println(m+" "+p);
    }
    public static void findCountOfVowels(){
        String vowels = "AEIOU";
        char [] arr = {};

        LinkedHashMap<Character, Integer> hMap = new LinkedHashMap<>();
        hMap.put('A', 0);
        hMap.put('E',0);
        hMap.put('I', 0);
        hMap.put('O', 0);
        for(int i = 0; i<vowels.length(); i++){

        }
    }
}



