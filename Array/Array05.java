package Array;

public class Array05 {
    public static void arrange(int[] arr, int n) {
        int l = 0;
        int r = n - 1;
        int count = 1;
        while (l <= r) {
            if (count % 2 == 1) {
                arr[l] = count;
                count++;
                l++;
            } else {
                arr[r] = count;
                r--;
                count++;
            }
        }
        for (int i = 0; i <= n-1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        arrange(arr, 8);
    }
}
