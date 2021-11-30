package com.nsawant77.collection.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class MyImmutableClass {

    private final Integer id;

    private final String name;

    private final HashMap<String, Integer> map;

    private MyImmutableClass(Integer id, String name, HashMap<String, Integer> map) {
        this.id = id;
        this.name = name;

        HashMap<String, Integer> copyMap = new HashMap<>();
        String key;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            key = it.next();
            copyMap.put(key,map.get(key));
        }
        this.map = copyMap;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getMap() {
        return (HashMap<String, Integer>) map.clone();
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Before modifying");
        int i = 100;
        String name = "Nilesh";
        HashMap<String,Integer> h1 = new HashMap<>();

        h1.put("One",1);
        h1.put("Two",2);
        h1.put("Three",3);

        MyImmutableClass myClass = new MyImmutableClass(i,name,h1);
        System.out.println(myClass);

        System.out.println("After modifying");
        HashMap<String,Integer> h2 = myClass.getMap();
        h2.put("Seven",7);
        h2.put("Eight",8);
        h2.put("Nine",9);
        i=101;
        name="Sawant";
        //MyImmutableClass myClassNew = new MyImmutableClass(200,"Sawant",h2);
        System.out.println(myClass);
    }
}
