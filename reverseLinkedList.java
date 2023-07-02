//Move three pointers, current, head, and prev. Keep swapping pointers till you reach the end, return prev

class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(head != null){
            current = head.next;
            head.next = prev;
            prev = head;
            head = current;
        }

        return prev;
    }
}
