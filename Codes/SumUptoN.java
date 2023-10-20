package Codes;
import java.util.Scanner;
public class SumUptoN {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (i<=n){
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);

        int i1=1;
        while(i1<=5){
            int j=10;
            System.out.println(j);
            i1++;
            j++;
        }
//        int j=10;
//        int i1=1;
//        while(i1<=5){
//
//            System.out.println(j);
//            i1++;
//            j++;
//        }
    }
}
