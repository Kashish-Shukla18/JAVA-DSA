package Array;
import java.util.Scanner;
public class Array04 {
    public static int search(int m){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i]==m){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int index=search(3);
        System.out.println(index);
    }
}
