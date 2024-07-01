package ru.job4j.loop;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    void when3to5Then12() {
        int expected = 12;
        int result = Counter.sum(3, 5);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinus2to2Then0() {
        int expected = 0;
        int result = Counter.sum(-2, 2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5to3Then0() {
        int expected = 0;
        int result = Counter.sum(5, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when10to12Then33() {
        int expected = 33;
        int result = Counter.sum(10, 12);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0to6Then21() {
        int expected = 21;
        int result = Counter.sum(0, 6);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom2To6Then12() {
        int start = 2;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To14Then36() {
        int start = 10;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus4To6Then6() {
        int start = -4;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}
