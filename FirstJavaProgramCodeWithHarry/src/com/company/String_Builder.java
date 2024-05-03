package com.company;

public class String_Builder {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder("Tony");
//
//        System.out.println(sb);
//        System.out.println(sb.charAt(0));
//
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        sb.insert(2,'n');
//        System.out.println(sb);
//
//        sb.delete(2,3);
//        System.out.println(sb);

//        StringBuilder sb=new StringBuilder("h");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);

        StringBuilder sb = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}
