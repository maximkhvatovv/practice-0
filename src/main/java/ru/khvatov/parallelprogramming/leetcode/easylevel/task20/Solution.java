package ru.khvatov.parallelprogramming.leetcode.easylevel.task20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * The task desc is available at <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openToClosed = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );

        Deque<Character> openBrackets = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char brace = s.charAt(i);

            if (openToClosed.containsKey(brace)) {
                openBrackets.push(brace);
            } else {
                boolean openingBracketsStackIsEmptyOrClosingBracketsIsNotMatchOpening
                        = openBrackets.isEmpty() || !openToClosed.get(openBrackets.pop()).equals(brace);
                if (openingBracketsStackIsEmptyOrClosingBracketsIsNotMatchOpening) {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}