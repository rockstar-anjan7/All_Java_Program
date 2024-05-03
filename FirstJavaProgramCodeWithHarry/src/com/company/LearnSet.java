package com.company;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // it is the data structure in which the duplicate elements are not allowed.
        //In the set there is no order is defined for the elements.
        // this is because it is worked on the basis of hashing which is running in this set.
//        Set<Integer> set= new HashSet<>();
//        Set<Integer> set= new LinkedHashSet<>(); //all rules are same except here order of the element are same as we add the elements in the set.
        Set<Integer> set=new TreeSet<>();// all rules are same , only difference is that here internal operation are having binary tree that's why
        //  here all elements are sorted in increasing order.


        set.add(2);
        set.add(34);
        set.add(78);
        set.add(12);
        set.add(23);


//        set.add(2);// if we even try to add similar element which is already present in the set it doesn't add.


        System.out.println(set);

        set.remove(23);// it is used to remove the element.
        System.out.println(set);

        System.out.println(set.contains(12));// it checks whether the elements is present or not by giving their answer in true or false.
        System.out.println(set.isEmpty());// to check empty or not?
        System.out.println(set.size());// to return the total number of elements in set.
        set.clear();// it is used to delete all elements from the set.
        System.out.println(set);

    }
}
