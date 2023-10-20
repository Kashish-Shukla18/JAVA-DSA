package LL;

public class CircularLinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public void CircularLinkedList() {
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void Delete(int val) {
        Node node =head;
        if (node == null) {
            return;
        }
        if (node.val==val){
            head=head.next;
            tail.next=head;
        }
        do {
            Node n=node.next;
            if (n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }
        while (node!=head);
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + "-->");
                node = node.next;
            }
            while (node != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList LL = new CircularLinkedList();
        LL.insert(23);
        LL.insert(93);
        LL.insert(763);
        LL.display();
    }
}
