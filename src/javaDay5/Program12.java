package javaDay5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Program12 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(2,3,4,1,6,5);
        System.out.println(
             lst.stream().filter(e->(e%2==0) &&  e>3).findFirst()
        );
    }
}
