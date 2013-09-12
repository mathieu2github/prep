package sumrootleafnumber;


 
public class Solution {
	
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	
	public int sumNumbers(TreeNode root) {
	       // Start typing your Java solution below
	       // DO NOT write main() function
	        if (root == null) return 0;
			int sum = 0;
			return process(root, sum, 0);
	   }
		
		public int process(TreeNode root, int sum, int upper) {
			if (root.left == null && root.right == null)
				return 10*upper + root.val;
			int upper_l = upper* 10 + root.val;
	        int he = 0;
	        if ( root.left != null)
	            he += process(root.left, sum, upper_l);
	        if ( root.right != null)
			    he += process(root.right, sum, upper_l);
	        return he;
		}
}