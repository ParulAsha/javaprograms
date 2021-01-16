package com.datastructure.Stack;

public class CreateStackUsingLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    boolean isEmpty()
    {
        if (head==null)
        return true;
        else
            return false;
    }
    public int pop()
    {
        int x=Integer.MIN_VALUE;
        if(head==null)
            System.out.println("stack is underflow");
        else {
            x = head.data;
            head = head.next;
        }
          return x;


    }
    public void push(int data)
    {
        Node newNode= new Node(data);
          if(head==null)
              head=newNode;
          else
              newNode.next=head;
          head=newNode;
    }
    public int peek()
    {
        int x=Integer.MIN_VALUE;
        if(head==null)
            System.out.println("empty list");
        x=head.data;
        return x;
    }
    public void printList()
    { Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        CreateStackUsingLinkedList createStackUsingLinkedList=new CreateStackUsingLinkedList();
        createStackUsingLinkedList.pop();
        createStackUsingLinkedList.push(1);
        createStackUsingLinkedList.push(2);
        createStackUsingLinkedList.push(3);
        createStackUsingLinkedList.push(4);
        createStackUsingLinkedList.push(5);
        System.out.println(createStackUsingLinkedList.peek());

        System.out.println(createStackUsingLinkedList.pop());
        System.out.println(" after pop");
        createStackUsingLinkedList.printList();


    }
}
