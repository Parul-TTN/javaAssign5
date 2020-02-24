package javaDay5;

interface DummyInterface{
    //default method
   default void printMessage(){
       System.out.println("-----------");
   }
    //static method
    static int sum(int i, int j) {
        return i+j;
    }

}

public class Program6 implements DummyInterface{
    public static void main(String[] args) {
        Program6 P1 = new Program6();
        P1.printMessage();
        System.out.println(DummyInterface.sum(5,6));
    }

    @Override
    public void printMessage() {
        System.out.println("Addition of 2 nums");
    }
}
