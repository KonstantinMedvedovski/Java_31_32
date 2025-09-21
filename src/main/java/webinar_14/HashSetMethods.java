package webinar_14;

import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        Collections.addAll(hashSet1, 1, 2, 5, 7, 55, 100, 333);
        System.out.println(hashSet1);
        hashSet1.add(987);
        System.out.println(hashSet1);
        System.out.println(hashSet1.add(456));
        hashSet1.remove(333);
        System.out.println(hashSet1);
        System.out.println(hashSet1.isEmpty());
        System.out.println(hashSet1.size());
        hashSet1.add(1);
        System.out.println(hashSet1.size());
        hashSet1.contains(5);
        System.out.println(hashSet1);
        System.out.println("++++++++++++");
        System.out.println(returnFirstRepeatedWord("To be or not to be"));

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("str1");
        linkedHashSet.add("str2");
        linkedHashSet.add("str3");
        linkedHashSet.add("str4");
        linkedHashSet.add("str5");
        linkedHashSet.add(null);
        linkedHashSet.add("str1");
        System.out.println(linkedHashSet);

        HashSet<Integer> hash2 = new HashSet<>(40,0.9F);



        HashSet<Integer> hashSet2 = new HashSet<Integer>();

        System.out.println("======================");
        Person person1 = new Person(23, 1001l, "Andrey");
        Person person2 = new Person(25, 10l, "Andre");
        Person person3 = new Person(28, 100l, "Andr");
        Person person4 = new Person(29, 1002l, "Ndrey");

        HashSet<Person> people = new HashSet<>();
        people.add(person1);//12345
        people.add(person2);//4375678
        people.add(person3);
        people.add(person4);
        System.out.println(people);
        System.out.println("=================");

//        HashSet<String> words = new HashSet<>();
//        words.add("To be or not to be");
//        System.out.println(words.contains("To be or not to be"));
        TreeSet<Person> people1 = new TreeSet<>();
        people1.add(person1);//12345
        people1.add(person2);//4375678
        people1.add(person3);
        people1.add(person4);
        System.out.println(people1.contains(person2));
        System.out.println(people1.hashCode());
        Collections.addAll(people1);
        System.out.println(people1.hashCode());


    }

    static String returnFirstRepeatedWord(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("text is null or empty");
            return null;
        }
        String[] array = text.trim().toLowerCase().split("\\W+");
        Set<String> werd = new HashSet<>();
        for (String elements : array) {
            if (!werd.add(elements))
                return elements;
        }
        return null;
    }


}
