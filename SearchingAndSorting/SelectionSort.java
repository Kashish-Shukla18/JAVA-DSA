package SearchingAndSorting;

import javax.crypto.SealedObject;

public class SelectionSort {
    public static void PrintArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void SelectionSort(int[] arr){

        for(int i=0;i<=arr.length-1;i++){
            int min=Integer.MIN_VALUE;
            int minIndex=i;
            for(int j=i;j<=arr.length-1;j++){
               if(arr[j]<min){
                   min=arr[j];
                   minIndex=j;
               }
            }
//            swap min element with ith element
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
       int[] arr={34,54,67,23,65,77,87};
        SelectionSort(arr);
        PrintArray(arr);
    }
}
