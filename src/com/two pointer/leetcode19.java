package com.company;

public class LeetCode19 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode pre = new ListNode(0);
            pre.next = head;
            ListNode slow = pre;
            ListNode fast = pre;
            while(n>0){
                fast = fast.next;
                n--;
            }
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return pre.next;
        }
    }
}
