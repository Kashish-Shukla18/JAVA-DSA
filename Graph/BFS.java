package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
        public static void BFS(ArrayList<Edge> Graph[],int V){
            Queue<Integer> q=new LinkedList<>();
            boolean vis[]=new boolean[V];
            q.add(0);
            while (!q.isEmpty()){
                int curr=q.remove();
                if(vis[curr]==false){
                    System.out.println(curr);
                    vis[curr]=true;

                    for (int i=0;i<Graph[curr].size();i++){
                        Edge e=Graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }
        public static void main(String[] args) {
            int V=4;
            ArrayList<Edge> Graph[]=new ArrayList[V];
            createGraph(Graph);
            BFS(Graph,V);

        }
    }
 