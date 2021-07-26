import java.util.Arrays;
import java.util.Scanner;

public class PrintAPyramid {

    /**
     * This method will reverse a string without using any loops or built-in methods
     * The technique being used is recursive
     * */
     static int c = 0;
    public static int f(){
        String s = "asif";

        System.out.print(s.charAt(s.length()-1-c));
        c++;
        if(c<= s.length()-1){
            return f();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2,str3;
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        str3 = scanner.nextLine();
        printOccuranceOfNonOverlapping(str1,str2,str3);
        pyramid();
        f();
    }
    public static void pyramid(){
        //String s = "moh";
        //char [] c = s.toCharArray();
        //System.out.println("this is "+c[2]+c[1]+c[0]);

        int p = 10;
        int r = 1;
        for(int i = 0; i<p; i++){
            System.out.print(" ".repeat(p-i-1));
            for (int j = 0; j<i+1; j++){
                System.out.print(r+" ");
                r++;
            }
            System.out.println("");
        }
    }
    public static void bubbleSort(int [] arr){
        int temp=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void printOccuranceOfNonOverlapping(String str1, String str2, String str3) {
        int n = 0;
        if (str1.contains("Non")) {
            while (true) {
                String temp = str3;
                str3 = str3.replaceFirst(str2, "");
                if (str3.equals(temp))
                    break;
                n++;
            }
        }
        else {
            for(int i = 0; i<str3.length()-str2.length();i++){
                if(str3.substring(i, str2.length()+i).equals(str2))
                    n++;
            }
        }
        System.out.println(n);
    }
    public static void nonOverlapping(String str1, String str2, String str3){
        int p = 0;
        if(str1.contains("Non")){
            while(true){
                String temp = str3;
                str3 = str3.replaceFirst(str2,"");
                if(str3.equals(temp)) break;
            }p++;

        }else {
            for(int i = 0; i<str3.length()-str2.length(); i++){
                if(str3.substring(i,str2.length()+i).equals(str2)) p++;
            }
        }
        System.out.println("this is :"+p);
    }

}
