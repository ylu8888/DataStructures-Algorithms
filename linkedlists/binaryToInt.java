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
class binaryToInt {
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        int count = 0; 
        int sum = 0;
        while(current != null){
            count++;
            current = current.next;
        
        }

        current = head;
        while(current != null){
            if(current.val == 1){
                sum += (Math.pow(2,(count-1))); 
                count--;
            }
            else{
                count--;
            }
           
            current = current.next;
        }
         return sum;
    }
   
}
