package com.company;

public class recursion {

     int factorial(int n){
        if (n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
        recursion fact=new recursion();
//        int z=fact.factorial(6);
        System.out.println(fact.factorial(5));
    }

}
