package com.datastructure.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingRecursion {

    public Queue<Integer> reverseQueue(Queue<Integer> queue)
    {
        if(queue.isEmpty())
            return queue;
        int data=queue.poll();
        reverseQueue(queue);
        queue.offer(data);

        return queue;
    }
    public Queue<Integer> reverseUsingStack(Queue<Integer> queue)
    {
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while(!stack.isEmpty())
        {
            queue.offer(stack.pop());
        }
        return queue;
    }
    public static void main(String[] args)
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(8);
        ReverseQueueUsingRecursion reverseQueueUsingRecursion=new ReverseQueueUsingRecursion();
        reverseQueueUsingRecursion.reverseQueue(queue);
        // reverseQueueUsingRecursion.reverseUsingStack(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}