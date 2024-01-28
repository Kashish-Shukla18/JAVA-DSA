package Recursion;

public class DecreasingNumbers {
    public static void decreasingNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        decreasingNum(n-1);
    }
    public static void increasingNum(int n){
//        if (n==10){
//            return;
//        }
//        System.out.println(n);
//        increasingNum(n+1);
        if (n==1){
            return;
        }
        increasingNum(n-1);
        System.out.println("Increasing Order");
        System.out.println(n);
    }
    public static void main(String[] args) {
        decreasingNum(10);
        increasingNum(9 );

    }
}
