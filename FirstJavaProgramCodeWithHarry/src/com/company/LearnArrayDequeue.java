package com.company;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        // arrayDequeue means a datastructure  where we can add and delete from both side.
        adq.offer(34);
        adq.offerFirst(64);// it adds element from head side.
        adq.offerLast(87);// it adds element from behind side.

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


        System.out.println(adq.poll());

        System.out.println(adq.pollFirst());

        System.out.println(adq.pollLast());
    }
}
