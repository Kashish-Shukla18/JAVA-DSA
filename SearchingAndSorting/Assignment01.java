package SearchingAndSorting;

public class Assignment01 {
    public static void PrintArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void ZerosToEnd(int[] arr){
        int nonzero=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonzero];
                arr[nonzero]=temp;
                nonzero++;
            }
        }
    }
//    Push zeros to end
    public static void main(String[] args) {
        int[] arr={0,3,0,4,0,2,1,9};
        ZerosToEnd(arr);
        PrintArray(arr);
    }
}
