import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicateCharInAString {
    public static void main(String[] args) throws NoSuchMethodException {
        String str = "india iran japan";
        char s[] = str.toCharArray();

        for (int i = 0; i<s.length; i++){
            int count = 1;
            for(int j = i+1; j<s.length; j++){
                if(s[i]==s[j] && s[i]!= ' ') {
                    count++;
                    s[j] ='0';
                }
            }
            if(count>1 && s[i]!='0'){
                System.out.println(s[i]);
            }
        }
        int l = 11;
        for(int i = 1; i<l; i++){

            for(int j = 1 ; j<l-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //reverse the string
        String rev = "Asif";
        for(int i = rev.length()-1; i>=0; i--){
            System.out.print(rev.charAt(i));
        }

    }
}
