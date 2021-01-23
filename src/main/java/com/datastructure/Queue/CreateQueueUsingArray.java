package com.datastructure.Queue;

import java.util.Arrays;

public class CreateQueueUsingArray {
    private int front = 0, rare = 0;
    private int n = 100;
    private int[] Array = new int[n];

    public void enqueData(int data) {
        if (rare == n) {
            System.out.println(" Queue is full");


        } else {
            Array[rare++] = data;
        }

    }

    public int dequeueData() {
        int item = Array[front];
        front = front++;
        return item;

    }

    void printQueue() {
        for (int i = front; i <= rare - 1; i++) {
            System.out.println(Array[i]);
        }
    }

    public static void main(String[] args) {
        CreateQueueUsingArray createQueueUsingArray = new CreateQueueUsingArray();
        createQueueUsingArray.enqueData(4);
        createQueueUsingArray.enqueData(5);
        createQueueUsingArray.enqueData(6);
        createQueueUsingArray.enqueData(7);
        createQueueUsingArray.enqueData(8);
        createQueueUsingArray.printQueue();
    }

}