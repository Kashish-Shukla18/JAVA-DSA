package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
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
                Graph[2].add(new Edge(2,3));

                Graph[3].add(new Edge(3,1));

                Graph[4].add(new Edge(4,0));
                Graph[4].add(new Edge(4,1));

                Graph[5].add(new Edge(5,0));
                Graph[5].add(new Edge(5,2));

            }
            public static void TopologicalSort(ArrayList<Edge> Graph[], boolean vis[], int curr, Stack<Integer> stack){
                vis[curr]=true;
                for(int i=0;i<Graph[curr].size();i++){
                    Edge e=Graph[curr].get(i);
                    if (!vis[e.dest]){
                        TopologicalSort(Graph,vis,e.dest,stack);
                    }
                }
                stack.push(curr);
            }
            public static void topSort(ArrayList<Edge> Graph[],int V){
                boolean vis[]=new boolean[V];
                Stack<Integer> stack=new Stack<>();
                for (int i=0;i<V;i++){
                    if(!vis[i]){
                        TopologicalSort(Graph,vis,i,stack);
                    }
                }
                while (!stack.isEmpty()){
                    System.out.println(stack.pop());
                }


            }
            public static void main(String[] args) {
                int V=6;
                ArrayList<Edge> Graph[]=new ArrayList[V];
                CreateGraph(Graph);
                topSort(Graph,V);

                }
        }

        }