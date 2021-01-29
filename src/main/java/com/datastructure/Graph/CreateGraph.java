package com.datastructure.Graph;

import java.util.ArrayList;

public class CreateGraph {

    public void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
     adj.get(u).add(v);
     adj.get(v).add(u);
    }
  public void printGraph(ArrayList<ArrayList<Integer>> adj)
  {
      for(int i=0;i<adj.size();i++)
      {
          System.out.println("adjacent list"+i);
          for(int j=0;j<adj.get(i).size();j++)
          {
              System.out.print("-->"+adj.get(i).get(j));
          }
          System.out.println();
      }
  }
    public static void main(String[] args)
    {
        int V=6;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(V);
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());

        CreateGraph graph= new CreateGraph();


        graph.addEdge(adj, 0, 1);
        graph.addEdge(adj, 0, 4);
        graph.addEdge(adj, 1, 2);
        graph.addEdge(adj, 1, 3);
        graph.addEdge(adj, 1, 4);
        graph.addEdge(adj, 2, 3);
        graph.addEdge(adj, 3, 4);


        graph.printGraph(adj);



    }
}
