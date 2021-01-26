package com.datastructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckingCompleteBinaryTree {
    static Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public boolean checkIfTreeIsBoolean(Node root)
    {
        Queue<Node> queue=new LinkedList<>();
        boolean flag=false;
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp=queue.remove();
            if(temp.left!=null)
            {
                if(flag==true)
                    return false;
                queue.add(temp.left);
            }
            else
                flag=true;
            if(temp.right!=null)
            {
                if(flag==true)
                    return false;
                queue.add(temp.right);

            }
            else
                flag=true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        CheckingCompleteBinaryTree checkingCompleteBinaryTree=new CheckingCompleteBinaryTree();
        checkingCompleteBinaryTree.root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        root.right.right.right=new Node(9);


       boolean b= checkingCompleteBinaryTree.checkIfTreeIsBoolean(root);
        System.out.println(b);
    }
}
