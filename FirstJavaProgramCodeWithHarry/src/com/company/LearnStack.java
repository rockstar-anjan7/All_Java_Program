package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String args[]){
        Stack<String> animals=new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat"); // push function is used to add the elements in stack.

        System.out.println(animals);

        System.out.println(animals.peek());// peek function is used to access the topmost element of stack.

        animals.pop();// it is used to delete the element from stack.
        System.out.println(animals.peek());


    }
}
