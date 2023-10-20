package Functions;
import java.util.Scanner;

public class FahtrenheitToCelcius {
    public static void FtoC(int S,int E,int W){
        for (int i=S;i<=E;i+=W){
            float Celsius_Value = (5.0f/9.0f)*(i - 32);
            System.out.println((int)Celsius_Value);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int S= sc.nextInt();
        int E= sc.nextInt();
        int W= sc.nextInt();
        FtoC(S,E,W);
    }
}
