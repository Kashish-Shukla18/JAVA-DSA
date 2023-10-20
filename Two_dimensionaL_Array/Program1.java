package Two_dimensionaL_Array;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        int [][] matrix=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
