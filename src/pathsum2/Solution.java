package pathsum2;

import java.util.ArrayList;

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
	
	class TreeNode {
		int val;
		TreeNode right;
		TreeNode left;
		public TreeNode(int x) { val = x; }
	}
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if (root == null) return res;
        
        pathSum(root, sum, path, res);
        return res;
    }
    
    public void pathSum(TreeNode root, int sum, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
    	if (root == null) return;
        if (root.left == null && root.right == null && root.val == sum) {
        	ArrayList<Integer> temp = new ArrayList<Integer>(path);
            temp.add(root.val);
            res.add(temp);
        }
        
        ArrayList<Integer> temp = new ArrayList<Integer>(path);
        temp.add(root.val);
        
        pathSum(root.left, sum - root.val, temp, res);
        pathSum(root.right, sum - root.val, temp, res);
        temp.remove(temp.size() - 1);
        
    }
    
}