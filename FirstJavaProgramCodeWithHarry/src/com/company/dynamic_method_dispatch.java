package com.company;

class Phone1{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone1{
    public void music(){
        System.out.println("Playing music...");
    }
    public void showTime(){
        System.out.println("Time is 10 am");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone1 obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed


    }
}
