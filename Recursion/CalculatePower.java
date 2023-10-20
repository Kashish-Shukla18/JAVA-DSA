package Recursion;

public class CalculatePower {
    public static int Power(int num,int pow){
        if (num==0&&pow==0){
        return 1;}
        if(num==0){
            return 1;
        }if(pow==0){
            return 1;
        }
        int small=Power(num,pow/2);
        if (num%2==0){
            return small*small;
        }
        else {
            return num*small*small;
        }
    }
    public static void main(String[] args) {
        int pow=Power(5,3);
        System.out.println(pow);
    }
}
