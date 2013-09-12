package rotatelist;

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
	
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if (head == null || n == 0)
            return head;
            
        ListNode shushu = head;
        int geshu = 1;
        while (shushu.next != null) {
            shushu = shushu.next;
            geshu++;
        }
        
        if (geshu == 1)
            return head;
        
        
        
        ListNode start = head;
        ListNode end = head;
        
        int yushu = n % geshu;
        
        if (yushu == 0)
            return head;
        
        while ( yushu > 0) {
            end = end.next;
            yushu--;
        }
        
        while ( end.next != null) {
            start = start.next;
            end = end.next;
        }
        
        ListNode res = start.next;
        start.next = null;
        end.next = head;
        return res;
    }
}