package Recursion;

public class PrintNumbers {
    public static void Print(int n){
        if (n>0){
            Print(n-1);
            System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        Print(10);
    }
}
