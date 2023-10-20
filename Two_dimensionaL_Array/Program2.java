package Two_dimensionaL_Array;

import java.util.Scanner;

public class Program2 {
    public static void SumOfRows(int [][] arr){
int maxsum=0,index=-1;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=0;j< arr[0].length;j++){

                sum+=arr[i][j];
            }
            if(maxsum<sum){
                maxsum=sum;
                index=i;
            }
            System.out.println(sum);
        }
        System.out.println("Max Sum:"+maxsum+" "+index);
    }
public static int[][] createMatrix(int m,int n){
    int[][] matrix=new int[m][n];
    Scanner sc=new Scanner(System.in);
    for (int i=0;i<m;i++){
        System.out.println("Enter First Row values");
        for (int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for (int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
        return matrix;
}
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter no. of rows");
            int m= sc.nextInt();
            System.out.println("Enter no. of cols");
            int n= sc.nextInt();
            int [][] matrix=createMatrix(m,n);
            SumOfRows(matrix);

        }
    }