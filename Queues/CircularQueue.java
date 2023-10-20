package Queues;

public class CircularQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        int removed = data[0];

        // shift the elements to left
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(6);
        cq.insert(34);
        cq.insert(44);
        cq.insert(54);
        cq.insert(64);
        cq.insert(74);
        cq.insert(84);
        cq.insert(94);
        cq.display();
        cq.remove();
        cq.display();
        cq.remove();
        cq.display();
    }

}