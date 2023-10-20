package Strings;

public class Assignment1 {
    public static boolean isPermutation(String str1, String str2) {

        if (str1.length() == str2.length()) {
            int i = 0;
            int j = 0;
            while (i<=str1.length()-1 && j<=str2.length()-1)
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "sinrtg";
        String s2 = "string";
        Boolean answer = isPermutation(s1, s2);
        System.out.println(answer);
    }
}
