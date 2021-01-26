package com.datastructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthfirstAndDepthFirstTraversal{

    static Node root;
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public void breadthFirstSearch(Node root)
    {
        System.out.println("breadthfirst traversal is called");
        if(root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp=queue.peek();

            System.out.print(temp.data+" ");
            if(temp.left!=null)
            queue.add(temp.left);
            if(temp.right!=null)
            queue.add(temp.right);

              queue.poll();

        }
    }

    public void depthFirstSearch(Node root)
    {

        Node temp=root;
        if(temp==null)
            return;
          System.out.print(temp.data+" ");
            if(temp.left!=null)
                depthFirstSearch(temp.left);
            if(temp.right!=null)
                depthFirstSearch(temp.right);

    }
    public static void main(String[] args)
    {
        BreadthfirstAndDepthFirstTraversal tree=new BreadthfirstAndDepthFirstTraversal();
        tree.root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        tree.breadthFirstSearch(root);
        System.out.println();
        System.out.println("depth first search");
        tree.depthFirstSearch(root);

    }

}
