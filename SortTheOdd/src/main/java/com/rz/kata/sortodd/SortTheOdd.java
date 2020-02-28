package com.rz.kata.sortodd;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class SortTheOdd {

    private SortTheOdd() {
    }

    public static int[] sortArray(int[] array) {

        bestSolution(array);

        if (array.length == 0) return array;

        int[] oddArray = Arrays.stream(array)
                .filter(element -> (element % 2 != 0))
                .sorted()
                .toArray();

        for (int index = 0, oddIndex = 0; index < array.length; index++) {
            if (array[index] % 2 == 1) {
                array[index] = oddArray[oddIndex++];
            }
        }

        return array;
    }

    public static int[] bestSolution(int[] array) {

        PrimitiveIterator.OfInt sortedOdds = IntStream
                .of(array)
                .filter(i -> i % 2 == 1)
                .sorted()
                .iterator();

        return IntStream
                .of(array)
                .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
                .toArray();
    }


}
