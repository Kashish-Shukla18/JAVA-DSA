package Recursion;

public class SumOfN {
    public static int Sum(int n){
        if (n==0){
            return 0 ;
        }
        int sum=n+Sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }
}
