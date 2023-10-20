package SearchingAndSorting;

public class BinarySearch {
    public static int Search(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int half = start;

        while (start <= end) {
            half = start + (end - start) / 2;
            if (arr[half] < num) {
                start = half + 1;
            } else if (arr[half] > num) {
                end = half - 1;
            } else {
                return half;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int index = Search(arr, 7);
        System.out.println(index);
    }
}
