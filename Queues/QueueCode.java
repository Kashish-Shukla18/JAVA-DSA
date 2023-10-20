package Queues;

public class QueueCode {
    private int front,rear,maxsize;
    private int arr[];


    QueueCode(int maxsize){
        this.front=0;
        this.rear=-1;
        this.maxsize=maxsize;
        this.arr=new int[maxsize];
    }

    public boolean isFull(){return rear==maxsize;}

    public boolean isEmpty(){return rear==0;}

    public boolean insert(int val){
        if (isFull()){
            return false;}
        rear++;
        arr[rear]=val;
        return true;
    }

public int delete(){
        if (isEmpty()){
            System.out.println("EMPTY");}
        int val=arr[front];
        front++;
        return val;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("EMPTY");
    }
        for (int i=front;i<maxsize-1;i++){
            System.out.print(arr[i]+"-->");
        }
        System.out.println();
}

    public static void main(String[] args) {
        QueueCode queue=new QueueCode(10);
        queue.insert(23);
        queue.insert(24);
        queue.insert(25);
        queue.insert(26);
        queue.insert(27);
        queue.insert(28);
        queue.insert(29);
        queue.display();
        queue.delete();
        queue.delete();
        queue.display();
    }
}
