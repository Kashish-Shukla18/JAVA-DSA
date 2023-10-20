package Strings;

public class String8 {
    public static String Reverse(String str){
        int i=str.length()-1;
        int j=str.length()-1;
        String output="";
        while (i>=0){
            if(str.charAt(i)==' '){
                output=output+str.substring(i+1,j+1)+" ";
                j=i;
                i--;
            }
                i--;
            }
            output+=str.substring(i+1,j);
            return output;
        }
//    Reverse Each Word
public static void main(String[] args) {
    String str="Always indent your code";
    String str1=Reverse(str);
    System.out.println(str1);
}
}
