package ListsImplementations;

import java.util.ArrayList;
import java.util.Scanner;

public class TypeSafeLists {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("My");
        list.add("Name");
        list.add("Is");
        list.add("Dushyant");
        list.add("Malviya");

        System.out.println(list);

        //Changing all the elements to lower case

        for (int i = 1; i < list.size() - 2; i++) {
            list.set(i, list.get(i).toLowerCase());
        }
        System.out.println(list);

        //To check if any string/element is contained in the collection

//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "dushyant";

        if (list.contains(str)) {
            System.out.println(list.contains(str));
            System.exit(1);
        }
        System.out.println(list.contains(str));
    }
}
