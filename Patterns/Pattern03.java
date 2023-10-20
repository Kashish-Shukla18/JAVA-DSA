package Patterns;

public class Pattern03 {
    public static void main(String[] args) {
//  Triangular Patterns      1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();


        //        2
        int p = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p += 1;
            }
            System.out.println();
        }
        System.out.println();


        //        3
        for (int i = 1; i <= 4; i++) {
            int l=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(l);
                l += 1;
            }
            System.out.println();
        }
        System.out.println();


        //        4
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //        5
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();


        //        6
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

    }
}
