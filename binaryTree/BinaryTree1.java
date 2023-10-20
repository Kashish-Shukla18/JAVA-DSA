package binaryTree;

import Queues.QueueCode;

import java.util.*;

public class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;

        }

    }

    public static void preorder(Node root) {
        if (root == null) {
//         System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
//         System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
//         System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = Count(root.left);
        int rightNode = Count(root.right);
        return leftNode + rightNode + 1;   // Time Complexity: O(N)
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum + rightSum + root.data;
    }

  public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = Height(root.left);
        int rightheight = Height(root.right);
        int max=Math.max(leftheight,rightheight)+1;
        return max;
    }

    public static int Diameter(Node root){
        if (root==null){return 0;}   //Time Complexity: O(n2)
        int diam1=Diameter(root.left);
        int diam2=Diameter(root.right);
        int diam3=Height(root.left)+Height(root.right)+1;
        return Math.max(diam3,Math.max(diam2,diam1));
    }

    static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.diam=diam;
            this.ht=ht;
        }
    }
   public static int Diameter2(Node root) {
//        Precompute height of every node and store it in a map


           if (root == null) {
               return 0;
           }
           int l = Diameter2(root.left);
           int r = Diameter2(root.right);
           int res = (1+Math.max(l,r));
//           int diam=l.diam;
       return  l;

   }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("rooot data " + root.data + " ");
        System.out.println();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println("Count of Nodes= "+Count(root));
        System.out.println("Sum of Nodes= "+Sum(root));
        System.out.println("height of Tree= "+Height(root));
    }
}

