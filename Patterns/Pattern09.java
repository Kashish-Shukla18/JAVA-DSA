package Patterns;
import java.util.Scanner;
public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int nl=1;
            int half=n/2+1;
            if(nl<=half){
                int spaces=1;
                while(spaces<nl-i){
                    System.out.print(" ");
                }
                int num=1;
                while (num<=2*i-1){
                    System.out.print("*");
                    num++;
                }
            }
            System.out.println();
//            else{
//                int spaces=1;
//                while(spaces<nl+ i){
//                    System.out.println(" ");
//                }
//                int num=1;
//                while (num<=2*i-1){
//                    System.out.print(num++);
//                }
            }
        }
    }
