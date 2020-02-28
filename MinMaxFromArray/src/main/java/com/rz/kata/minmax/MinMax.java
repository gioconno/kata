package com.rz.kata.minmax;

import java.util.Arrays;


public class MinMax {

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    public int minStat(int[] list) {
        return Arrays.stream(list).summaryStatistics().getMin();
    }

    public int maxStat(int[] list) {
        return Arrays.stream(list).summaryStatistics().getMax();
    }
}
