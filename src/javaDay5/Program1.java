//

package javaDay5;

@FunctionalInterface
interface NumCompare{
    int NumCompare(int i,int j);
}

@FunctionalInterface
interface Increment{
    int Increment(int i);
}

@FunctionalInterface
interface Concat{
    String Concat(String s1, String s2);
}

@FunctionalInterface
interface StringConvert{
    String StringConvert(String x);
}

public class Program1 {
    public static void main(String[] args) {
        NumCompare numComp = (i,j) -> {
            int ret = i>j?i:j;
            return ret;
        };

        System.out.println("Result after comparison  "+numComp.NumCompare(6,8));

        Increment increment = (i) -> {
            return i+1;
        };
        System.out.println("Incremented value "+increment.Increment(5));

        Concat concat = (s1,s2) ->{
            String s = s1 + s2;
            return s;
        };
        System.out.println("String after concatination: " + concat.Concat("Hello", " world"));

        StringConvert stringconvert = (x) ->{
          String s = x.toUpperCase();
          return s;
        };
        System.out.println("String in uppercase " + stringconvert.StringConvert("Hello world"));

    }


}
