package webinar_15;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args){
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Melon");
        treeSet1.add("Banana");
        treeSet1.add("Cherry");
        treeSet1.add("Apple");
        System.out.println(treeSet1);

        TreeSet<String> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add("Melon");//123
        treeSet2.add("Banana");//5465
        treeSet2.add("Cherry");
        treeSet2.add("Apple");
        System.out.println(treeSet2);
        System.out.println(treeSet2.isEmpty());
        System.out.println(treeSet2.hashCode());
        System.out.println(treeSet2.hashCode());
        System.out.println("++++++++=");
        System.out.println(treeSet2.first());
        System.out.println(treeSet2.last());
        System.out.println(treeSet2.size());
        System.out.println(treeSet2.remove("Banana"));
        System.out.println(treeSet2.size());
        System.out.println(treeSet2.contains("Banana"));


        Object String;
//        TreeSet<String> treeSet3 = new TreeSet<String>(Comparator<String>()){
//            public int compare(String s1,String s2){
//                return
//                Integer.compare(s2.length(),s1.length());
//            }
//        };
//        treeSet3.add("AAAJava");
//        treeSet3.add("Python");
//        treeSet3.add("C++");
//        System.out.println(treeSet3);

        TreeSet<String> treeSet4 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        treeSet4.add("Java");
        treeSet4.add("Python");
        treeSet4.add("C++");
        System.out.println(treeSet4);

        TreeSet<Integer> treeSet5 =new TreeSet<>(Comparator.reverseOrder());
        Collections.addAll(treeSet5,1, 3, 4,9 ,87);
        System.out.println(treeSet5);




    }
}
