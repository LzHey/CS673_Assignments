package edu.bu.zhixi;

import java.util.*;

public class Problem_5 {

    /*
        a function that combines two lists by alternatively taking elements
     */

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        List newList = combine_list(list1,list2);
        System.out.println(newList);


        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);
        System.out.println(list4);

        List testList = combine_list(list3,list4);
        System.out.println(testList);
    }

    public static List combine_list(List l1, List l2) {
        List result = new ArrayList();
        while (!l1.isEmpty() && !l2.isEmpty()) {
            result.add(l1.remove(0));
            result.add(l2.remove(0));
        }
        // if two lists have different size, the rest of the longer list would be concatenated to the end
        while (!l1.isEmpty()) {
            result.add(l1.remove(0));
        }
        while (!l2.isEmpty()) {
            result.add(l2.remove(0));
        }
        return result;
    }
}
