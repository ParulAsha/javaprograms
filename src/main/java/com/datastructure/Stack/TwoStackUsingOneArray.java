package com.datastructure.Stack;

public class TwoStackUsingOneArray {
    private int array[];
   private int top1,top2;
   private   int size;
    TwoStackUsingOneArray(int n)
    {   array=new int[n];
        size=n;
        top1=-1;
        top2=size;
    }

    public void push1(int x)
    {
        if(top1<top2-1)
            array[++top1]=x;
        else
        {
            System.out.println("stack overflow");
            System.exit(0);
        }
    }
    public void push2(int x)
    {
        if(top1<top2-1)
        {
            array[--top2]=x;
        }
        else
        {
            System.out.println("stack overflow");
            System.exit(0);
        }

    }
    public int pop1()
    {  int x=0;
        if(top1>=0)
        {
            x=array[top1--];
        }
        else{
            System.out.println(" stack underflow");
        }
        return x;
    }

    public int pop2()
    {
        int x=0;
        if(top2<=size)
        {
            x=array[top2--];

        }
        else
        {
            System.out.println("stack underflow");
        }
        return x;
    }
    public static void main(String[] args)
    {
        TwoStackUsingOneArray twoStackUsingOneArray= new TwoStackUsingOneArray(100);
        twoStackUsingOneArray.push1(1);
        twoStackUsingOneArray.push1(2);
        twoStackUsingOneArray.push1(3);
        twoStackUsingOneArray.push1(4);

        twoStackUsingOneArray.push2(7);
        twoStackUsingOneArray.push2(8);
        twoStackUsingOneArray.push2(9);
        twoStackUsingOneArray.push2(10);

        System.out.println(twoStackUsingOneArray.pop1());
        System.out.println(twoStackUsingOneArray.pop1());
        System.out.println(twoStackUsingOneArray.pop1());
    }
}
