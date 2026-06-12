/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previousPointer = null;
        ListNode currentPointer = head;
        ListNode tempP = null;
        while (currentPointer != null) {
            tempP = currentPointer.next;
            currentPointer.next = previousPointer;
            previousPointer = currentPointer;
            currentPointer = tempP;
        }
        return previousPointer;
    }
}
