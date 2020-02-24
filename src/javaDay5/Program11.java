package javaDay5;

import java.util.Arrays;
import java.util.List;

public class Program11 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(2,3,5,1);
        System.out.println(
                lst.stream().map(e->2*e).mapToInt(i -> i.intValue()).average().getAsDouble()
        );

    }
}
