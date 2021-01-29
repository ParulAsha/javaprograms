package com.datastructure.Graph;

import java.util.*;

public class BFSDFSGraph {
    ArrayList<ArrayList<Integer>> adj;
    private int  v;

    BFSDFSGraph(int v) {

        this.v=v;
        adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());
    }

    public void addEdge(int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void BfS(int s)
    {

        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.println(s);
            Iterator<Integer> i = adj.get(s).listIterator();
            while(i.hasNext())
            {
                int n=i.next();

                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }




public void Dfs(int value)
{
    boolean[] visited=new boolean[v];
     DFSUtil(value,visited);
}
public void DFSUtil(int value,boolean[] visited)
{
    visited[value]=true;
    System.out.print(" "+value);
    Iterator<Integer> i=adj.get(value).listIterator();
    while(i.hasNext())
    {
        int n=i.next();
        if(!visited[n])
            DFSUtil(n,visited);

    }
}
/*

public void DFSUsingStack(int value) {
    boolean[] visited = new boolean[v];
    boolean[] explored = new boolean[v];
    Stack<Integer> stack = new Stack<Integer>();
    visited[value]=true;
    stack.push(value);
    while (!stack.isEmpty()) {
    int data=stack.pop();
     DFSUtilUsingStack();
    }
}
public void DFSUtilUsingStack(Stack<Integer> stack,boolean[] visited,boolean[] explored,int value)
{

}
*/
    public static void main(String[] args)
    {

        BFSDFSGraph graph=new BFSDFSGraph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
      //  graph.BFS(0);
      //  graph.BfS(0);
        graph.Dfs(0);

    }
}
