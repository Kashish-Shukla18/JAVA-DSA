package Array;

public class Array06 {
//    Print all Pairs
    public static void printAllPairs(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.println(" ("+ arr[i]+"," +arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,6};
        printAllPairs(arr);
    }
}
