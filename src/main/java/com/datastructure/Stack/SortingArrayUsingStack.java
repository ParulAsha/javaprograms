package com.datastructure.Stack;

import java.util.Stack;

public class SortingArrayUsingStack {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    public Stack<Integer> sortUsingTemporaryStack()
    {
        while (!stack1.isEmpty())
        {
            int temp=stack1.peek();
            stack1.pop();
            while(!stack2.isEmpty()&&stack2.peek()<temp)
            {
              stack1.push(stack2.pop());
            }
            stack2.push(temp);
        }
   return  stack2;
    }
    public void sortUsingStack(int[] array)
    {
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            stack1.push(array[i]);
        }
      Stack<Integer> tempStack=  sortUsingTemporaryStack();
        for(int i=0;i<len;i++)
        {
            array[i]=tempStack.peek();
            System.out.println(array[i]);
            tempStack.pop();
        }

    }



    public static void main(String[] args)
    {
        int[] array={4,5,1,8,9,1};
        SortingArrayUsingStack sortingArrayUsingStack=new SortingArrayUsingStack();
        sortingArrayUsingStack.sortUsingStack(array);

    }
}
