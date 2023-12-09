package Array;

public class SubArray {
    public static void subArray(int num[]){
        int sum=0;
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(num[k]+",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,6,9,-3};
        subArray(numbers);
    }
}
