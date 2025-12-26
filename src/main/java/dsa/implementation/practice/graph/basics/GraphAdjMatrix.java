package dsa.implementation.practice.graph.basics;

public class GraphAdjMatrix {

    private int adjMatrix[][];
    private int V; // no. of vertices in graph
    private int E; //no. of edges
    public GraphAdjMatrix(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix = new int[nodes][nodes];
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices, "+E+"edges "+ "\n");
        for(int i=0;i<V;i++){
            sb.append(i+": ");
            for(int w : adjMatrix[i]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addEdges(int u, int v){
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1; // bz it's undirected graph both direction count
        E++;
    }

    public static void main(String[] args) {
        GraphAdjMatrix graph = new GraphAdjMatrix(4);
        graph.addEdges(0,1);
        graph.addEdges(1,2);
        graph.addEdges(2,3);
        graph.addEdges(3,0);
        System.out.println(graph.toString());
    }
}
