package com.nsawant77.collection.sort;

import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {
        Stream.of("One","Two","Four","Eight","Seven")
                .filter(s->s.length()>3)
                .peek(peek-> System.out.println(peek))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}
