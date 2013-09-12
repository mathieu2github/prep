package triangle;

import java.util.ArrayList;

public class Solution {
	 public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
	        // Start typing your Java solution below
	    if (triangle == null) return 0;
	    //if (triangle.size() == 1) return  triangle.get(0).get(0);
	    for (int i = triangle.size() - 2; i >= 0; i--) {
	        	ArrayList<Integer> up = triangle.get(i);
	    		ArrayList<Integer> low = triangle.get(i+1);
	    		
	    		for (int j = 0; j < up.size(); j++) {
	    			int n1 = low.get(j);
	    			int n2 = low.get(j+1);
	    			up.set(j, up.get(j) + Math.min(n1, n2));
	    		}
	    	}
	    	
	    return triangle.get(0).get(0);
	 }
	}