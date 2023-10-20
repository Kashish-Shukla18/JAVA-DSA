package Strings;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        String sentence="Hi     Hello  Namaste";
        System.out.println(sentence.replaceAll("\\s",""));

//        important seperation of string into Array
        String arr="Kashish Shukla Shashi Shukla Kushagra Awasthi";
        String[] names=arr.split(" ");
        System.out.println(Arrays.toString(names));

//        Rounding Off

    }
}
