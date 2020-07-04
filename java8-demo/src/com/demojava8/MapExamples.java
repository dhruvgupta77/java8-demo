package com.demojava8;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExamples {
    public static void main(String[] args) {

        //1
        Optional<String> str = Optional.of("test");
        System.out.println(Optional.of("TEST").equals(str.map(String::toUpperCase)));

        //2
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(asList("A", "B").equals(myList));

        // foods which helps in weight loss
        List<String> loseWeight = new ArrayList<>();
        loseWeight.add("avocados");
        loseWeight.add("beans");
        loseWeight.add("salad");
        loseWeight.add("oats");
        loseWeight.add("broccoli");

        System.out.println("list of String : " + loseWeight);
        // let's use map() method to convert list of weight
        // lose food, which are String to list of ints
        // which are length of each food String
        List listOfInts = loseWeight.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println("list of ints generate by map(): " + listOfInts);



    }
}
