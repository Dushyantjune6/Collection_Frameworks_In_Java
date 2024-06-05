package ListsImplementations;

import java.util.LinkedList;

public class TypeUnsafeLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add("Is");
        list.add(true);
        list.add("for");
        list.add(0.231);

        System.out.println(list);
        list.set(1,123); //Overwriting an existing value
        System.out.println("Over written value: "+list);

        list.add(1,"Hello"); //Appending a value
        System.out.println("Appended value: "+list);

        //This method will remove all the elements from the ArrayList
        list.clear();
        System.out.println("After removing all the values using clear() method: "+list);

    }
}
