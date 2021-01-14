package com.datastructure.LinkedList;

public class CreateLinkedList {
   public static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }


    }

    public void printlist(Node head)
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+"  ");
            n= n.next;
        }


    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
   /* public void printReverseLinkedList(Node head)
    {
        System.out.println("parul");
        Node temp=head;
        System.out.println(temp);
        while(temp.next!=null)
        {
            System.out.println("parul");
            System.out.println(temp.data);
        }
    }*/

    public static void main(String[] args)

    {

        CreateLinkedList list=new CreateLinkedList();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third= new Node(3);
        Node fourth=new Node(4);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        //list.printlist();
        Node headnew=list.reverse(head);
        list.printlist(headnew);

    }
}
