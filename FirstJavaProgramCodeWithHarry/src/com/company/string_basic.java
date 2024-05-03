package com.company;
import java.util.Scanner;

public class string_basic {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);

//        int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);

//        String name;
//        Scanner sc = new Scanner(System.in);
//        name=sc.nextLine();
//        for(int i=0;i<name.length();i++){
//            System.out.println("The character of name is :"+ name.charAt(i));
//        }

//        String name1="TonyStark";
//        String name2="TonyStark";
//        if(name1.compareTo(name2)==0){
//            System.out.println("Given two string are equal");
//        }

//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

//        String sentence="My name is Tony";
//        String name=sentence.substring(7,sentence.length());
//        System.out.println(name);

//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());

    }
}
