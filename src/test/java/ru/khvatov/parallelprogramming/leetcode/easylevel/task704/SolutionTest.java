package ru.khvatov.parallelprogramming.leetcode.easylevel.task704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution sol;

    @BeforeEach
    void setUp() {
        sol = new Solution();
    }

    @Test
    void givenArrayContainingTarget_whenSearchForTarget_ReturnsCorrectIndex() {
        //given
        int target = 4;
        int[] nums = {-1, 0, 1, 3, target, 10, 134, 3244, 31432};

        //when
        int actualTargetIndex = sol.search(nums, target);

        //then
        int expectedTargetIndex = 4;
        Assertions.assertEquals(expectedTargetIndex, actualTargetIndex);
    }
}