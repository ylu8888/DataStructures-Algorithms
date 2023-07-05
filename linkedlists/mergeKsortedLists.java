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
class mergeKsortedLists{
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        ListNode current = new ListNode();

        for(int i = 0; i < lists.length;i++){
            current = lists[i];
            while(current != null){
                heap.add(current.val);
                current = current.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        
        int temp1 = heap.size();
        for(int i = 0; i < temp1; i++){
            ListNode temp = new ListNode(heap.remove());
            pointer.next = temp;
            pointer = pointer.next;

        }

        return dummy.next;
    }
}
