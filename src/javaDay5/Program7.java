package javaDay5;

interface Prog7{
    default void printMessage(){
        System.out.println("hello");
    }
}

public class Program7 implements Prog7{
    @Override
    public void printMessage() {
        System.out.println("This is Program 7");
    }
    public static void main(String[] args) {
        Program7 P1 = new Program7();
        P1.printMessage();
    }

}
