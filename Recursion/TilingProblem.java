package Recursion;

public class TilingProblem {
    public static int Tiling(int n) { //n represents floor size
//        base case
        if (n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int verticalTiles=Tiling(n-1);
        //horizontal choice
        int horizontalChoice=Tiling(n-2);

        int total=verticalTiles+horizontalChoice;
        return total;

    }
    public static void main(String[] args) {
        System.out.println(Tiling(5));
    }
}
