package com.rz.kata.middlechar;

/*
 * Get the Middle Character
 *
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character.
 * f the word's length is even, return the middle 2 characters.
 *
 * */

public class MiddleChar {

    private MiddleChar() {
    }

    public static String getMiddle(String word) {

        int minIndex = (word.length() % 2 == 0) ? (word.length() / 2) - 1 : word.length() / 2;
        int maxIndex = (word.length() / 2) + 1;

        getMiddleBestSolution(word);

        return word.substring(minIndex, maxIndex);
    }

    public static String getMiddleBestSolution(String word) {
        return (word.length() % 2 != 0)
                ? String.valueOf(word.charAt(word.length() / 2))
                : word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
    }

}
