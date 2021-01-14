package com.datastructure.LinkedList;

public class PairwiseSwapNode {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void append(int data) {

        Node new_node= new Node(data);
        if(head==null) {
            //  System.out.println(head);
            head = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }
    }


   public Node  swapPairwise(Node head)
    {  int k;
       Node curr=head;
       Node prev=null;
       Node next=null;
       while(curr!=null)
       {
           prev=curr;
           curr=curr.next;
           next=curr.next;
           k=curr.data;
           curr.data=prev.data;
           prev.data=k;
           curr=next;
       }
     return head;
    }
    void printlist(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
   public void swapLastElementToFirst()
   {
       Node temp=head;
       Node prev=null;
       while(temp.next!=null)
       {
           prev=temp;
           temp=temp.next;

       }
       System.out.println("kddk");
       prev.next=null;
       temp.next=head;
       head=temp;

   }
    void moveToFront()
    {
        /* If linked list is empty or it contains only
           one node then simply return. */
        if(head == null || head.next == null)
            return;

        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;

        /* After this loop secLast contains address of
           second last  node and last contains address of
           last node in Linked List */
        while (last.next != null)
        {
            secLast = last;
            last = last.next;
        }

        /* Set the next of second last as null */
        secLast.next = null;

        /* Set the next of last as head */
        last.next = head;

        /* Change head to point to last node. */
        head = last;
    }
    public static void main(String[] args) {
        PairwiseSwapNode list = new PairwiseSwapNode();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.printlist(head);
     // Node head2= list.swapPairwise(head);
      //  System.out.println(" pair wise swapped list");
      //  list.printlist(head2);
        list.swapLastElementToFirst();
        System.out.println("swapping first and last place");
       // list.moveToFront();
        list.printlist(head);

    }
}
