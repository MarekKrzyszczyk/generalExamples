package com.sda.datastructures.ex05;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> tasks = new ArrayDeque<>();
        tasks.add("zadanie1");
        tasks.add("zadanie2");
        tasks.add("zadanie3");
        tasks.add("zadanie4");
        tasks.add("zadanie5");

        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
    }
}
