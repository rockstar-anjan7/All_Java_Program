package com.company;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        //Map<Key,Value>
        //Key should be unique for every value.
        Map<String,Integer> numbers=new HashMap<>();

        numbers.put("One",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);

//        if(!numbers.containsKey("two")){
//            numbers.put("two",23); //Here, it cannot change the element nor add more element for same key .
//        }
         numbers.putIfAbsent("two",23);

//        numbers.put("two",23);// Here If we again add key two then it will replace the value for them.


        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

//        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for (String key: numbers.keySet()) {
//            System.out.println(key);
//        }
//
        for(Integer value: numbers.values()) {
            System.out.println(value);
        }
    }
}
