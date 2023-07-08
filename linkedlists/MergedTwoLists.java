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
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr = new ArrayList<>();
        ListNode current = list1;

        while(current != null){
            arr.add(current.val);
            current = current.next;
        }

        current = list2;
        while(current != null){
            arr.add(current.val);
            current = current.next;
        }

        Collections.sort(arr);

        ListNode node = new ListNode(0);
        ListNode pointer = node;
        
        for(int i = 0; i < arr.size(); i++){
            ListNode temp = new ListNode(arr.get(i));
            pointer.next = temp;
            pointer = pointer.next;
        }

        return node.next;
        
    }
}
