package Recursion;

public class NumberOfDigits {
    public static int count(int n){
        if (n==0){
            return 0;
        }
        int small=count(n/10);
        return small+1;
    }

    public static void main(String[] args) {
        int countdigits=count(1342323);
        System.out.println(countdigits);
    }
}
