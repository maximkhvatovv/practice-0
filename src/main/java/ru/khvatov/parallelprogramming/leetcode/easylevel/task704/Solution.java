package ru.khvatov.parallelprogramming.leetcode.easylevel.task704;

/**
 * The task desc is available at <a href="https://leetcode.com/problems/binary-search/">704. Binary Search</a>
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}