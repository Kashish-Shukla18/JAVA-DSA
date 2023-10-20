package Functions;

import java.util.Scanner;

public class nCr {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <=num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void printEvenNumbers(int start,int end){
        if(start%2!=0){
            start++;
        }
        for (int i=start; i<=end;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int FactN = factorial(n);
        int FactR = factorial(r);
        int FactNR = factorial(n - r);
        double Result = FactN / (FactR * FactNR);
        System.out.println(FactN);
        System.out.println(FactR);
        System.out.println(FactNR);
        System.out.println(Result);
        printEvenNumbers(2,100);
    }
}
