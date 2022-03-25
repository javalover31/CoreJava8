package com.core.java8.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationCutomObjDemo {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(4, "ankit",200000));
        arrayList.add(new Employee(2, "nikhil",150000));
        arrayList.add(new Employee(1, "rachana", 10000));
        arrayList.add(new Employee(3, "sanju",400000));

        /*map()*/
        List<Long> listl = arrayList.stream().map(e -> e.salary*2).collect(Collectors.toList());
        System.out.println(listl);


        /**filter()**/
        List<Employee> list = arrayList.stream().filter(e -> e.name.equals("ankit")).collect(Collectors.toList());
        System.out.println("filter employee list : "+list);


        /*Sorted()*/
        List<Employee> list1 = arrayList.stream().sorted((e1,e2)-> ((e1.id > e2.id) ? 1 : (e1.id < e2.id) ? -1 : 0)).collect(Collectors.toList());
        System.out.println("ascending order emp id list1 : "+list1);
        /*Sorted(Comparator.reverseOrder())*/
        List<Employee> list2 = arrayList.stream().sorted((e1,e2) -> ((e1.id)> e2.id)?-1:(e1.id< e2.id)?1:0).collect(Collectors.toList());
        System.out.println("descending order emp id list2 : "+list2);


        /*limit()*/
        List<Employee> list3 =arrayList.stream().limit(2).collect(Collectors.toList());
        System.out.println("limit list3 : "+list3);


        /* skip(2) -> skip first two element */
        List<Employee> list5 = arrayList.stream().skip(2).collect(Collectors.toList());
        System.out.println("skip list5 : "+list5);

        
        /*distinct() -> provide distinct value*/
        arrayList.add(new Employee(1, "rachana", 10000));
        arrayList.add(new Employee(3, "sanju", 66633));
        List<Employee> list4 = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct list3 : "+list4);



    }
}
