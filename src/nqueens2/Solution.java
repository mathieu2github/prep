package nqueens2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
    public int totalNQueens(int n) {
	    // Start typing your Java solution below
	    // DO NOT write main() function
	    ArrayList<String[]> result = new ArrayList<String[]>();
	    //this is the array to store the queen position in each row
	    int[] path = new int[n];

	    String[] solution = new String[n];

	    solveNQueensHelper(n, result, n, path, solution);

	    return result.size();

	}

	public void solveNQueensHelper(int n, ArrayList<String[]> result, 
	  int row, int[] path, String[] solution) {

	    if (row == 0) {

	       String[] f = Arrays.copyOf(solution, n);

	       result.add(f);

	    } else {

	        for (int p=0; p<n; p++) {
	            //in row index, put queue at column p
	            if (isValid(path, p, row-1, n)) {

	                path[row-1] = p;

	                String s = createString(p, n);

	                solution[n-row] = s;

	                solveNQueensHelper(n, result, row-1, path, solution);

	            }

	        }

	    }
	}

	public String createString(int queen, int len) {

	    String result = "";

	    for (int i=0; i<len; i++) {

	        if (i == queen) {

	            result += "Q";

	        } else {

	            result += ".";

	        }
	    }

	    return result;
	}

	public boolean isValid(int[] path, int queen, int row, int n) {

	    for (int i=n-1; i>row; i--) {

	        int col = path[i];
	        //check if col is duplicated
	        if (col == queen) return false;

	        int row_distance = Math.abs(row - i);

	        int col_distance = Math.abs(col - queen);

	        if (col_distance == row_distance) return false;

	    }

	    return true;

	}
   
}