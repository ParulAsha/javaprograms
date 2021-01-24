package com.datastructure.Queue;

import java.util.Stack;

public class CreateQueueUsingStack {
   private Stack<Integer> stack1=new Stack();
    public void enque(int data)
    {



            stack1.push(data);

    }
    public int  deque()
    {
         int data=-1;
        if(stack1.isEmpty())
            return data;
        else {
            Stack<Integer> stack2 = new Stack<>();
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());

            }
             data=stack2.pop();

            while(!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
        }
        return data;
    }
    public static void main(String[] args)
    {
        CreateQueueUsingStack createQueueUsingStack=new CreateQueueUsingStack();
        createQueueUsingStack.enque(4);
        createQueueUsingStack.enque(7);
        createQueueUsingStack.enque(9);
        System.out.println(createQueueUsingStack.deque());
        createQueueUsingStack.enque(8);
        createQueueUsingStack.enque(3);
        createQueueUsingStack.enque(2);
        System.out.println(createQueueUsingStack.deque());
        System.out.println(createQueueUsingStack.deque());
        System.out.println(createQueueUsingStack.deque());

        System.out.println(createQueueUsingStack.deque());
        System.out.println(createQueueUsingStack.deque());



    }
}
