package com.datastructure.LinkedList;

public class DeletionLinkedList {


    public void setHead(InsertionLinkedList.Node head) {
        this.head = head;
    }

    public InsertionLinkedList.Node getHead() {
        return head;
    }

    private InsertionLinkedList.Node head;

    /*  public void deleteTheFirstElement(InsertionLinkedList.Node Head,int data)
       {

           InsertionLinkedList.Node temp=Head;
           InsertionLinkedList.Node prev=null;
         //  Head=temp.next;
          // System.out.println(Head);
           //return;


          while(temp.next!=null)
           {

               if(temp.data==data)
                   prev.next=temp.next;
               prev=temp;
               temp=temp.next;
           }


       }

    */
 void deleteNode(int key)
 {
     // Store head node
     InsertionLinkedList.Node temp = head, prev = null;

     // If head node itself holds the key to be deleted
     if (head!= null && head.data == key)
     {
         head = head.next; // Changed head
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
    static InsertionLinkedList.Node removeFirstNode(InsertionLinkedList.Node head)
    {
        if (head == null)
            return null;

        // Move the head pointer to the next node
        InsertionLinkedList.Node temp = head;
        head = head.next;

        return head;
    }

    public static void main(String[] args)
    {
        InsertionLinkedList list=new InsertionLinkedList();
        DeletionLinkedList list1=new DeletionLinkedList();
        list.insertAtTheBeginning(4);
        list.insertAtTheBeginning(5);
        list.insertAtTheBeginning(6);
        //list.insertAtSpecifiedPosition(2,6);
        list.appendAtTheEnd(7);
       // list.printList();
        InsertionLinkedList.Node head=list.getHead();
        list1.setHead(head);
        //list1.deleteTheFirstElement(head,6);
       // list1.deleteNode(6);
        list1.removeFirstNode(head);
        list.printList();

    }
}
