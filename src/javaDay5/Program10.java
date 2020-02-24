package javaDay5;

import java.util.Arrays;
import java.util.List;

public class Program10 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(2,3,5,6,1,8,9);
        System.out.println(
                lst.stream().filter(e->e>5).mapToInt(i -> i.intValue()).sum()
        );
    }
}
