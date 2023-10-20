package Strings;

public class String7 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Abc");
        str.setCharAt(0,'K');
        str.append("def");
        System.out.println(str);
    }
}

