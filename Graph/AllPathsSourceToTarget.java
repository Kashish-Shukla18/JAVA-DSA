package Graph;

import java.util.ArrayList;

public class AllPathsSourceToTarget {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
        public static void CreateGraph(ArrayList<Edge> Graph[]){
            for (int i=0;i<Graph.length;i++){
                Graph[i]=new ArrayList<>();
            }
            Graph[0].add(new Edge(0,1));
            Graph[0].add(new Edge(0,2));

            Graph[1].add(new Edge(1,0));
            Graph[1].add(new Edge(1,3));

            Graph[2].add(new Edge(2,0));
            Graph[2].add(new Edge(2,4));

            Graph[3].add(new Edge(3,1));
            Graph[3].add(new Edge(3,4));
            Graph[3].add(new Edge(3,5));

            Graph[4].add(new Edge(4,2));
            Graph[4].add(new Edge(4,3));
            Graph[4].add(new Edge(4,5));

            Graph[5].add(new Edge(5,3));
            Graph[5].add(new Edge(5,4));
            Graph[5].add(new Edge(5,6));

            Graph[6].add(new Edge(6,5));

        }
        public static void printAllPath(ArrayList<Edge> Graph[],boolean vis[],int curr,int target,String path){
            if (curr==target){
                System.out.println(path);
                return;
            }
            for (int i=0;i<Graph[curr].size();i++){
                Edge e=Graph[curr].get(i);
                if(!vis[e.dest]){
                vis[curr]=true;
                printAllPath(Graph,vis,e.dest,target,path+e.dest);
                vis[curr]=false;
            }}
        }

        public static void main(String[] args) {
            int V=7;
            ArrayList<Edge> Graph[]=new ArrayList[V];
            CreateGraph(Graph);
            printAllPath(Graph,new boolean[V],0,5,"0");
        }
    }
}
