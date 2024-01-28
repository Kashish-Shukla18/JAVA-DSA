package Recursion;

public class LastOccurence {
//    public static int LastOccurence(int arr[],int target,int i){
//        if (i==0){
//            return -1;
//        }
//        if (arr[i]==target){
//            return i;
//        }
//        return LastOccurence(arr,target,i-1);
//    }
    public static int LastOccurence(int arr[],int target,int i){
        if (i==arr.length-1){
            return -1;
        }
        int isFound=LastOccurence(arr,target,i+1);
        if (isFound==-1 && arr[i]==target){
            return i;
        }
return isFound;
    }
    public static void main(String[] args) {
        int arr[]={3,4,4,6,7,56,76,87,3,2,3,6,76};
        int target=76;
        int i= 0;
        System.out.println(LastOccurence(arr,target,i));
    }
}
