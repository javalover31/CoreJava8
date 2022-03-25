package com.core.java8.intermediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);

        /*map() -> if we want to perform some operation on stream. we can use map*/
        List<Integer> listl = arrayList.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println("map "+listl);


        /**filter()**/
        List<Integer> list = arrayList.stream().filter(i -> i<3).collect(Collectors.toList());
        System.out.println("filter list : "+list);


        /*Sorted()*/
        List<Integer> list1 = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending order list1 : "+list1);
        /*Sorted(Comparator.reverseOrder())*/
        List<Integer> list2 = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("descending order list2 : "+list2);


        /*limit()*/
        List<Integer> list3 =arrayList.stream().limit(3).collect(Collectors.toList());
        System.out.println("limit list3 : "+list3);


        /* skip(2) -> skip first two element */
        List<Integer> list5 = arrayList.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip list5 : "+list5);


        /*distinct() -> provide distinct value*/
        arrayList.add(3);
        arrayList.add(2);
        List<Integer> list4 = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct list3 : "+list4);



    }
}
