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
    public ListNode reverseList(ListNode head) {

        // Initialize pointers
        ListNode prev = null;
        ListNode current = head;

        // Traverse the list
        while (current != null) {
            // 1. Temporarily store the next node so we don't lose the chain
            ListNode nextNode = current.next;
            
            // 2. Reverse the link (point current node backwards to prev)
            current.next = prev;
            
            // 3. Move both pointers one step forward for the next iteration
            prev = current;
            current = nextNode;
        }
        
        // Once 'current' reaches null, 'prev' is pointing to our new head
        return prev;

    }
}
