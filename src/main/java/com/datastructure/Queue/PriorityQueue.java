package com.datastructure.Queue;

 class Node {
     int data, priority;
     Node next;

     Node(int data, int priority) {
         this.data = data;
         this.priority = priority;
         next = null;
     }

 }


public class PriorityQueue {

 static Node head;
    public int pop()
    {


          int  data=head.data;
            head = head.next;


            //System.out.println(data);



        return data;
    }
    int peek()
    {
        int data=head.data;
        return data;
    }
    public void push(int data,int priority)
    {
        Node newNode =new Node(data,priority);
        if(head==null) {
            head = newNode;
            //System.out.println(" head is null"+head.data);
        }
       else if(head.priority>priority)
        {
            newNode.next=head;
            head=newNode;
            //System.out.println("head greator than "+head.data+" "+ head.next.data);
        }
        else
        {
            Node temp=head;
            while(temp.next!=null&&temp.next.priority<priority)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
     public static void main(String[] args)
     {
         PriorityQueue priorityQueue=new PriorityQueue();
         priorityQueue.push(89,6);
         priorityQueue.push(78,2);
        priorityQueue.push(79,5);
         priorityQueue.push(71,8);
        priorityQueue.push(45,3);
        //System.out.println( priorityQueue.pop());
      //   System.out.println( priorityQueue.pop());
      //  System.out.println( priorityQueue.pop());
      //  System.out.println( priorityQueue.pop());
       //  System.out.println( priorityQueue.pop());
         priorityQueue.print();


     }
}
