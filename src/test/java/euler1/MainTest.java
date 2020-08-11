package euler1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void shouldReturnTwentyThreeWhenMaxNumberIsTen() {

        //given
        int limitNumber = 10;

        //when
        int result = Main.specialSumOfNumbers(limitNumber);

        //then
        int expected = 23;

        assertEquals(expected, result);
    }



@Test
    void shouldReturnThirtyThreeWhenMaxNumberIsEleven() {

        //given
        int limitNumber = 11;

        //when
        int result = Main.specialSumOfNumbers(limitNumber);

        //then
        int expected = 33;

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnThirtyThreeWhenMaxNumberIsTwelve() {

        //given
        int limitNumber = 12;

        //when
        int result = Main.specialSumOfNumbers(limitNumber);

        //then
        int expected = 33;

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnFourtyFiveWhenMaxNumberIsThirteen() {

        //given
        int limitNumber = 13;

        //when
        int result = Main.specialSumOfNumbers(limitNumber);

        //then
        int expected = 45;

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnSixtyWhenMaxNumberIsSixteen() {

        //given
        int limitNumber = 16;

        //when
        int result = Main.specialSumOfNumbers(limitNumber);

        //then
        int expected = 60;

        assertEquals(expected, result);
    }
}

