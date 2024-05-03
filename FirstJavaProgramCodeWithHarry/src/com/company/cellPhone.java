package com.company;
 class  Phone{
     public void ring(){
         System.out.println("ringing.....");
     }
     public void vibrate(){
         System.out.println("vibrating...");
     }
     public  void callFriend(){
         System.out.println("Call to A friend..");
     }
 }
public class cellPhone {
    public static void main(String[] args) {
             Phone redmi=new  Phone();
            redmi.callFriend();
            redmi.ring();
            redmi.vibrate();
    }
}
