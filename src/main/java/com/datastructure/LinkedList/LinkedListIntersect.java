package com.datastructure.LinkedList;
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class LinkedListIntersect {

    public int countNode(Node n1) {
        Node temp = n1;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public Integer findDifferenceNode(Node n1, Node n2, int len1, int len2) {
        int d = 0;
        int result =0;
        if (len1 > len2) {
            d = len1 - len2;
            result=findMergePoint(n1, n2, d);
        } else {
            d = len2 - len1;
            result=findMergePoint(n2, n1, d);

        }
        return result;
    }

    public Integer findMergePoint(Node n1, Node n2, int d) {
        Node temp = n1;
        Node temp2=n2;
        for (int i = 0; i < d; i++) {
            temp=temp.next;
        }

        while(temp!=null && temp2!=null)
        {
            if(temp.data==temp2.data)
                return temp.data;
            temp=temp.next;
            temp2=temp2.next;

        }
        return -1;
    }
        public static void main (String[]args){
            // list 1
            Node n1 = new Node(1);
            n1.next = new Node(2);
            n1.next.next = new Node(3);
            n1.next.next.next = new Node(4);
            n1.next.next.next.next = new Node(5);
            n1.next.next.next.next.next = new Node(6);
            n1.next.next.next.next.next.next = new Node(7);
            // list 2
            Node n2 = new Node(10);
            n2.next = new Node(9);
            n2.next.next = new Node(8);
            n2.next.next.next = n1.next.next.next;
            LinkedListIntersect list = new LinkedListIntersect();
            int len1 = 0, len2 = 0;
           len1= list.countNode(n1);
            len2=list.countNode(n2);
           int result= list.findDifferenceNode(n1,n2,len1,len2);
            System.out.println(result);
        }
    }