package Patterns;
import java.util.Scanner;
public class Pattern04 {
    public static void main(String[] args) {

//    Character Patterns

        //        1
        for (int i = 1; i <= 4; i++) {
            int a = 'A';
            for (int j = 1; j <= 4; j++) {
//                char c=(char)(a);
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
        System.out.println();

        //        2
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                int a = 'A';
                System.out.print((char) (a + i - 1));
            }
            System.out.println();
        }
        System.out.println();


        //        3
        for (int i = 1; i <= 7; i++) {
            int a = 'A' + i - 1;
            for (int j = 1; j <= 7; j++) {
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
        System.out.println();


        //        4
        for (int i = 1; i <= 7; i++) {
            int a = 'A' + i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
        System.out.println();

//              5
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i<=a;i++){
            int b='A'+a-i;
            for (int j=1;j<=i;j++){
                System.out.print((char)(b));
                b++;
            }
            System.out.println();
        }



    }
}