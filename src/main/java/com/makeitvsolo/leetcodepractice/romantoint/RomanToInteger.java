package com.makeitvsolo.leetcodepractice.romantoint;

import java.util.ArrayDeque;
import java.util.Map;

/**
 * <p>
 *     Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.
 * </p>
 * <p>
 *     Given a roman numeral, convert it to an integer.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">Roman To Integer</a>
 */
public final class RomanToInteger {
    private static final Map<Character, Integer> romans = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
    );

    public int romanToInt(String s) {
        if (s.length() < 2) {
            return s.chars()
                           .map(i -> romans.get((char) i))
                           .reduce(Integer::sum).getAsInt();
        }

        var sum = 0;
        var deque = new ArrayDeque<Integer>(2);

        var ints = s.chars()
                           .map(i -> romans.get((char) i))
                           .toArray();

        deque.addFirst(ints[0]);
        deque.addLast(ints[1]);

        for (int index = 2; index < ints.length; index++) {
            var first = deque.getFirst();
            var last = deque.getLast();

            if (first >= last) {
                sum += first;
            } else {
                sum -= first;
            }

            deque.removeFirst();
            deque.addLast(ints[index]);
        }

        var first = deque.getFirst();
        var last = deque.getLast();

        if (first >= last) {
            sum += first;
            sum += last;
        } else {
            sum -= first;
            sum += last;
        }

        return sum;
    }
}
