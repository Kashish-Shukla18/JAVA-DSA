package Strings;

public class String4 {
    public static void PrintWords(String arr){
        String reverse="";
        for(int i=arr.length()-1;i>=0;i--){
            reverse+=arr.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        String str="String";
        PrintWords(str);
    }
}
