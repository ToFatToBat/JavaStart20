package euler2;

import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        int fibonacciSum =
                Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                        .limit(500)
                        .map(t -> t[0])
                        .filter(numLessThenFourMil -> numLessThenFourMil < 4000000)
                        .filter(evenNumbers -> evenNumbers % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();
//                .forEach(System.out::println);
        System.out.println(fibonacciSum);
    }


}
