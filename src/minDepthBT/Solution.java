package minDepthBT;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	   public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
		   }
	
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
         return minDepth(root, 0);
    }
    
    public int minDepth(TreeNode root, int n) {
        if (root == null) return n;
        
        int min = n;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            if (q.poll() == null) return min;
            min++;
            q.add(root.left);
            q.add(root.right);
        }
        
        return min;
        
        
    }
}
