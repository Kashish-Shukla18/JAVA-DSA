package Functions;

public class Fibonacci {
    public static boolean fibonacci(int N){
        int a=0;
        int b=1;
        int c;
        while (a<N){
            c=a+b;
            a=b;
            b=c;}
            if(a==N){
                return true;
            }
            else {
                return false;
            }
        }

    public static void main(String[] args) { //caller
        System.out.println(fibonacci(3)); //callee

    }
}
