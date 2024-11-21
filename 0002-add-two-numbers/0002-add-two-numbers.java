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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int tenNumber = 0;
        int carry = 0;
        ListNode result = new ListNode();
        ListNode current = result;

        while (l1 != null || l2 != null) {
            int var = carry;

            if (l1 != null) {
                var += l1.val;
            }
            if (l2 != null) {
                var += l2.val;
            }
            current.val = var % 10;
            carry = var / 10;
            System.out.println(current.val);
            tenNumber++;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry != 0 || l1 != null || l2 != null) {
                current.next = new ListNode();
                current = current.next;
            }

        }

        if (carry != 0) {
            current.val = carry;
        }


        return result;

   
    }
}