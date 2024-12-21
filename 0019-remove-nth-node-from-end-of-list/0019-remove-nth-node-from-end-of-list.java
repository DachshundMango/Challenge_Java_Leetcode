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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode lastNode = head;

        int nodeLength = 1;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            nodeLength++;
        }

        if (n == nodeLength) {
            head = head.next;
            return head;
        }

        ListNode breakPointNode = head;

        int targetPoint = nodeLength - n;

        for (int i = 0; i < targetPoint - 1; i++) {
            breakPointNode = breakPointNode.next;
        }

        ListNode continuingNode = head;

        for (int i = 0; i <= targetPoint; i++) {
            continuingNode = continuingNode.next;
        }


        if (n == 1) {
            breakPointNode.next = null;
        } else {
            breakPointNode.next = continuingNode;
        }

        return head;




        
    }
}