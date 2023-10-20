package Strings;

public class String3 {
    public static void CountWords(String arr){
        int count=0;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
    public static void main(String[] args) {
        String str="this is a sample string";
        CountWords(str);
    }
}
