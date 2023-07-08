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
class ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode counter = head;
        int count = 0;
        while(counter != null){
            counter = counter.next;
            count++;
        }
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(count % 2 == 0){
            while(slow != null){
            arr.add(slow);
            slow = slow.next;
            }
        }
        else{
            while(slow.next != null){
            slow = slow.next;
            arr.add(slow);
            }
        }
        
        int i = arr.size() - 1;
        ListNode current = head;
        ListNode original = head;
        while(i >= 0){
            original = original.next;
            current.next = arr.get(i);
            current = current.next;
            current.next = original;
            current = original;
            i--;
        }

        current.next = null;

    }
}
