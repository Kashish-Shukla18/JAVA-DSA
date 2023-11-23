package Graph;

import java.util.ArrayList;

public class CycleDetection_UnDirectedGraph {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
        public static void CreateGraph(ArrayList <Edge> Graph[]){
            for (int i=0;i<Graph.length;i++){
                Graph[i]=new ArrayList<>();
            }
            Graph[0].add(new Edge(0,1));
            Graph[0].add(new Edge(0,4));

            Graph[1].add(new Edge(1,0));
            Graph[1].add(new Edge(1,2));
            Graph[1].add(new Edge(1,4));

            Graph[2].add(new Edge(2,1));
            Graph[2].add(new Edge(2,3));

            Graph[3].add(new Edge(3,2));

            Graph[4].add(new Edge(4,0));
            Graph[4].add(new Edge(4,1));
            Graph[4].add(new Edge(4,5));

            Graph[5].add(new Edge(5,4));
        }
        public static boolean CycleDetection(ArrayList<Edge> Graph[],int curr,boolean vis[],int p){
            vis[curr]=true;
            for (int i=0;i<Graph[curr].size();i++){
                Edge e=Graph[curr].get(i);
                if(vis[e.dest] && p!=e.dest){
                    return true;
                } else if (!vis[e.dest]) {
                    if(CycleDetection(Graph,e.dest,vis,curr)){
                        return true;
                    }
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int V=6;
            ArrayList<Edge> Graph[]=new ArrayList[V];
            CreateGraph(Graph);
            boolean vis[]=new boolean[V];
            boolean rec[]=new boolean[V];
            System.out.println(CycleDetection(Graph,0,new boolean[V],-1));

        }
    }
}
