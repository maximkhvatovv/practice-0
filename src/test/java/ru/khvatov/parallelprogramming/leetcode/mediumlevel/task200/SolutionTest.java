package ru.khvatov.parallelprogramming.leetcode.mediumlevel.task200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void givenGridWithOneIsland_whenCountNumIslands_thenReturn1() {
        Solution sol = new Solution();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '0', '0'},
                {'0', '0', '1', '1', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int actualNumIslands = sol.numIslands(grid);
        int expectedNumIslands = 1;

        Assertions.assertEquals(expectedNumIslands, actualNumIslands);

    }
}