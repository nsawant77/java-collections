package com.nsawant77.collection.sort;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedHashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> h1 = new HashMap();

        h1.put("D",10);
        h1.put("C",17);
        h1.put("B",12);
        h1.put("E",19);
        h1.put("F",15);
        h1.put("A",11);

        Map newMap = h1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(e1->e1.getKey(),e1->e1.getValue(),(e1,e2)->e2,HashMap::new));
                //.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));

        System.out.println(newMap);

    }
}
