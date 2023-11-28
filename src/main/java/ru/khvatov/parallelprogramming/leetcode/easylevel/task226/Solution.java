package ru.khvatov.parallelprogramming.leetcode.easylevel.task226;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The task desc is available at <a href="https://leetcode.com/problems/invert-binary-tree/description/">226. Invert Binary Tree</a>
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.remove();

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                TreeNode temp = node.right;
                node.right = node.left;
                node.left = temp;
            }
        }
        return root;
    }

    public static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int value) {
            this(value, null, null);
        }

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this();
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public static boolean equals(TreeNode rootOfTree1, TreeNode rootOfTree2) {
            if (rootOfTree1 == rootOfTree2) {
                return true;
            }
            if (rootOfTree1 == null || rootOfTree2 == null) {
                return false;
            }
            return rootOfTree1.value == rootOfTree2.value
                    && equals(rootOfTree1.left, rootOfTree2.left)
                    && equals(rootOfTree1.right, rootOfTree2.right);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}