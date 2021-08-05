package staging.time.java.collections.practice;

import java.util.*;

public class MyMaps {
    public static void main(String[] args) {
        mapAlphabetsToTheirPosionalIndeces();
        count();


    }
    public static void mapAlphabetsToTheirPosionalIndeces(){
        Map<Integer,Character> map = new HashMap<>();
        Map<Integer,Character> temp = new HashMap<>();
        String s = "attitude";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i<alphabet.length(); i++){
                map.put(i, alphabet.charAt(i));
        }
        map.put(70,'c');
        int count = 0;
        for(Map.Entry<Integer, Character> entry: map.entrySet()){
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)== entry.getValue()){
                    count+=entry.getKey();

                }
            }
            System.out.print(entry.getKey()+1+":"+entry.getValue()+" ");

        }
        System.out.println("The count is : "+(count+s.length()));
        map.put(2,'c');
        for(Map.Entry<Integer,Character> entry: map.entrySet()){

        }


    }
    public static int count() {
        try {

            System.exit(1);
        } catch(Exception e) {
            return 2;
        } finally {
            System.out.println("Finally block will execute even after a return statement in a method");
        }
        return 0;
    }

}
