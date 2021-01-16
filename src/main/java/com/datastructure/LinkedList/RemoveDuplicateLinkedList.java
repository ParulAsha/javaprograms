package com.datastructure.LinkedList;

public class RemoveDuplicateLinkedList {

    public void removeDuplicate(InsertionLinkedList.Node head)
    {
        InsertionLinkedList.Node temp=head;
        InsertionLinkedList.Node prev=null;

      try {
          while (temp != null) {
              System.out.println(temp.data);
              if ( temp!=null&&(temp.data == temp.next.data))
                  temp = temp.next.next;
              else
                  temp = temp.next;

          }
      }
      catch (Exception e)
      {
          System.out.println("null pointer exception");
      }
    }
public void removeDuplicatesFromUnsortedList(InsertionLinkedList.Node head)
{
    InsertionLinkedList.Node temp=head;
    InsertionLinkedList.Node prev=null;
    InsertionLinkedList.Node temp2=head;
    for (InsertionLinkedList.Node i=temp;i.next!=null;i=i.next)
    {
        for (InsertionLinkedList.Node j=temp2;j.next!=null;j=j.next)
        {
            j=j.next;
            System.out.println(j.data);
            prev=j;
            if(i.data==j.data)
                prev.next=j.next;

        }
    }

}
    public static void main(String args[])
    {
        InsertionLinkedList list= new InsertionLinkedList();
        RemoveDuplicateLinkedList list2=new RemoveDuplicateLinkedList();
        list.insertAtTheBeginning(1);
        list.insertAtTheBeginning(2);
        list.insertAtTheBeginning(3);
        list.insertAtTheBeginning(3);
        list.insertAtTheBeginning(4);
        list.insertAtTheBeginning(5);
        InsertionLinkedList.Node head= list.getHead();
       // System.out.println(head);
       list2.removeDuplicate(head);
       // list2.removeDuplicatesFromUnsortedList(head);
       //list.printList();
    }
}
