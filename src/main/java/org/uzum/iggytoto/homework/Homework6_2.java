package org.uzum.iggytoto.homework;

public class Homework6_2 {

    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        int increasing = 1, decreasing = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                increasing = Math.max(increasing + 1, decreasing);
            } else if (nums[i] < nums[i - 1]) {
                decreasing = Math.max(increasing, decreasing + 1);
            } else {
                increasing = decreasing = 1;
            }
        }

        return Math.max(increasing, decreasing);
    }
}

