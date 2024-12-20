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
    public ListNode partition(ListNode head, int x) {

        ListNode result = new ListNode();
        ListNode largerNodes = new ListNode();

        ListNode search = head;
        ListNode smallTarget = result;
        ListNode largeTarget = largerNodes;

        while (search != null) {

            if (search.val < x) {
                smallTarget.next = new ListNode();
                smallTarget = smallTarget.next;
                smallTarget.val = search.val;

            } else {
                largeTarget.next = new ListNode();
                largeTarget = largeTarget.next;
                largeTarget.val = search.val;
            }

            search = search.next;
        }

        largerNodes = largerNodes.next;
        smallTarget.next = largerNodes;
        result = result.next;
        return result;

        
    }
}