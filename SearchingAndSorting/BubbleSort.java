package SearchingAndSorting;

public class BubbleSort {
    public static void PrintArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Sort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
//                swap(arr[i],arr[i+1]);

            }}
        }
    }
    public static void main(String[] args) {
        int[] arr={34,54,67,23,65,77,87};
        Sort(arr);
        PrintArray(arr);
    }
}
