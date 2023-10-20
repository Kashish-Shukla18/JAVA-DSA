package Codes;
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    char name=sc.next().charAt(0);
    int m1,m2,m3;
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    int average=(m1+m2+m3)/3;
    System.out.println(name);
    System.out.println(average);}
}
