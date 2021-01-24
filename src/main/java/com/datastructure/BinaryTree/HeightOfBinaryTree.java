package com.datastructure.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node( int data)
    {
        this.data=data;
        left=null;
        right=null;

    }
}
public class HeightOfBinaryTree {
   static Node root;
    public int height(Node root)
    {
        int h=0;
        if(root==null)
        return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);
        if(lheight>rheight)
            h= 1+lheight;
        else
            h=1+rheight;
        return h;


    }
    public void levelOrderTraversal(Node root,int height)
    {

        for(int i=1;i<=height;i++)
        {
            printDataOnEachLevel(root,i);
        }
    }

   public void printDataOnEachLevel(Node root,int i)
   {
       if(root==null)
           return ;
       if(i==1)
           System.out.println(root.data);
       else if(i>1){
           printDataOnEachLevel(root.left,i-1);
           printDataOnEachLevel(root.right,i-1);

       }
   }
   public void printLevelOrderTraversalUsingQueue(Node root)
   {
       Queue<Node> queue=new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty())
       {
           int data=queue.peek().data;
           System.out.println(data);
           if(queue.peek().left!=null)
           queue.offer(queue.peek().left);
           if(queue.peek().right!=null)
           queue.offer(queue.peek().right);
           queue.poll();
       }
   }
    public static  void main(String[] args)
    {

        HeightOfBinaryTree tree= new HeightOfBinaryTree();

        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
       // int height=tree.height(root);
       // tree.levelOrderTraversal(root,height);
      // System.out.println(height);
       // heightOfBinaryTree.levelOrderTraversal(root,height);
        tree.printLevelOrderTraversalUsingQueue(root);
    }
}
