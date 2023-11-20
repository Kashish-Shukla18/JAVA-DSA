package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
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
                Graph[i]= new ArrayList<>();
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
        public static void DFS(ArrayList<Edge> Graph[], int curr,boolean vis[]){
            System.out.println(curr);
            vis[curr]=true;

            for (int i=0;i<Graph[curr].size();i++){
                Edge e=Graph[curr ].get(i);
                if (vis[e.dest]==false){
                DFS(Graph,e.dest,vis);
            }}
        }

        public static void main(String[] args) {
            int V=4;
            ArrayList<Edge> Graph[]=new ArrayList[V];
            createGraph(Graph);
            boolean vis[]=new boolean[V];
            DFS(Graph,0,vis);

        }
    }
