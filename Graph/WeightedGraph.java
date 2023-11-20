package Graph;

import java.util.ArrayList;

public class WeightedGraph {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }

    }
    public static void CreateGraph(ArrayList<Edge> Graph[]){
        for (int i=0;i<Graph.length;i++){
            Graph[i]=new ArrayList<>();
        }
        Graph[0].add(new Edge(0,2,2));

        Graph[1].add(new Edge(1,2,20));
        Graph[1].add(new Edge(1,3,0));

        Graph[2].add(new Edge(2,0,2));
        Graph[2].add(new Edge(2,1,10));
        Graph[2].add(new Edge(2,3,-1));

        Graph[3].add(new Edge(3,1,0));
        Graph[3].add(new Edge(3,2,-1));

    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> Graph[]=new ArrayList[V];
        CreateGraph(Graph);

        for (int i=0;i<Graph[2].size();i++){
            Edge e=Graph[2].get(i);
            System.out.println("Destination "+e.dest+" "+"Weight "+e.weight);
        }

    }
}
