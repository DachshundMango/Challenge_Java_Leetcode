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

        ListNode midNode = head;

        int splitLength = listLength - (k % listLength);

        if (splitLength == listLength) {
            return head;
        }

        for (int i = 0; i < splitLength - 1; i++) {
            midNode = midNode.next;
        }

        lastNode.next = head;
        ListNode resultNode = midNode.next;
        midNode.next = null;

        return resultNode;
        
    }
}