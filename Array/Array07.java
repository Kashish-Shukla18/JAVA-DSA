package Array;

public class Array07 {
//    Swap Alternate Pairs
    public static void swapAllPairs(int[] arr){
        for (int i=0;i<arr.length-1;i+=2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
    }
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={9,3,6,12,4,32};
        swapAllPairs(arr);

    }
}
