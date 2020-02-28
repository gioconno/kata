package com.rz.kata.enough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Delete occurrences of an element if it occurs more than n times
 *
 * Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
 * For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would
 * lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 *
 */
public class EnoughIsEnough {

    private EnoughIsEnough() {
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> filteredElements = new ArrayList<>();

        for (int element : elements) {
            int count = countMap.getOrDefault(element, 0);
            if (count < maxOccurrences) {
                countMap.put(element, ++count);
                filteredElements.add(element);
            }
        }

        return filteredElements.stream().mapToInt(i -> i).toArray();
    }


}
