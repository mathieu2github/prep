package reverselinkedlist;


public class Solution {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
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
	    
	    public ListNode reverseBetween(ListNode head, int m, int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	    	
	    	if (head == null) return null;
	    	
	    	int geshu = 1;
	    	ListNode shushu = head;
	    	while (shushu.next != null) {
	    		shushu = shushu.next;
	    		geshu++;
	    	}
	        
	        if (geshu == 1 || m ==n)
	            return head;
	            
	        if ( m == 1 && n == geshu ) {
	            ListNode current = head;
	            ListNode next = head.next;
			    ListNode loop = null;
			
			    while (next != null) {
				    current.next = loop;
			 	    loop = current;
				    current = next;
				    next = next.next;
			    }
	            current.next = loop;
			    return current;	
	        }            
	    	
	    	ListNode start = head;
	    	ListNode end = head;
	    	
	    	ListNode tou = start;
	    	
	    	while (m > 1) {
	    		start = start.next;
	    		if (m == 1)
	    			tou = start;
	    		m--;
	    	}
	    	
	    	while (n > 1) {
	    		end = end.next;
	    		n--;
	    	}
	        

	    	
	    	ListNode tail = end.next;
	    	
	    	ListNode current = start;
	    	ListNode next = start.next;
	    	ListNode loop = tail;
	    	
	    	while (next != tail) {
	    		current.next = loop;
	    		loop = current;
	    		current = next;
	    		next = next.next;
	    	} 
	        


	        current.next = loop;
	        if ( m == 1)
	            return current;
	        tou.next = current;
	        current.next = tail;
	        return head;
	    	
	        
	    }
}