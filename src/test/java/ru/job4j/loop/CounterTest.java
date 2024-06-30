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
}
