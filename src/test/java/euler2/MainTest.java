package euler2;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void shouldReturnTwoWhenLimitIsTwo() {
        //given
        int iterationLimit = 2;

        //when
        BigInteger result = Main.fibonacciSum(iterationLimit);

        //then
        BigInteger expected = BigInteger.valueOf(2);

        assertEquals(expected, result);



    }

    @Test
    void shouldReturnTenWhenLimitIsFive() {
        //given
        int iterationLimit = 5;

        //when
        BigInteger result = Main.fibonacciSum(iterationLimit);

        //then
        BigInteger expected = BigInteger.valueOf(10);

        assertEquals(expected, result);



    }

    @Test
    void shouldReturnFourtyFourWhenLimitIsEight() {
        //given
        int iterationLimit = 8;

        //when
        BigInteger result = Main.fibonacciSum(iterationLimit);

        //then
        BigInteger expected = BigInteger.valueOf(44);

        assertEquals(expected, result);



    }
}
