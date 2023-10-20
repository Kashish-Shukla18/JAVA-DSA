package SearchingAndSorting;

public class MergeAndSort {

//    Important Topic
    public static void PrintArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] Sorting(int[] arr, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m= arr.length;
        int n=arr2.length;
        int[] arr3 = new int[m+n];

        while (i <m && j <n) {
            if (arr[i] <= arr2[j]) {
                arr3[k] = arr[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            arr3[k] = arr[i];
            i++;
            k++;
        }
        while (j <n) {
            arr3[k] = arr[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 10, 13};
        int arr2[] = {2, 5, 7, 9};
        int arr3[] = Sorting(arr, arr2);
        PrintArray(arr3);
    }
}
