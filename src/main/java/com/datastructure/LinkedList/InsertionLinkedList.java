package com.datastructure.LinkedList;

public class InsertionLinkedList {
     public static Node head;

    public  Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        InsertionLinkedList.head = head;
    }

    static  class Node{
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
           next=null;
       }
   }

   public void insertAtTheBeginning(int data)
   {


       Node new_node= new Node(data);
       if(head==null) {
         //  System.out.println(head);
           head = new_node;
       }
       else {
           new_node.next = head;
           head = new_node;
       }
      // setHead(head);
       //System.out.println(getHead());
   }

   public void appendAtTheEnd(int data)
   {
      // System.out.println("int the function append");
       Node temp=head;
       Node newNode=new Node(data);
       while(temp.next!=null)
       {
           temp=temp.next;

       }
       temp.next=newNode;
   }
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void insertAtSpecifiedPosition(int pos, int data)
   {
       Node newNode=new Node(data);
       Node temp=head;

       Node prev=null;
       int count=0;
       while(temp!=null)
       {
           count++;
          // System.out.println(count);
           if(count==pos)
           {
               newNode.next=temp;
               prev.next=newNode;


           }
           prev=temp;
           temp=temp.next;

       }

   }
   public void printList()
   {
       Node n=head;
       while(n!=null)
       {
           System.out.println(n.data);
           n=n.next;
       }
   }

    public static void main(String[] args)
    {
    InsertionLinkedList list=new InsertionLinkedList();
    list.insertAtTheBeginning(3);
       // list.printList();
        list.insertAtTheBeginning(4);
    //list.printList();
    list.insertAtSpecifiedPosition(2,6);
    list.appendAtTheEnd(7);


       list.deleteNode(4);
        list.printList();
        System.out.println( list.getHead());

    }
}
