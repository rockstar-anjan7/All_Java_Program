package com.company;

class MythreadMan extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<400) {
            System.out.println("I am thread 1");
            i++;
        }
    }
}
class MythreadWomen extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<400) {
            System.out.println("I am thread 2");
            i++;
        }

    }
}

public class MyThreadUsingExtends {
    public static void main(String[] args) {

        MythreadMan t1=new MythreadMan();
        MythreadWomen t2=new MythreadWomen();

        t1.start();
        t2.start();

    }
}
