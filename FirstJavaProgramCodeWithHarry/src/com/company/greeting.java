package com.company;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("write your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello " +
              name +
                " Have a good day!");

    }
}
