package euler2;

import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        BigInteger fibonacciSum =

                Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE}, f -> new BigInteger[]{f[1], f[0].add(f[1])})
                        .limit(900)
                        .map(t -> t[0])
                        .filter(Main::isLessThen4Mln)
                        .filter(Main::isEven)
                        .reduce(BigInteger.ZERO, BigInteger::add);

        System.out.println(fibonacciSum);

    }

    private static boolean isLessThen4Mln(BigInteger number) {
        return number.compareTo(BigInteger.valueOf(4000000)) < 0;
    }

    private static boolean isEven(BigInteger number) {
        return number.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);
    }
}


