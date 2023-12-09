package Array;

public class KadanesAlgo {
        public static void MaxSum(int num[]){
            int currSum=0;
            int ms=Integer.MIN_VALUE;
            for (int i=0;i< num.length;i++){
                currSum+=num[i];
                if(currSum<0){
                    currSum=0;
                }
                if (ms<currSum){
                    ms=currSum;
                }
            }
            System.out.println(ms);
        }
        public static void main(String[] args) {
            int numbers[]={5,4,6,9,-3};
            MaxSum(numbers);
            int numbers1[]={-2,-3,4,-1,-2,1,5,-3};
            MaxSum(numbers1);

        }
    }
