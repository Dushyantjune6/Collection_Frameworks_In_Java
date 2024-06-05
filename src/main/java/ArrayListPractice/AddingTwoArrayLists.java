package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddingTwoArrayLists {
    public static ArrayList<Integer> sumMethod(ArrayList<Integer> list1,ArrayList<Integer> list2 ){
        ArrayList<Integer> result = new ArrayList<>();
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();

        while(it1.hasNext() || it2.hasNext()){
            int val1 = it1.hasNext() ? it1.next() : 0;
            int val2 = it2.hasNext() ? it2.next() : 0;
            result.add(val1 + val2);
        }
        return result;
    }
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
        System.out.println(sumMethod(l1,l2));
    }
}
