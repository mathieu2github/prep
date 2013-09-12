package convertSortedArrayToBinarySearchTree;

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
	
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
	}
	 
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (num == null) return null;
        
        return sortedArrayToBST(num, 0, num.length - 1);
        
    }
    
    public TreeNode sortedArrayToBST(int[] num, int n, int m) {
        if ( n > m) return null;
        if ( n == m) return new TreeNode(num[n]);
        int number  = m - n + 1;
        int mid = number/2 + n;
        TreeNode res = new TreeNode(num[mid]);
        res.left = sortedArrayToBST(num, n, mid - 1);
        res.right = sortedArrayToBST(num, mid + 1, m);
        return res;
    }
}