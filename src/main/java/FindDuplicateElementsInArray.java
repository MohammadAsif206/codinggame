import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int [] arr = {2,4,5,1,6,2,2,4};
        int temp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

                if(arr[i]== arr[j] && !  arrayList.contains(arr[i])){
                   arrayList.add(arr[i]);
                }
            }
        }
        System.out.println(arrayList.toString());
        PrintAPyramid.bubbleSort(arr);

        keyWithSmallerLeftBiggerRight();
    }
    /**
     * How to reverse String in Java
     * */
    public static void reverseString(String s){
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));

        }
    }
    public static void keyWithSmallerLeftBiggerRight(){
        int [] arr = {2,6,7,1,8,5,10,3};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int key = 5;
        arrayList.add(key);
        for(int i = 0; i<arr.length; i++){
            if(arr[i]< key){

                arrayList.add(0, arr[i]);
            }
            if(arr[i]== key) arrayList.add(arrayList.indexOf(key), key);
            if(arr[i] > key){
                arrayList.add(arr[i]);
            }
        }
        arrayList.remove(arrayList.indexOf(key));
        System.out.println(arrayList.toString());

    }
}
