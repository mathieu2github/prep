package convertSortedListToBinarySearchTree;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	   public class ListNode {
		       int val;
		       ListNode next;
		       ListNode(int x) { val = x; next = null; }
	   }
	   
	   public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
	   }
		   
		   
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if ( head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        
        int co = 0;
        ListNode k = head;
        while (k!= null) {
            k = k.next;
            co++;
        }
        
        int mid = co/2 + 1;
        ListNode str = head;
        int n = 1;
        
        while ( n < mid ) {
            n++;
            str = str.next;
        }
        
        ListNode h2 = str.next;
        
        TreeNode res = new TreeNode(str.val);
        res.right = sortedListToBST(h2);
        
        ListNode str2 = head;
        while (str2.next != str) {
            str2 = str2.next;
        }
        
        str2.next = null;
        res.left = sortedListToBST(head);

        return res;
        
        
    }
}