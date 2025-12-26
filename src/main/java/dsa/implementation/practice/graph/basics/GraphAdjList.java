package dsa.implementation.practice.graph.basics;

import java.util.LinkedList;

public class GraphAdjList {
    private LinkedList<Integer>[] adjList;
    private int V;
    private int E;
    public GraphAdjList(int nodes){
        this.V = nodes;
        this.E=0;
        this.adjList = new LinkedList[nodes]; // create a array of type Linkedlist of size nodes
        for(int i=0;i<nodes;i++){
            adjList[i]=new LinkedList<>();
        }
    }
    public void addEdges(int u, int v){
        this.adjList[u].add(v);
        this.adjList[v].add(u);
        E++;
    }
    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(4);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,0);

    }
}
