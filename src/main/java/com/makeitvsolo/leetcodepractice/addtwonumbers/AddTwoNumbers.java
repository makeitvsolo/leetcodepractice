package com.makeitvsolo.leetcodepractice.addtwonumbers;

/**
 * <p>
 *     You are given two non-empty linked lists representing two non-negative integers.
 *     The digits are stored in reverse order, and each of their nodes contains a single digit.
 *     Add the two numbers and return the sum as a linked list.
 * </p>
 *
 * <p>
 *     You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
public final class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var lResult = new ListNode();
        var head = lResult;

        var offset = 0;

        while (true) {
            var next = offset;

            if (l1 != null) {
                next += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                next += l2.val;
                l2 = l2.next;
            }

            head.val = next % 10;
            offset = next / 10;

            if (l1 == null && l2 == null && offset == 0) {
                return lResult;
            }

            head.next = new ListNode();
            head = head.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
            this.next = null;
            this.val = 0;
        }

        ListNode(int val) {
            this.next = null;
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.next = next;
            this.val = val;
        }
    }
}
