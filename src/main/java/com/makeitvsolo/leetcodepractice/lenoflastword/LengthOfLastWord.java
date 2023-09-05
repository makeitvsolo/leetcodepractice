package com.makeitvsolo.leetcodepractice.lenoflastword;

import java.util.Arrays;

/**
 * <p>
 *     Given a string s consisting of words and spaces, return the length of the last word in the string.
 *     A word is a maximal substring consisting of non-space characters only.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">Length of Last Word</a>
 */
public final class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        return Arrays.stream(s.split(" "))
                       .reduce((first, second) -> second)
                       .orElse("")
                       .length();
    }
}
