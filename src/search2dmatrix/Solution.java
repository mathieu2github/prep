package search2dmatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int min = matrix[0][0];
        int m = matrix.length;
        int n = matrix[0].length;
        int max = matrix[m-1][n-1];
        
        if (target < min || target > max)
            return false;
        
        int range = searchRange(matrix, target);
        return searchRow(matrix, range, target);

    }
    
    public int searchRange(int[][] matrix, int target) {
    	int lo = 0;
    	int hi = matrix.length - 1;
    	while (lo <= hi) {
    		int mid = (lo + hi)/2;
    		if (target < matrix[mid][0])
    			hi = mid - 1;
    		else if (target > matrix[mid][matrix[0].length-1])
    			lo = mid + 1;
    		else
    			return mid;
    	}
    	return -1;
    }
    
    public boolean searchRow(int[][] matrix, int row, int target) {
    	if (row == -1)
    		return false;
    	int length = matrix[0].length-1;
    	int lo = 0;
    	int hi = length;
    	while (lo <= hi) {
    		int mid = (lo + hi)/2;
    		if (target == matrix[row][mid])
    			return true;
    		else if (target < matrix[row][mid])
    			hi = mid - 1;
    		else 
    			lo = mid + 1;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	
    	int[][] sample = {{1},{3}};
    	System.out.println(sample.length);
    	System.out.println(sample[0].length);
    	System.out.println(sol.searchMatrix(sample, 2));    	
    }
}