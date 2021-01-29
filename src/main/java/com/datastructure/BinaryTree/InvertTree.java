package com.datastructure.BinaryTree;

public class InvertTree {
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
     public  void invertBinaryTree(Node root) {
         if (root.left != null && root.right!=null) {
             int temp = root.left.data;
             root.left.data=root.right.data;
             root.right.data=temp;
             if(root.left!=null)
             invertBinaryTree(root.left);
             if(root.right!=null)
             invertBinaryTree(root.right);

         }
     }
     public void printNode(Node root)
     {
         if(root!=null)
         {
             System.out.print(root.data+" ");
             if(root.left!=null)
                 printNode(root.left);
             if(root.right!=null)
                 printNode(root.right);
         }

     }
    public static void main(String[] args)
    {
        InvertTree invertTree=new InvertTree();
        invertTree.root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        invertTree.printNode(root);
        invertTree.invertBinaryTree(root);
        System.out.println();
        System.out.println("after inversion");
        invertTree.printNode(root);

    }
}
