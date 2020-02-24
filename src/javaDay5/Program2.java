package javaDay5;

@FunctionalInterface
interface OneInt{
    int OneInt(int i, int j);
}

public class Program2 {
    public static void main(String[] args) {
        OneInt oneint = (i,j) ->{
            return j;
        };
        System.out.println("Single integer can be " +oneint.OneInt(5,6));
    }
}
