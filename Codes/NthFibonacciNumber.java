package Codes;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i=0;i<=7;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);

        for(int i=1;;i++){
            {if(i==5)
                break;
                System.out.println(i);
        }
    }
}}
