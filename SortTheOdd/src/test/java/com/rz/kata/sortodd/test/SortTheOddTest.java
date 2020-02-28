package com.rz.kata.sortodd.test;

import com.rz.kata.sortodd.SortTheOdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTheOddTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 0}, SortTheOdd.sortArray(new int[]{2, 4, 6, 8, 0}));
    }

}
