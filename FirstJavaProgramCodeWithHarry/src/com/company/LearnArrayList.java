package com.company;
import java.util.*;

public class LearnArrayList {
    public static void main(String []args){
        //ArrayList is used so that there will no issue arise of array size because it stores elements dynamically.
        List<Integer> anjan=new ArrayList();
        anjan.add(1);
        anjan.add(2);
        anjan.add(3);
        System.out.println(anjan);
        anjan.add(4); // This will add only at the end of the list
        System.out.println(anjan);

        anjan.add(1,50); //Here 50 will add at the index of 1;
        System.out.println(anjan);

        List<Integer> newList=new ArrayList();
        newList.add(59);
        newList.add(434);

        anjan.addAll(newList);//It adds all elements of newlist in the anjan's list.
        System.out.println(anjan);

        System.out.println(anjan.get(1)); // it is  used to get access of arrayList element

        anjan.remove(1);// it is used to delete the element which is at any specific index
        System.out.println(anjan);

        anjan.remove(Integer.valueOf(59));// it is used to delete any specific element from arrayList.
        System.out.println(anjan);

        anjan.set(2,100);// this is used to update the element at any index;
        System.out.println(anjan);

        System.out.println(anjan.contains(100));// it returns the value true or false after checking the specific element is present in the ArrayList or not.

//        for (int i = 0; i < anjan.size(); i++) { // method of iteration using for loop
//            System.out.println(anjan.get(i));
//        }

//        for (Integer element:anjan) { // method of iteration using for-each loop
//            System.out.println(element);
//        }

//        anjan.clear();
//        System.out.println(anjan);// this will remove or clear the all element from the arrayList;

        Iterator<Integer> it=anjan.iterator();
        while (it.hasNext()){
            System.out.println("Iterator  "+ it.next());
        }

    }
}
