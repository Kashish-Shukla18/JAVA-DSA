package Patterns;

public class InvertedHalfPyramid {
    public static void pyramid(int r){
        for (int i=1;i<=r;i++){
            //spaces
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
