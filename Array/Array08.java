package Array;

public class Array08 {
    public static void Pair(int num[]){
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] numbers={2,3,4,5,6};
        Pair(numbers);
    }
}
