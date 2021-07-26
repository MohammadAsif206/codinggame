import java.util.*;

public class ListInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the array");
        String str = sc.nextLine();
        String [] s = str.split(",");

            for(int j = Integer.parseInt(s[0]); j<Integer.parseInt(s[s.length-1])+1; j++){
                System.out.print(j+" ");

        }
            List<Object> myobj = new ArrayList<>();
            myobj.add(1);
            myobj.add("x");

            Map<Integer,Integer> hashMap = new LinkedHashMap<>();
            hashMap.put(2,3);
            hashMap.put(4,5);
            hashMap.put(6,7);
            for(int i: hashMap.keySet()){
                System.out.println(i+": "+hashMap.get(i));

            }
            int n = 3;int f = 1;
            for(int i = 1; i<n+1; i++){
                f *= i;
            }
        System.out.println(f);

//        add();
//        collectionsAsLifoQueue();
//        collectionsBinarySearch();

    }
    // practicing add method in java, add comes in various protypes, it add(int index, Object ele)
    public static  void add(){
        List<String> list = new ArrayList<String>();
        String [] str = {"Java", "C++"};
        for(String s: str){
            list.add(s);
        }
        System.out.println("Size of List: "+ list.size());
        list.add(0,"Python");
        System.out.println("Size of List after addition: "+ list.size());
        System.out.println(list.toString());
        list.clear();
        System.out.println("after calling clear method: "+ list);

        // how to add all elements to the given collection object
        Collections.addAll(list);


    }
    //Write an example for Collections.asLifoQueue() method.
    public static void collectionsAsLifoQueue(){
        Deque<String> dq = new ArrayDeque<>();
        dq.add("jav");
        dq.add("c");
        dq.add("c++");
        dq.add("unix");
        dq.add("perl");
        System.out.println("before returning as queue: "+dq);
        Queue<String> q = Collections.asLifoQueue(dq);
        System.out.println("returned queue is: "+ q);
        q.add("python");
        System.out.println("adding one more element: "+q);
    }
    //How to search user defined object from a List by using binary search using comparator?
    public static void collectionsBinarySearch(){
        List<Emp> empList = new  ArrayList<Emp>();
        empList.add(new Emp(12,"Dinesh", 50000));
        empList.add(new Emp(146,"Tom", 20000));
        empList.add(new Emp(201, "John", 40000));
        Emp searchKey = new Emp(201, "John", 40000);
        int index = Collections.binarySearch(empList,searchKey,new empComparator());
        System.out.println("index of the searchKey: "+index);

    }

    }
    class empComparator implements Comparator<Emp>{

        @Override
        public int compare(Emp o1, Emp o2) {
            if(o1.getEmpId() == o2.getEmpId()) {
                return 0;
            }
            else return -1;
        }
    }

class Emp{
    private int empId;
    private String empName;
    private int empSal;
    public Emp(int eid, String name, int sal){
        this.empId = eid;
        this.empName = name;
        this.empSal = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }


}

