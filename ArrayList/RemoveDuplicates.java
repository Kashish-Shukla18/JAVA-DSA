package ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,6,6,6,9,9,9,9};
        ArrayList<Integer> arr1=removeDuplicates(arr);
        System.out.println(arr1);
    }
}
