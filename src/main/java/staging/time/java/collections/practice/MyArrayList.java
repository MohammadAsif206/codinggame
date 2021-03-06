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
        System.out.println("Elements with even values were removed: "+iArray.toString());


        /**
         *  addAll method(int index, Collection c), returns if collections succesfully added
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 10; i< 20; i++){
            arrayList.add(i);
        }
        iArray.addAll(0,arrayList);
        System.out.println("Content of arrayList added at index 0 of iArray: "+iArray.toString());

        /**
         * removeIf will remove based on a given predicate
         * for example in the code block below it will remove even numbers from iArray
         */
        iArray.removeIf(n-> (n%2 ==0));
        System.out.println(iArray);

        /**
         * retainAll methods will retain only the elements of the object passed to as an argument
         * for example in the code block below iArray will contain only the content of the arrayList
         */
        iArray.retainAll(arrayList);
        System.out.println(iArray.toString());

        /**
         * forEach for ArrayList
         */
        String s = "Mohammad Asif";
        char [] chr = s.toCharArray();
        //add some more elements to iArray
        iArray.addAll(0,arrayList);
        iArray.forEach(n->{
            System.out.print(n+" ");
        });
        for(Character c : chr){
            System.out.print(c);
        }







    }
}
