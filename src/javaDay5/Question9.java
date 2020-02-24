package javaDay5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(2,4,3,7,6,8,7,6);
        System.out.println(
                lst.stream().filter(e->e%2==0).collect(Collectors.toList())
        );
    }
}
