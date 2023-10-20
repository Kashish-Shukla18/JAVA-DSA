package Patterns;
import java.util.Scanner;
public class Pattern07 {
    public static void main(String[] args) {

//        4.0
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l-i+1;j++){
                System.out.print(l-i+1);
            }
            System.out.println();
        }
    }
}
