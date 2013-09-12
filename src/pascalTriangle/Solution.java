package pascalTriangle;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if (numRows < 1) return res;
        if (numRows == 1)  {
            ArrayList<Integer> ele = new ArrayList<Integer>();
            ele.add(1);
            res.add(ele);
            return res;
        }
        
        if (numRows == 2) {
            ArrayList<Integer> ele = new ArrayList<Integer>();
            res.addAll(generate(1));
            ele.add(1);
            ele.add(1);
            res.add(ele);
            return res;
        }
        
        ArrayList<ArrayList<Integer>> sub = generate(numRows - 1) ;
        ArrayList<Integer> ele = new ArrayList<Integer>();
            ele.add(1);
            
        ArrayList<Integer> upper = sub.get(numRows - 1 - 1);
        for (int i = 0; i < upper.size() - 1; i++) {
            ele.add(upper.get(i) + upper.get(i+1));
        }
        ele.add(1);
        res.addAll(sub);
        res.add(ele);
        return res;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.generate(3));
    }
}