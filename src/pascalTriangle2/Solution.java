package pascalTriangle2;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> getRow(int rowIndex) {
	    ArrayList<Integer> resultList = new ArrayList<Integer>();
	    if (rowIndex == 0) {
	        resultList.add(1);
	        return resultList;
	    }
	    // Initial
	    resultList.add(1);
	    resultList.add(1);

	    for (int i = 2; i <= rowIndex; i++) {
	        resultList.add(1, resultList.get(0) + resultList.get(1));       
	        for (int j = 2; j < resultList.size() - 1; j++) {
	            resultList.set(j, resultList.get(j) + resultList.get(j + 1));
	        }
	    }
	    return resultList;
	}
	
    public ArrayList<Integer> getRow2(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (rowIndex < 0) return res;
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }
        
        res.add(1);
        ArrayList<Integer> sub = getRow(rowIndex-1);
        for (int j = 1; j < sub.size(); j++) {
            res.add(sub.get(j-1) + sub.get(j));
        }
        res.add(1);
        return res;
        
    }
}
