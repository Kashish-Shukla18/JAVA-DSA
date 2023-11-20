package Graph;

import java.util.ArrayList;

public class UnweightedGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> Graph[]){
        for (int i=0;i<Graph.length;i++){
            Graph[i]=new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(0,2));

        Graph[1].add(new Edge(1,2));
        Graph[1].add(new Edge(1,3));

        Graph[2].add(new Edge(2,0));
        Graph[2].add(new Edge(2,1));
        Graph[2].add(new Edge(2,3));

        Graph[3].add(new Edge(3,1));
        Graph[3].add(new Edge(3,2));
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> Graph[]=new ArrayList[V];
        createGraph(Graph);
//print 2's neighbour
        for (int i=0;i< Graph[2].size();i++){
            Edge e=Graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
