package com.datastructure.BinaryTree;

public class TreeTraversal {
    static Node root;
    static  class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public void inOrderTraversal(Node root)
    {
        Node temp=root;
        if(temp==null)
            return;

        inOrderTraversal(temp.left);
        System.out.print(temp.data+" ");
        inOrderTraversal(temp.right);
    }
    public void postOrderTraversal(Node root)
    {
        Node temp=root;
        if(temp==null)
            return;

        postOrderTraversal(temp.left);
        postOrderTraversal(temp.right);
        System.out.print(temp.data+" ");
    }
   public void preOrder(Node root)
   {
       Node temp=root;
       if(temp==null)
           return;
       System.out.print(temp.data+" ");
       preOrder(temp.left);
       preOrder(temp.right);


   }
   public static void main(String[] args)
   {
       TreeTraversal treeTraversal=new TreeTraversal();
       treeTraversal.root=new Node(2);
       root.left=new Node(3);
       root.right=new Node(4);
       root.left.left=new Node(5);
       root.left.right=new Node(6);
       root.right.left=new Node(7);
       root.right.right=new Node(8);
       root.left.right.left=new Node(9);
       root.left.right.right=new Node(10);
       treeTraversal.preOrder(root);
       treeTraversal.postOrderTraversal(root);
       treeTraversal.inOrderTraversal(root);
   }
}
