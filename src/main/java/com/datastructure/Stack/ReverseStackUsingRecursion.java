package com.datastructure.Stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {
  static   Stack<Integer> s= new Stack<>();
   static Stack<Integer> s2=new Stack<>();
    public Stack<Integer> reverseUsingRecursion()
    {

        if(s.size()>0)
        {


            int x=s.peek();
         //   System.out.println(x);
            s.pop();
            s2.push(x);
            reverseUsingRecursion();

            //System.out.println(s2.peek());

        }
        return s2;
    }
    public void printStack(Stack<Integer> s)
    {
        while(!s.empty())
        {
            System.out.println(s.pop());

        }
    }
    public static void main(String[] args)

    {   ReverseStackUsingRecursion reverseStackUsingRecursion=new ReverseStackUsingRecursion();
    Stack<Integer> s2;
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s2=  reverseStackUsingRecursion.reverseUsingRecursion();
        reverseStackUsingRecursion.printStack(s2);

    }

}
