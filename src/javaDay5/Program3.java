package javaDay5;

interface Operation{
    int Operation(int i, int j);
}

public class Program3 {
    public static int mul(int i, int j){
        return i*j;
    }
    public int add(int i,int j){
        return i+j;
    }
    public int sub(int i, int j){
        return i-j;
    }
    public static void main(String[] args) {
        Operation multiply = Program3::mul;
        System.out.println("Multiplication operation "+multiply.Operation(7,8));

        Program3 addition = new Program3();
        Operation o1 = addition::add;
        System.out.println("Addition operation " + o1.Operation(5,6));

        Program3 substraction = new Program3();
        Operation o2 = substraction::sub;
        System.out.println("Substraction operation " + o2.Operation(5,6));
    }
}
