package OOPS;

public class introToInterface {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

    }}
    abstract class Animal{ //cannot be instantiatied
        void eat(){
            System.out.println("Animal eats");
        }
        abstract void walk(); //giv+es idea

    }
    class Horse extends Animal{
        void walk(){
            System.out.println("walks on 4 legs");
        }

    }
    class Chicken extends Animal{
        void walk(){
            System.out.println("walks on 2 legs");
        }
    }
