package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra  {
        static class Edge{
            int src;
            int dest;
            int wt;
            public Edge(int s,int d,int wt){
                this.src=s;
                this.dest=d;
                this.wt=wt;
            }
            public static void CreateGraph(ArrayList<Edge> Graph[]){
                for (int i=0;i<Graph.length;i++){
                    Graph[i]=new ArrayList<>();
                }
                Graph[0].add(new Edge(0,1,2));
                Graph[0].add(new Edge(0,2,4));

                Graph[1].add(new Edge(1,2,1));
                Graph[1].add(new Edge(1,3,7));
;
                Graph[2].add(new Edge(2,4,3));

                Graph[3].add(new Edge(3,5,1));

                Graph[4].add(new Edge(4,3,2));
                Graph[4].add(new Edge(4,5,5));

            }
            public static class Pair implements Comparable<Pair>{
                int node;
                int dist;
                public Pair(int n,int d){
                    this.node=n;
                    this.dist=d;
                }
                @Override
                public int compareTo(Pair p2){
                    return this.dist-p2.dist;//for ascending Order
//                    return p2.dist-this.dist;  for descending Order
                }
            }
//            O(E+E Log V)
            public static void dijkstra(ArrayList<Edge> Graph[],int src,int V){
                PriorityQueue<Pair> pq=new PriorityQueue<>();
                int dist[]=new int[V];
                for (int i=0;i<V;i++){
                    if (i!=src){
                        dist[i]=Integer.MAX_VALUE;
                    }
                }
                boolean vis[]=new boolean[V];
                pq.add(new Pair(0,0));
                while (!pq.isEmpty()){
                    Pair curr=pq.remove();
                    if (!vis[curr.node]){
                        vis[curr.node]=true;
                        for (int i=0;i<Graph[curr.node].size();i++){
                            Edge e=Graph[curr.node].get(i);
                            int u=e.src;
                            int v=e.dest;
                            if (dist[u]+e.wt<dist[v]){
                                dist[v]=dist[u]+e.wt;
                                pq.add(new Pair(v,dist[v]));
                            }
                        }
                    }
                }
                for (int i=0;i<V;i++){
                    System.out.println(dist[i]);
                }
            }
            public static void main(String[] args) {
                int V=6;
                ArrayList<Edge> Graph[]=new ArrayList[V];
                CreateGraph(Graph);
                dijkstra(Graph,0,V);
            }
        }
    }

