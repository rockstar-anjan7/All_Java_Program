package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);// it is used to add the element in queue.

        System.out.println(queue);

        queue.poll();// it is used to delete the element form front end;
        System.out.println(queue);

        System.out.println(queue.peek());// it is just tell us the next element which is going to be delete.
    }
}
