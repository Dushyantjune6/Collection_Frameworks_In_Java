package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsInJava {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("My");
        list.add("Name");
        list.add("Place");
        list.add("Animal");
        list.add("Thing");
        list.add("Lost");

        Iterator<String> itr = list.iterator();

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("list2: "+list2);

        System.out.println("list2 contains all from list?: "+list2.containsAll(list));
        System.out.println("list contains the letter Name?: "+list2.contains("Name"));

        list.forEach(System.out::println);

        list2.toArray();
        System.out.println("list2 as an array: "+list2);


    }
}
