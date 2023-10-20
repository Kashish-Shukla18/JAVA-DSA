package Recursion;

public class Fibonacci {
    public static int Print(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Print(n-1)+Print(n-2);
    }

    public static void main(String[] args) {
        int num=Print(7);
        System.out.println(num);
    }
}
