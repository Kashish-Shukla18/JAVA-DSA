package Patterns;
import java.util.Scanner;
public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){

            int spaces=1;
            while (spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }

            int num=1;
            while (num<=i){
                System.out.print(num);
                num++;
            }

            int dec=i-1 ;
            while (dec>=1){
                System.out.print(dec);
                dec--;
            }
            System.out.println();
        }


//        2
        Scanner sc1=new Scanner(System.in);
        int m= sc1.nextInt();
        for (int i=1;i<=m;i++){
//            for spaces
            int spaces=1;
            while (spaces<=m-i){
                System.out.print(" ");
                spaces++;
            }

//            for increasing num
            int inc=1;
            while(inc<=i){
                System.out.print("*");
                inc++;
            }
//            for decreasing num
            int dec1=i-1;
            while(dec1>=1){
                System.out.print("*");
                dec1--;
            }
            System.out.println();
        }

//        3
        Scanner sc2=new Scanner(System.in);
        int p= sc1.nextInt();
        for (int i=1;i<=p;i++){
//            for spaces
            int spaces=1;
            while (spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }

//            for increasing num
            int col=1;
            int num=i;
            while(col<=i){
                System.out.print(num);
                num++;
                col++;
            }

            col=1;
            num=2*i-1;
            while (col<=i-1){
                System.out.print(num);
                num--;
                col++;
            }

//            for decreasing num


            System.out.println();
        }
    }
}
