package Recursion;

public class Factorial {
    public static int Factorial(int n){
        if(n==0){return 1;}
//        int small=Factorial(n-1);
        return n*Factorial(n-1);


//        int fact=1;
//        for (int i=n;i>=1;i--){
//            fact*=i;
//        }
//        return fact;
    }
    public static void main(String[] args) {
        int ans=Factorial(6);
        System.out.println(ans);
    }
}
