package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 6, 3, 4, 1, 2};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas7Then2() {
        int[] data = new int[] {1, 3, 7};
        int element = 7;
        int result = FindLoop.indexOf(data, element);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas66Then1() {
        int[] data = new int[] {55, 66, 77};
        int element = 66;
        int result = FindLoop.indexOf(data, element);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}