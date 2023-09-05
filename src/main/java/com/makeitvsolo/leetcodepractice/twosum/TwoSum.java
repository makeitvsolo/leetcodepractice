package com.makeitvsolo.leetcodepractice.twosum;

import java.util.HashMap;

/**
 * <p>
 *     Given an array of integers nums and an integer target,
 *     return indices of the two numbers such that they add up to target.
 * </p>
 * <p>
 *     You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * </p>
 *
 * <p>
 *     You can return the answer in any order.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public final class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] { 0, 1 };
        }

        var numMap = new HashMap<Integer, Integer>();

        for (var index = 0; index < nums.length; index++) {
            var num = nums[index];
            var required = target - num;

            if (numMap.containsKey(required)) {
                return new int[] { numMap.get(required), index };
            }

            numMap.put(num, index);
        }

        return new int[] {};
    }
}
