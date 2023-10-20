package Patterns;

public class Pattern02 {
    public static void main(String[] args) {

//        1
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

//2
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//3
        for(int i=1;i<=4;i++ ){
            for (int j=4;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//4
        for(int i=1;i<=4;i++ ){
            for (int j=1;j<=4;j++){
                System.out.print(4-j+1);
            }
            System.out.println();
        }
        System.out.println();

//        5
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(4);
            }
            System.out.println();
        }
        System.out.println();

//        6
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                System.out.print(7);
            }
            System.out.println();
        }
        System.out.println();

//        7
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                System.out.print(6);
            }
            System.out.println();
        }
        System.out.println();

    }}
