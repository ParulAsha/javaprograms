package com.datastructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class SortingQueueWithoutUsingExtraSpace {

    public int minIndex(Queue<Integer> list, int sortedIndex) {
        int minIndex = -1;
        int minvalue = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++) {
            int current = list.peek();
            list.poll();
            if (minvalue > current && i <= sortedIndex) {
                minIndex = i;
                minvalue = current;

            }
            list.offer(current);
        }
        return minIndex;
    }

    public void swapIndex(Queue<Integer> list, int minIndex) {
        int s = list.size();

        int minvalue=0;
        for (int i = 0; i < s; i++) {
            int data = list.poll();
            if (i == minIndex)
                minvalue = data;
            else
                list.add(data);
        }
        list.add(minvalue);
    }

    public void sortQueueUsing(Queue<Integer> list) {
        int s = list.size();
        for (int i = 1; i<=s; i++) {
            int minIndex = minIndex(list, s - i);
            swapIndex(list, minIndex);
        }
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(7);
        queue.offer(1);
        queue.offer(29);
        queue.offer(2);
        SortingQueueWithoutUsingExtraSpace s=new SortingQueueWithoutUsingExtraSpace();
        s.sortQueueUsing(queue);
        while(queue.isEmpty()== false)
        {
            System.out.print(queue.peek() + " ");
            queue.poll();
        }
    }
}
