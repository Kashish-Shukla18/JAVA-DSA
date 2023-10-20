package Stack;

public class Stack {
    private int top;
    private int maxsize;
    protected int[] arr;

    Stack(int maxsize) {
        this.top = -1;
        this.maxsize = maxsize;
        this.arr = new int[maxsize];
    }

    public boolean isFull() {
        if (top == maxsize - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean push(int val) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        top++;
        arr[top] = val;
        return true;
    }

    public void display(){
        if (top>=-1){
        System.out.println(arr[top]);
        top--;
    }}
    public int pop() {
        if (isEmpty()) {
            System.out.println(" Stack is Empty");
        }
        int val = arr[top];
        top--;
        return val;
    }

    public int peek() {
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(34);
        stack.push(74);
        stack.push(88);
        stack.push(98);
        stack.push(104);
        System.out.println(stack.pop());
        stack.pop();
        stack.pop();
        stack.display();
    }
}