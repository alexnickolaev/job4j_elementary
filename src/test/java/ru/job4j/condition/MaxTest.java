package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        int first = 5;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To100Then100() {
        int first = 1;
        int second = 100;
        int result = Max.max(first, second);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int first = 7;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax23To24To25Then25() {
        int first = 23;
        int second = 24;
        int third = 25;
        int result = Max.max(first, second, third);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1000To100To10To1Then1000() {
        int first = 1000;
        int second = 100;
        int third = 10;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 1000;
        assertThat(result).isEqualTo(expected);
    }

}