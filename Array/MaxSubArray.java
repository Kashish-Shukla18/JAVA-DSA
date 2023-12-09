package Array;

public class MaxSubArray {
    public static void maxsubArray(int num[]){
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                int currsum=0;
                for (int k=i;k<=j;k++){
                    currsum+=num[k];
                }
                System.out.print(currsum);
                    if (maxSum<currsum){
                        maxSum=currsum;
                }
                System.out.println();
            }
        }
        System.out.println("MAX"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={5,4,6,9,-3};
        maxsubArray(numbers);
    }
}
