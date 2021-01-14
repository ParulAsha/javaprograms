package com.datastructure.LinkedList;

import java.util.HashSet;

class DetectLoopInLinkedList {
   static Node head;
   static int count=0;
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public boolean detectLoopUsingHashset(Node head)
    {
        System.out.println("parul");
        HashSet<Node> s=new HashSet<Node>();
        Node temp=head;
        while(temp.next!=null)
        {   if(s.contains(temp))
            return true;
            s.add(temp);
            temp=temp.next;
        }


       return false;
    }
    public void printList()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
        }
    }

    public boolean detectLoopUsingSlowAndFastPoiter(Node head)
    {
      //  System.out.println("parul");
        int flag=0;

        Node slow_ptr=head,fast_ptr=head;
        while(slow_ptr!=null&&fast_ptr!=null&&fast_ptr.next!=null)
        {   count++;
            //System.out.println(count);

            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(slow_ptr==fast_ptr) {

                return true;
            }
            //System.out.println(count);
        }
       // System.out.println(count);

        return false;
    }

    public static void main(String[] args)
    {
        DetectLoopInLinkedList list=new DetectLoopInLinkedList();
        list.head=new Node(3);
        Node second=new Node(3);
        Node third=new Node(5);
        Node fourth=new Node(6);
        Node five=new Node(7);
        Node sixth=new Node(6);
        Node seventh=new Node(6);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=sixth;
        sixth.next=seventh;
        seventh.next=second;
        //boolean result=list.detectLoopUsingHashset(head);
        boolean result2=list.detectLoopUsingSlowAndFastPoiter(head);
       // System.out.println(result);
       // list.printList();
       System.out.println(result2);
        System.out.println(count);



    }
}
