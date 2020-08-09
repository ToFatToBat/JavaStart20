package euler1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println( specialSumOfNumbers(11));


    }

    public static int specialSumOfNumbers(int numberLimit) {
        return specialSumOf3(numberLimit) + specialSumOf5(numberLimit);
    }

    public static int specialSumOf3(int numberLimit) {
        return Stream.iterate(3, number -> number + 3)
                .limit(1000)
                .filter(number -> number < numberLimit)
                .reduce(0, Integer::sum);

    }

    public static int specialSumOf5(int numberLimit) {
        return Stream.iterate(5, number -> number + 5)
                .limit(1000)
                .filter(number -> number < numberLimit)
                .reduce(0, Integer::sum);

    }
}
