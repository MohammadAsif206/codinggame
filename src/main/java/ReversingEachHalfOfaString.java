import java.util.*;

public class ReversingEachHalfOfaString {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String K = in.next();
//
//        final int mid = K.length() / 2;
//        System.out.println("this mid : "+mid);
//        String[] parts = {K.substring(0, mid),K.substring(mid)};
//        StringBuilder sb = new StringBuilder(parts[0]);
//        StringBuilder sb1 = new StringBuilder(parts[1]);
//
//        sb1 = sb1.reverse();
//        sb = sb.reverse();
//
//        if(K.length()%2 != 0){
//            System.out.print(sb+""+K.substring(mid, mid+1)+""+sb1.substring(0,sb1.length()-1));
//        }if(K.length()%2==0) {
//            System.out.print(sb+""+sb1);
//        }
//       // printArray();
       // System.out.println("Sort string");
        //sortString();
        String str = "Asif Mohammad cannot code";
        System.out.println(splitMethod(str).toString());

    }
    public static void printArray(){
        int [] arr = { 1,3,6,4,5,3,2,7,11,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> array = new ArrayList<>();
        Map<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                int k = arr[j];
                if(arr[i] == k-1 && !array.contains(arr[i]) && !array.contains(arr[j])){
                    array.add(arr[i]);
                    array.add(arr[j]);

                    h.put(arr[i],k);
                }
            }
        }
            System.out.print(Arrays.asList(h));

    }
    public static void sortString(){
         String s = "Iran,Afghanistan,Pakistan,Japan,USA,Lebanon,Lean,Palestine,Ireland,Italy";
         String [] str = s.split(",");
         String temp = "";
         for(int i = 0; i<str.length; i++){
             for(int j = i+1; j<str.length; j++){

                 if((str[i].charAt(0)) > str[j].charAt(0)){
                     temp = str[i];
                     str[i] = str[j];
                     str[j] = temp;
                 }
             }
         }
        System.out.println(Arrays.toString(str));

    }
    public static ArrayList<StringBuilder> splitMethod(String str){
        char [] chr = str.toCharArray();
        ArrayList<StringBuilder> arr = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<chr.length; i++) {
            char c =' ';
            if (chr[i] != ' ') {
                //stringBuilder.append(chr[i]);
                c+=chr[i];
                //arr.add(stringBuilder);
            }else{
                stringBuilder.append(",");
            }
            stringBuilder.append(c);
        }
        arr.add(stringBuilder);
        System.out.println(arr.size());
        return arr;
    }
    static class Student{

    }
}

