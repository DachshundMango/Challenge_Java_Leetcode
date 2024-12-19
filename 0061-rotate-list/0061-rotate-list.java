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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (k == 0 || head == null) {
            return head;
        }

        int listLength = 1;
        ListNode lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            listLength++;
        }

        int leftLength = k % listLength;

        if (leftLength == 0) {
            return head;
        }

        ListNode midNode = head;

        int rightLength = listLength - leftLength;

        for (int i = 0; i < rightLength - 1; i++) {
            midNode = midNode.next;
        }

        lastNode.next = head;
        ListNode resultHead = midNode.next;
        midNode.next = null;

        return resultHead;
        
        

    }
}