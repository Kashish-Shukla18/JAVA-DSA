package Array;

public class SearchInSortedMatrix {
        public static boolean Search(int arr[][],int key){ //worst case -O(n)
            int row=0,col=arr[0].length-1;
            while (row< arr.length&& col>=0){
                if (arr[row][col]==key){
                    System.out.println("Found Key at ("+row+","+col+")");
                    return true;
                } else if (key<arr[row][col]) {
                    col--;
                }
                else {
                    row++;
                 }}
                System.out.println("Key Not Found");
                return false;
            }
        public static void main(String args[]) {
            int a[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}
            };

            int key=11;
            Search(a,key);
        }



}
