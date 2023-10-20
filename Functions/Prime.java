package Functions;

public class Prime {
    public static boolean isPrime(int n){
        int div=2;
        while (div<=n/2){
            if(n%div==0){
                return false;
            }
            div=div+1;
        }
        return true;

    }
    public static void main(String[] args) {
        boolean ans=isPrime(3);
        System.out.println(ans);
    }
}
