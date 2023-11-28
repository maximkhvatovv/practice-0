package ru.khvatov.parallelprogramming.leetcode.easylevel.task226;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void givenBinaryTree_whenRevertTree_thenReturnRevertedTree() {
        //given
        Solution sol = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(2);
        root.setLeft(new Solution.TreeNode(1));
        root.setRight(new Solution.TreeNode(2));

        //when
        Solution.TreeNode actualInvertedTreeRoot = sol.invertTree(root);

        //then
        Solution.TreeNode expectedInvertedRoot = new Solution.TreeNode(2);
        expectedInvertedRoot.setLeft(new Solution.TreeNode(2));
        expectedInvertedRoot.setRight(new Solution.TreeNode(1));
        Assertions.assertTrue(
                Solution.TreeNode.equals(expectedInvertedRoot, actualInvertedTreeRoot)
        );
    }
}