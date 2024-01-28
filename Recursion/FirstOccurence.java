package Recursion;

public class FirstOccurence {

    public static int FirstOccurence(int arr[],int target,int i){
        if (i==arr.length-1){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }
        return FirstOccurence(arr,target,i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,4,4,6,7,56,76,87,3,2,3,6,76};
        int target=76;
        int i=0;
        System.out.println(FirstOccurence(arr,target,i));
    }
}
