import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        String ss ="amin";
        StringBuilder sb = new StringBuilder(ss);
        ss.toUpperCase();
        sb.append(" Esfahanin");
        System.out.println("this "+sb);


//        int num = 5;
//        int R = 2;
//
//        for(int i = 0; i<num;i++){
//            String s ="#";
//            if(i != num-1) {
//                System.out.print((int)Math.pow(R,i) + "#");
//            }
//            else {
//                System.out.println((int)Math.pow(R,i));
//            }
//        }

        List<String> list = new ArrayList<>();
        list.add("Asif"); list.add("Mohammad");
        list.add("Khadija"); list.add("Rahimi");
        list.add("Sunday"); list.add("Saturday");
        System.out.println(list.toString());
        StringBuilder stringBuilder = new StringBuilder();

        int c = 0;
        for(String s: list){
            c++;
            if( c <= list.size()-1) {
                stringBuilder.append(s + " ");
            }else {
                stringBuilder.append(s);
            }
        }
        System.out.println(stringBuilder);
//        String s = "Mohammad";
//        char [] p =s.toCharArray();
//        for(int i = 0; i<p.length;i++){
//            String s1 = Character.toString(p[i]);
//            System.out.println(hexToBin(s1));
//        }
        reverse();





    }

    /**
     * This method will convert Hex into Binary
     * @param hex
     * @return
     */
    private static String hexToBin(String hex){
        String bin ="";
        String bigFragment = "";
        int iHex;
        hex = hex.trim();
        hex = hex.replaceFirst("0x","");
        for(int i = 0; i< hex.length();i++){
            iHex = Integer.parseInt(""+hex.charAt(i),16);
            bigFragment = Integer.toBinaryString(iHex);
            while (bigFragment.length() <4){
                bigFragment ="0"+bigFragment;
            }
            bin+= bigFragment;
        }
        return bin;
    }

    /**
     * This method will reserve a String
     */
    public static void reverse(){
        String s = "Asif";
        char [] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i =c.length-1; i>=0;i--){
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }

    /**
     * This method will get N numbers and print out a sequence with R difference
     */
   public static  void commonRation() {
            int N = 5;
            int R = 2;
            int count = 0;
            for(int i = 0; i<N; i++){
                if(count<N-1){
                    System.out.print(i*R+" ");
                    count++;
                }else{
                    System.out.print(i*R);
                }
        }
    }
   /** Figure out how much sugar Johny ate, given the time he took in seconds and the speed he
    * ate it at in grams per minute.
    Example:If time is 30 and speed is 20, you need to output 10
    */
   public static void howMuchSugarJohnyAte(){
       int t = 30, s = 20;
       System.out.println(s*t/60);
   }



}
