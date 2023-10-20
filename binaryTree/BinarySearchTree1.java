package binaryTree;

public class BinarySearchTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {   //constructor
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.data < key) {
            return Search(root.right, key);
        } else if (root.data == key) {
            return true;
        } else {
            return Search(root.left, key);
        }
    }

    public static Node Delete(Node root, int key) {
        if (root.data > key) {
            root.left = Delete(root.left, key);
        } else if (root.data < key) {
            root.right = Delete(root.right, key);
        } else {
            //case 1 no child
            if (root.left == null && root.right == null) {
                return null;
            }
//            Case 2 Two Children
            if (root.left == null) {
                return root.left;
            } else if (root.right == null) {
                return root.right;
            }
//            Case 3 2 Child
            {
            Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                Delete(root.right, IS.data);

            }

        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
//        int values[]={5,1,3,4,2,7};
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println("  ");
        boolean res = Search(root, 10);
        System.out.println(res);
    }
}
