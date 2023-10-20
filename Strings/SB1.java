package Strings;

public class SB1 {
    public static void main(String[] args) {
//        Constructor 1
        StringBuffer sb= new StringBuffer();
//        Constructor 2
        StringBuffer sb1= new StringBuffer("Kashish Shukla");
//        Constructor 3
        StringBuffer sb2= new StringBuffer(10);
        sb2.append("meoww meowwwwwwhiiiiiiiii");
        System.out.println(sb2);

        sb.append("Hi Kashish, ");
        sb.append("Welcome Here!!");
        String str=sb.toString();
        System.out.println(str);

        sb2.insert(2,"Rahul");
        sb.replace(1,5,"meoww");
        sb.delete(1,4);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb2 );

//     By default, capacity of StringBuilder is 16 and does not create objects again and again
//     sb2.insert(2,"Rahul"); to insert at a particular index
//     sb.replace(1,5,"meoww"); to replace particular range
//     sb.delete(1,4); to delete from a particular range
//     sb.reverse(); to reverse the string
 }
    }
