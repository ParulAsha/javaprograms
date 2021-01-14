package com.datastructure.LinkedList;

public class LengthOfLoopInLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }


    public static int countNodeLoop(Node n) {
        System.out.println("parul");
        int count = 1;
        Node temp = n;
        while (temp.next != n) {
            count++;
           // System.out.println(count);
            temp = temp.next;
        }
       // System.out.println(count);
        return count;
    }

    public static int detectLoopInLinkedList(Node head) {
        Node slow_ptr = head, fast_ptr = head;
        while (slow_ptr !=null && fast_ptr!=null && fast_ptr.next!=null)  {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next;
            if (slow_ptr == fast_ptr)
                return countNodeLoop(slow_ptr);
        }

             return 0;

    }

    public static void main(String[] args) {
        int count = 0;
        LengthOfLoopInLinkedList list = new LengthOfLoopInLinkedList();
        list.head = new Node(1);
        Node first = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fiveth = new Node(7);
        Node sixth = new Node(8);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fiveth;
        fiveth.next = sixth;
        sixth.next = second;
        count = list.detectLoopInLinkedList(head);
        System.out.println(count);


    }
}
