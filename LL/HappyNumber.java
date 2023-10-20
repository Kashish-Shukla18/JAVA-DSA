package LL;

public class HappyNumber {
        public static boolean isHappy(int n) {

            int slow = n;
            int fast = n;
            do {
                slow = square(slow);
                fast = square(square(fast));
            } while (slow != fast);

            return slow == 1;
        }

        public static int square(int num) {

            int ans = 0;

            while(num > 0) {
                int remainder = num % 10;
                ans += remainder * remainder;
                num /= 10;
            }

            return ans;
        }

    public static void main(String[] args) {
        boolean answer =(isHappy(19));
        System.out.println(answer);
    }
    }
