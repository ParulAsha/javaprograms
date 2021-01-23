package com.datastructure.Queue;

public class CreateQueueUsingLinkedList {
    private   static Node front;
    private    static Node rear;
    private   static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public void enqueData(int data)
    {
        Node newNode=new Node(data);
        if(front==null)
        {
            front=newNode;
            rear=newNode;
        }

        else {
            rear.next = newNode;
            rear = newNode;
        }

    }
    public int  deque()
    {
        int deletedNode=front.data;
        front=front.next;
        return deletedNode;
    }

    public static void main(String[] args)
    {
        CreateQueueUsingLinkedList createQueueUsingLinkedList= new CreateQueueUsingLinkedList();
        createQueueUsingLinkedList.enqueData(2);
        createQueueUsingLinkedList.enqueData(4);
        createQueueUsingLinkedList.enqueData(5);
        createQueueUsingLinkedList.enqueData(6);
        System.out.println(createQueueUsingLinkedList.deque());
        System.out.println(createQueueUsingLinkedList.deque());

    }
}