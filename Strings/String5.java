package Strings;

public class String5 {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        boolean IsPalindrome=isPalindrome(str);
        System.out.println(IsPalindrome);
    }
}
