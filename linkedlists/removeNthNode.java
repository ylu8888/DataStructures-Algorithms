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
class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> arr = new ArrayList<>();

        ListNode current = head;
        while(current != null){
            arr.add(current.val);
            current = current.next;
        }

        arr.remove(arr.size() - n);
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        for(int i = 0; i < arr.size(); i++){
            ListNode temp = new ListNode(arr.get(i));
            pointer.next = temp;
            pointer = pointer.next;
        }

        return dummy.next;
    }
}
