package javaDay5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program5 {
    public static void main(String[] args) {
        Consumer cons = (e) ->{
            System.out.println(e);
        };
        cons.accept(10);

        Supplier sup = () ->{
            int i =5;
            return i;
        };
        System.out.println(sup.get());


        Function<Integer,Integer> func = (e) -> e*2;
        System.out.println(func.apply(5));

        Predicate<Integer> predicate =(e) -> e%2==0;
        System.out.println(predicate.test(8));
    }
}
