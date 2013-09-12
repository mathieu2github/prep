package nqueens;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String[]> res = new ArrayList<String[]>();
        String[] sq = prepare(n);
        process(res, sq, n);
        return res;
    }
    
    public String[] prepare(int n) {
    	 String[] sq = new String[n];
         String line = "";
         for (int i = 0; i < n; i++) {
         	line +=".";
         }
         for (int i = 0; i < n; i++) {
         	sq[i] = line;
         }
         return sq;
    }
    public void process(ArrayList<String[]> res, String[] sq, int n) {
        process(res,0,sq);
    }
    
    public void process(ArrayList<String[]> res, int index, String[] sq) {
    	if (index == sq.length - 1) {
    		for (int i = 0; i < sq.length; i++) {
    			place(sq,index,i);
    			if (check(sq, index,i)) {
    				String[] temp = new String[index+1];
    				for (int j = 0; j < temp.length; j++) {
    					temp[j] = new String(sq[j]);
    				}
    				res.add(temp);
    			}
    			displace(sq,index,i);
    		}
    	} else {
    		for (int i = 0; i < sq.length; i++) {
    			place(sq,index,i);
    			if (check(sq, index,i))
    				process(res,index+1,sq);
    			displace(sq,index,i);
    		}
    	}
    }
    
    public void place(String[] sq, int index, int i) {
    	if (sq[index].charAt(i) == '.')
    		sq[index] = sq[index].substring(0,i) + "Q" + sq[index].substring(i+1);
    }
    public void displace(String[] sq, int index, int i) {
    	if (sq[index].charAt(i) == 'Q')
    		sq[index] = sq[index].substring(0,i) + "." + sq[index].substring(i+1);
    }
    public boolean check(String[] sq, int index, int weizhi) {
    	if (index == 0)
    		return true;
    	
    	for (int i = 0; i < sq.length; i++) {
    		int count = 0;
    		for (int j = 0; j <= index; j++) {
    			if (sq[j].charAt(i) == 'Q')
    			    count++;
    			if (count > 1)
    				return false;
    		}
    	}
    	
    	for (int i = 0; i < sq.length; i++) {
    		for (int j = 0; j < index; j++) {
    			if (sq[j].charAt(i) == 'Q') {
    				if (Math.abs(j - index) == Math.abs(i - weizhi))
    					return false;
    			}
    		}
    	}
    	return true;
    }
    
    public void print(ArrayList<String[]> sq) {
    	for (int i = 0; i < sq.size();i++) {
    		String[] a = sq.get(i);
    		for (int j = 0; j < a.length; j++) {
    			System.out.println(a[j]);
    		}
    		System.out.println();
    	}
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	sol.print(sol.solveNQueens(12));
    	System.out.println(sol.solveNQueens(8).size());
    }

}
