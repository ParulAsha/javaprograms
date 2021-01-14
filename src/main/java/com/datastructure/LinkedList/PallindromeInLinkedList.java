package com.datastructure.LinkedList;

import java.util.Stack;

public class PallindromeInLinkedList {

    public boolean isPallindrome(InsertionLinkedList.Node head)

    {   boolean flag=true;
        InsertionLinkedList.Node temp=head;
        InsertionLinkedList.Node temp2=head;
        Stack<Integer> stack=new Stack<>();
        while(temp!=null)
        {
            stack.push(temp.data);
            temp=temp.next;
            //System.out.println("parul");

            //System.out.println(stack.pop());

        }
        while(temp2!=null && !stack.empty()) {
            // System.out.println(temp2.data);
            // System.out.println(stack.pop());
        if (temp2.data != stack.pop())
                return false;
            System.out.println(flag);
            temp2 = temp2.next;
        }

       return flag;
    }
    public static void main(String[] args)

    {  PallindromeInLinkedList  plist=new PallindromeInLinkedList();
        InsertionLinkedList list =new InsertionLinkedList();

        list.insertAtTheBeginning(1);
        list.appendAtTheEnd(2);
        list.appendAtTheEnd(1);
        list.appendAtTheEnd(2);
        list.appendAtTheEnd(1);
        InsertionLinkedList.Node head=list.getHead();
       // System.out.println(head);
        //list.printList();
       boolean result= plist.isPallindrome(head);
        System.out.println(result);


    }
}
