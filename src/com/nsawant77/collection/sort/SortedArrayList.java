package com.nsawant77.collection.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortedArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(3);

        Collections.sort(list);

        System.out.println(list);

        List newList = list.stream()
                .sorted()
                .collect(Collectors.toList());
                /*.forEach(System.out::print);*/
        System.out.println(newList);

        for(int i =0 ; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        System.out.println(list);

    }
}
