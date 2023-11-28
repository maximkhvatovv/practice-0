package ru.khvatov.parallelprogramming.leetcode.easylevel.task20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void givenValidStringWithDifferentParenthesesArrangedInSeries_whenIsValidPerforms_returnTrue() {
        String s = "()[]{}";

        Solution sol = new Solution();
        boolean actual = sol.isValid(s);

        assertTrue(actual);
    }

    @Test
    void givenValidStringWithDifferentParenthesesNestedInsideEachOther_whenIsValidPerforms_returnFalse() {
        String s = "({[()]})";

        Solution sol = new Solution();
        boolean actual = sol.isValid(s);

        assertTrue(actual);
    }

    @Test
    void givenInvalidStringWithWithSequenceOfDifferentBrackets_whenIsValidPerforms_returnFalse() {
        String s = "]({[()]})";

        Solution sol = new Solution();
        boolean actual = sol.isValid(s);

        assertFalse(actual);
    }
}