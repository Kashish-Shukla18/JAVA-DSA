package LL;

public class SinglyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public void SinglyLinkedList() {
        this.size = 0;
    }
    //To insert At First Position

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //         To insert in Last
    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        if (tail == null) {
            insertFirst(val);
        }
    }

    //To insert At a particular Position
    private void insertAtPos(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

//    insert using Recursion
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    public Node insertRec(int val,int index,Node node){
        if (index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
//    to delete from First
    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        if (head==null){
            tail=null;

        }
        size--;return value;
    }
//    to get particular node

    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }

        return null;
    }
//    to delete from Last
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        secondLast=tail;
        tail.next=null;
        return value;
    }

//    to delete from Particular Index
    public int deleteatPos(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index==size-1){
            deleteLast();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
    }

//to display

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(18);
        list.insertFirst(28);
        list.insertFirst(38);
        list.insertFirst(48);
        list.insertFirst(58);
        list.insertLast(100);
        list.insertAtPos(69, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteatPos(2);
        list.display();
        list.find(38);
        list.display();
        System.out.println(list.size);
        list.insertRec(88,2);
        list.display();
    }
}

