package Graph;

import java.util.ArrayList;

public class CycleDetection_DirectedGraph {
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
            Graph[0].add(new Edge(0,2));

            Graph[1].add(new Edge(1,0));
            Graph[2].add(new Edge(2,3));
            Graph[3].add(new Edge(3,0));

        }
        public static boolean CycleDetection(ArrayList<Edge> Graph[],boolean vis[],int curr,boolean rec[]){
            vis[curr]=true;
            rec[curr]=true;
            for(int i=0;i<Graph[curr].size();i++){
                Edge e=Graph[curr].get(i);
                if (rec[e.dest]){
                    return true;
                } else if (!vis[e.dest]) {
                    if (CycleDetection(Graph,vis,e.dest,rec)){
                        return true;
                    }
                }
            }
            rec[curr]=false;
            return false;
        }
        public static void main(String[] args) {
            int V=4;
            ArrayList<Edge> Graph[]=new ArrayList[V];
            CreateGraph(Graph);
            System.out.println(CycleDetection(Graph,new boolean[V],0,new boolean[V]));
        }
    }
}
