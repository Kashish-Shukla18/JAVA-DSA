package Array;
import java.util.Scanner;
public class Array03 {
    public static void main(String[] args) {
        int[] arr=new int[9];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            }
        int min=Integer.MIN_VALUE;
        for (int i=0;i<9;i++){
            if (min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}
