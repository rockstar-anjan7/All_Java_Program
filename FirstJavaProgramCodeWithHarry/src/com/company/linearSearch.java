package com.company;
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<5;i++){
            marks[i]=sc.nextInt();

        }
        for(int i=0; i<5; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Enter the number to search: ");
        int x=sc.nextInt();
        for (int i=0; i<5;i++){
            if(marks[i]==x){
                System.out.println("Elements founds at index : "+ i);
                break;
            }
        }
    }
}
