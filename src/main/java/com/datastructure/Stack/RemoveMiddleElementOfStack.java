package com.datastructure.Stack;

import com.datastructure.LinkedList.RemoveDuplicateLinkedList;

import java.util.Iterator;
import java.util.Stack;

public class RemoveMiddleElementOfStack {
    static Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    private static  int count=0;
    private static int x=0;
    public void deleteMiddleElemtentOfStack()

    {

        while(!stack1.empty())
        {
            count++;
            stack2.push(stack1.pop());

        }
        System.out.println("count"+ count);
        while(!stack2.isEmpty())
        {

            x++;
            if(x!=count/2) {
                //System.out.println(x);
                stack1.push(stack2.pop());

                System.out.println(x+" "+stack1.peek());
            }
            else stack2.pop();


        }
    }

    public void printStack()

    {
        Iterator iterator = stack1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
    public static void main(String[] args)

    {
        RemoveMiddleElementOfStack removeMiddleElementOfStack=new RemoveMiddleElementOfStack();
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
      //  System.out.println("before calling removeMiddleElementOfStack");
        //removeMiddleElementOfStack.printStack();
       removeMiddleElementOfStack.deleteMiddleElemtentOfStack();
       // System.out.println("after calling removeMiddleElementOfStack");
      //removeMiddleElementOfStack.printStack();


    }
}
