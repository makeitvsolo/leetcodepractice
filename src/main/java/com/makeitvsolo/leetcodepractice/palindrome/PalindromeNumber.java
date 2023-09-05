package com.makeitvsolo.leetcodepractice.palindrome;

/**
 * <p>
 *     Given an integer x, return true if x is a palindrome, and false otherwise.
 *     An integer is a palindrome when it reads the same forward and backward.
 * </p>
 *
 * <p>
 *     For example, `121` is a palindrome while `123` is not.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a>
 */
public final class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        return asString(x).equals(asReversedString(x));
    }

    private String asString(int x) {
        return String.valueOf(x);
    }

    private String asReversedString(int x) {
        var sb = new StringBuilder();

        return sb.append(Math.abs(x))
                       .reverse()
                       .toString();
    }
}
