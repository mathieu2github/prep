package symmetricTree;

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
	
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
	}
	public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        toArrayList(root, res);
        return judge(res);
        
    }
    
    public void toArrayList(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return ;
        if (root.left == null && root.right == null) {
            res.add(root.val);
            return ;
        }
        
        toArrayList(root.left, res);
        res.add(root.val);
        toArrayList(root.right, res);
    }
    
    public boolean judge(ArrayList<Integer> res) {
        if ( res == null) return false;
        for (int i = 0; i < res.size()/2; i++) {
            if ( res.get(i).intValue() != res.get(res.size() - 1 - i).intValue())
                return false;
        }
        return true;
    }
}