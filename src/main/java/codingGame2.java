import java.util.*;

public class codingGame2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String L = in.nextLine();
//        char [] arr = {};
//        arr = L.toCharArray();
//        int space = 0;
//        int num = 1;
//        int upper = 10;
//        int lower = 5;
//        int chr = 1;
//        int out1 = 0, out2 = 0, out3 = 0, out4 = 0;
//
//        boolean valid = false;
//        if (8 <= L.length() && L.length() <= 15) {
//            valid = true;
//            for (int i = 0; i < L.length(); i++) {
//                if (Character.isLetterOrDigit(arr[i])) {
//                    out1+= num;
//                }
//                if (Character.isAlphabetic(arr[i]) && Character.isLowerCase(arr[i])){
//                    out2+= lower;
//
//                }if(Character.isWhitespace(arr[i])){
//                    out3+=space;
//
//                }if(Character.isAlphabetic(arr[i]) && Character.isUpperCase(arr[i])){
//                    out4+= upper;
//                }
//            }
//
//        }
//
//
//        System.out.println(out1+out2+out3+out4);


//-----------------------------------------------------------------------------------------------
//                int valueCount = in.nextInt();
//
//                for (int i = 0; i < valueCount; i++) {
//                    String value = in.next();
//                    if(i<valueCount) {
//
//
//                        System.out.print((char)Integer.parseInt(value, 16));
//                    }
//
//
//                }
//                //------------------------------------------------------------------------------------------


                String sum = in.next();
                char [] ch = {};
                ch = sum.toCharArray();

                List<Integer> arr = new ArrayList<>();
                for(int i=0; i<ch.length; i++){
                    if(ch[i]!='+') {
                        arr.add(Integer.parseInt(String.valueOf(ch[i])));
                    }
                }
                Collections.sort(arr);
                for(int i = 0; i< arr.size(); i++){
                    if(i == arr.size()-1) {
                        System.out.print(arr.get(i));
                    } else {
                        System.out.print(arr.get(i)+"+");
                    }

                }
        int ar[] = {64,25,12,22,11};
                selectionSort(ar);


        //-------------------------------------------------------------------------


            }
            public static void selectionSort(int [] arr){


                int temp = 0;
                for(int i = 0; i<arr.length-1; i++){
                    int min_index = i;
                    for(int j = i+1; j<arr.length; j++){
                        if(arr[j] <arr[min_index]){
                            min_index= arr[j];
                        }

                    }
                    temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }

            }
        }




