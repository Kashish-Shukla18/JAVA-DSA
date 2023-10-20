package SearchingAndSorting;

public class InsertionSort {
    public static void PrintArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j>=0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
         }
    }
    public static void main(String[] args) {
        int[] arr={9,6,3,7,2,8,1,5};
        insertionSort(arr);
        PrintArray(arr);
    }
}
