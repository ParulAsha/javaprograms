package com.datastructure.BinaryTree;

public class CreatingBinaryTree {
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;

        }
    }
    CreatingBinaryTree(int key)
    {
        root=new Node(key);
    }
    CreatingBinaryTree()
    {
        root=null;
    }
    public static void main(String args[])
    { CreatingBinaryTree tree=new CreatingBinaryTree();
    tree.root=new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
    tree.root.left.left= new Node(4);
    tree.root.left.right=new Node(5);

    }
}
