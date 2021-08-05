package staging.time.codinggame;

import java.util.*;

public class FindMexOfList {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<Integer> list = new ArrayList<>();
//        int mex = 0;
//        for(int i = 0; i < n; i++){
//            int input = in.nextInt();
//            list.add(input);
//
//        }
//        Collections.sort(list);
//       for(Integer i: list){
//           if(i==mex){
//               mex+= 1;
//           }else break;
//       }
//       System.out.println(mex);
        List<Character> list = new ArrayList<>();
        list.add('a'); list.add('b');list.add('w');
        Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
        list.forEach(s-> System.out.println(s));

        for(Character c: list){
            System.out.print(c);
        }
        System.out.println();
        intToAscii();
        System.out.println();

        findIntersection();
    }

    public static void intToAscii(){
        int n = 11;
        String s = "Hello World";
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int c = Integer.valueOf(s.charAt(i));
            l.add(c);
        }
        l.forEach(j-> System.out.print(j+" "));
    }
    public static void findIntersection(){
        int b1 = 1;
        int e1 = 7;
        int b2 = 6;
        int e2 = 9;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int count = 0;
        for(int i = b1; i <=e1; i++){
            a1.add(i);
        }
        for(int j = b2; j<=e2; j++){
            if(a1.contains(j)){
                count++;
            }
            else {
                count = 0;
            }
        }
        if(count> 0)
            System.out.println(count+"Overlap");
        else
            System.out.println(count+ "No overlap");


    }
}
