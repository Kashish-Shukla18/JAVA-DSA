package Patterns;

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int s = 1;
            for (int j = 1; j <= n; j++) {
                int sum = i + j;
                if (sum <= n) {
                    System.out.print(" ");
                } else {
                    System.out.print(s);
                    s += 1;
                }

            }
            System.out.println();
        }
    }
}
