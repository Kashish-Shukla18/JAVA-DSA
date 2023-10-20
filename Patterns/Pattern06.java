package Patterns;
import java.util.Scanner;
public class Pattern06 {
    public static void main(String[] args) {

//       First Solution
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int sum=i+j;
                if(sum>n+1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

//        Second Solution
        int l= sc.nextInt();
        for(int i=1;i<=l;i++){
            for(int j=l-i+1;j>=1;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

