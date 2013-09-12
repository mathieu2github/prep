package removedupfromsortedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	
	class ListNode {
		       int val;
		       ListNode next;
		       ListNode(int x) {
		           val = x;
		           next = null;
		       }
	}
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null) return null;
        ListNode first = head.next;
        ListNode sec = head;
        while (first!= null) {
            if (first.val != sec.val) {
                sec.next = first;
                sec = sec.next;
            }
            first = first.next;
        }
        sec.next = first;
        
        return head;
        
        
    }
}