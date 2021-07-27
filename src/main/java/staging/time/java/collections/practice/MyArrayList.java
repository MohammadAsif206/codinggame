package staging.time.java.collections.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        int [] arr = {3,5,1,6,4,7,9,8,10,0,2};
        System.out.println("Content of the array without sort: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Content of the array after sorting it: "+Arrays.toString(arr));
        ArrayList<Integer> iArray = new ArrayList<>();
        /**
         * arrayList add() method
         */
        for(int i = 0; i<arr.length; i++){
            iArray.add(arr[i]);
        }
        //with toString we can print the content of of arrayList obj but not int [] array
        System.out.println("Add method, int array was added to arrayList: "+iArray.toString());
        /**
         * arrayList remove method, how to remove and element from an arrayList
         * in the code block below, I want to remove elements with even value
         */

        for(int i = 0; i<=10; i++){
            if(i%2 == 0){
                iArray.remove(iArray.indexOf(i));
            }
        }
        System.out.println("Even with even values were removed: "+iArray.toString());

    }
}
