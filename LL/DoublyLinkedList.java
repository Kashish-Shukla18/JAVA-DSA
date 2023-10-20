package LL;

public class DoublyLinkedList {
    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }


    private Node head;
    private Node tail;
    public int size;

    public void SinglyLinkedList() {
        this.size = 0;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertatFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }


    public void insert(int after, int val) {
        Node f = find(after);
        if (f == null) {
            System.out .println("Does not Exist");
        }
        Node node = new Node(val);
        node.next = f.next;
        f.next = node;
        node.prev =f;
        node.next.prev=node;

    }

    public void insertatLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        while (last.next!= null) {
            last = head.next;
        }
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "-->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        // in reverse printing

        System.out.println("Print In reverse");
        while (last != null) {
            System.out.print(last.val + "-->");
            last = last.prev;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.insertatFirst(18);
        ll.insertatFirst(19);
        ll.insertatFirst(20);
        ll.display();
        ll.insertatLast(90);
        ll.display();
    }
}
