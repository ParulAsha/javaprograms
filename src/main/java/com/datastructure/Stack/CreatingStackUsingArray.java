package com.datastructure.Stack;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

public class CreatingStackUsingArray {
    static final int MAX=100;
    int top;
    int[] stackArray=new int[MAX];

    public CreatingStackUsingArray() {
        top=-1;

    }
    public void push(int data)
    {
        if(top>MAX-1)
            System.out.println("overflow");
        stackArray[++top]=data;
    }
    public boolean isEmpty()
    {
        if(top<0)
            return true;
        else
            return false;
    }
    public int pop()
    {
        if(top<0) {
            System.out.println("stack is underflow");
            return 0;
        }
        int x=stackArray[top--];
        return x;
    }
    public int seek()
    {
        int x=stackArray[top];
        return x;
    }
    public void printArray()
    {
        int len=stackArray.length;
        for(int i=0;i<len-1;i++)
        {
            System.out.println(stackArray[i]);
        }
    }

    public static void main(String[] args)
    {
        CreatingStackUsingArray creatingStackUsingArray=new CreatingStackUsingArray();
        creatingStackUsingArray.isEmpty();
        creatingStackUsingArray.pop();
        creatingStackUsingArray.push(8);
        creatingStackUsingArray.push(9);
        creatingStackUsingArray.push(10);
        System.out.println(creatingStackUsingArray.pop());
        System.out.println(creatingStackUsingArray.seek());

    }
}
