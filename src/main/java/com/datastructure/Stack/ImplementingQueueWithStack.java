package com.datastructure.Stack;

import java.util.Stack;

public class ImplementingQueueWithStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    public void enque(int data)

    {
        stack1.push(data);

    }
    public int dequeue()
    {
        while(!stack1.empty())
        {
            stack2.push(stack1.pop());
        }
        int x=stack2.pop();
        return x;
    }
    public static void main(String[] args)
    {
        ImplementingQueueWithStack implementingQueueWithStack=new ImplementingQueueWithStack();
        implementingQueueWithStack.enque(1);
        implementingQueueWithStack.enque(2);
        implementingQueueWithStack.enque(3);
        implementingQueueWithStack.enque(4);
        implementingQueueWithStack.enque(4);
        System.out.println(implementingQueueWithStack.dequeue());
    }
}
