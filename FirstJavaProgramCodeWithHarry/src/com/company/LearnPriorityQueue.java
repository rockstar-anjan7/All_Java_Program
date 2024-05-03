package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//        Queue<Integer> pq=new PriorityQueue<>();
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); // it reverse the order from min-Heap to max-Heap.
        // priority queue states that here in queue all have their own priority on the basis of that it makes queue.
        // here by default it makes on the basis of minimum element.
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        // Output: 12 36 24 40

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());



    }
}
