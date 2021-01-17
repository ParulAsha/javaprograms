package com.datastructure.Stack;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementingStackWithQueue {
    Queue<Integer> queue1= new LinkedList<>();
    Queue<Integer> queue2= new LinkedList<>();

    public int pop()
    {
        int x=Integer.MIN_VALUE;
       // queue2.offer(queue1.poll());
        x=queue1.remove();
        return x;
    }
    public void  push(int data)

    {  if(!queue1.isEmpty()) {
        while (!queue1.isEmpty()) {

            queue2.offer(queue1.remove());
           // System.out.println(" q1 empty"+queue2.peek());
        }
        queue1.offer(data);
        //System.out.println(queue1.peek());
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.remove());
           //System.out.println(" q2 empty"+queue1.peek());
        }
    }
    else {
        queue1.offer(data);
       //System.out.println("esle"+queue1.peek());
    }
    }
 public void printQueueue()

    {
        Iterator iterator = queue1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
    public static void main(String[] args)
    {
      ImplementingStackWithQueue implementingStackWithQueue=new ImplementingStackWithQueue();
      implementingStackWithQueue.push(5);
        implementingStackWithQueue.push(6);
        implementingStackWithQueue.push(7);
        implementingStackWithQueue.push(8);
        System.out.println(implementingStackWithQueue.pop());
        System.out.println(implementingStackWithQueue.pop());
        implementingStackWithQueue.printQueueue();


    }
}
