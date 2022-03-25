package com.core.java8.terminal;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.forEach(System.out::println);
       /*---------------Collect()-----------------*/
        /*groupingBy()*/
        Map map = arrayList.stream().collect(Collectors.groupingBy(i->i*i));
        System.out.println(map);
        /*toMap()*/
        Map map1 = arrayList.stream().collect(Collectors.toMap(Function.identity(),i -> "ankit"));
        System.out.println(map1);
        /*maxBy()*/
        Optional<Integer> m = arrayList.stream().collect(Collectors.maxBy((i, j)-> (i>j)?1:(i<j)?1:0));
        System.out.println(m.get());

        /*count()*/
       long count =  arrayList.stream().count();
        System.out.println(count);

        /*forEach()*/
        arrayList.forEach(System.out::print);

        System.out.println();
        /*min()*/
        OptionalInt minOptional = arrayList.stream().mapToInt(value -> value).min();
        System.out.println("min : "+minOptional.getAsInt());

        /*max()*/
        OptionalInt maxOptional = arrayList.stream().mapToInt(value -> value).max();
        System.out.println("max : "+maxOptional.getAsInt());

        /*min()*/
        int sum = arrayList.stream().mapToInt(v ->v).sum();
        System.out.println("sum : "+sum);

        /*anyMatch()*/
       boolean anyMatch =  arrayList.stream().anyMatch(i -> i>1);
        System.out.println("anyMatch : "+anyMatch);

        /*allMatch()*/
        boolean allMatch = arrayList.stream().allMatch(i -> i>1);
        System.out.println("allMatch : "+allMatch);

        /*noneMatch()*/
        boolean noneMatch = arrayList.stream().noneMatch(i -> i<0);
        System.out.println("noneMatch : "+noneMatch);

        /*findAny()*/
        Optional<Integer> findAny =  arrayList.stream().findAny();
        System.out.println("findAny : "+findAny.get());

        /*findFirst()*/
        Optional<Integer> findFirst = arrayList.stream().findFirst();
        System.out.println("findFirst : "+findFirst.get());
    }
}
