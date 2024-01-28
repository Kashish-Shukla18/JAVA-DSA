package Recursion;

public class Factorials {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        int ans=factorial(5);
        System.out.println(ans);
    }
}
