package Array;

public class PrefixArrayMaxSum {
    public static void PrefixSum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int Prefix[]=new int[num.length];
        int currsum=0;
        Prefix[0]=num[0];
        for (int i=1;i<num.length;i++){
            Prefix[i]=Prefix[i-1]+num[i];
        }
        for (int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=start==0?Prefix[end]:Prefix[end]-Prefix[start-1];
                if (maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("Max Sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={5,4,6,9,-3};
        PrefixSum(numbers);

    }
}
