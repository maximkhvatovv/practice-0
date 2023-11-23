package ru.khvatov.parallelprogramming.leetcode.easylevel.task20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * The task desc is available at <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openingToClosing = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );

        Deque<Character> openingBrackets = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char anotherBracket = s.charAt(i);

            if (openingToClosing.containsKey(anotherBracket)) {
                openingBrackets.push(anotherBracket);
            } else {
                if (openingBrackets.isEmpty()) {
                    return false;
                }
                Character openingBracket = openingBrackets.pop();
                if (!openingToClosing.get(openingBracket).equals(anotherBracket)) {
                    return false;
                }
            }
        }
        return openingBrackets.isEmpty();
    }
}