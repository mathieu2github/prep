package removenthnodefromendoflist;

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
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null) return null;
        
        ListNode shushu = head;
        int geshu = 1;
        while (shushu.next != null) {
            geshu++;
            shushu = shushu.next;
        }
        if (geshu == n)
            return head.next;
            
        

        ListNode end = head;
        while (n > 0) {
            end = end.next;
            n--;
        }
        
        ListNode start = head;
        while(end.next !=null) {
            start = start.next;
            end = end.next;
        }
        
        start.next = start.next.next;
        return head;
        
        
        
    }
}