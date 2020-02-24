package javaDay5;

interface InterfaceOne{
    default void printMessage(String s){
        System.out.println("First Interface " +s);
    }
}

interface InterfaceTwo{
    default void displayMessage(String s){
        System.out.println("Second Interface " +s);
    }
}

public class Program8 implements InterfaceOne, InterfaceTwo {

    public static void main(String[] args) {
        Program8 obj = new Program8();
        obj.printMessage("Hello");
        obj.displayMessage("Hello");


    }
}
