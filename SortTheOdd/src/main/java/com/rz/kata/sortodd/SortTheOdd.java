package com.rz.kata.sortodd;

import java.util.Arrays;

public class SortTheOdd {

    private SortTheOdd() {
    }

    public static int[] sortArray(int[] array) {

        if (array.length == 0) return array;

        int[] oddArray = Arrays.stream(array)
                .filter(element -> (element % 2 != 0))
                .sorted()
                .toArray();

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddArray[oddIndex];
                oddIndex++;
            }
        }

        return array;
    }

}
