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


class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

      // Move three pointers, current, head, and prev. Keep swapping pointers till you reach the end, return prev
        while(head != null){
            current = head.next;
            head.next = prev;
            prev = head;
            head = current;
        }

        return prev;
    }
}
