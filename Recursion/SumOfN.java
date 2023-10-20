package Recursion;

public class SumOfN {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        int TotalSum=Sum(8);
        System.out.println(TotalSum);
    }
}

