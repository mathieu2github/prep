package subset;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (S.length == 0)
            return null;
        int size = 1 << S.length;
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> ele = new ArrayList<Integer>();
            int weizhi = 0;
            int temp = i;
            while ( temp > 0 ) {
                if ( (temp & 1) == 1)
                    ele.add(S[weizhi]);
                weizhi++;
                temp >>= 1;
            }
            res.add(ele);
        }
        
        return res;
        
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] sample = {4,1,0};
    	Arrays.sort(sample);
    	System.out.println(sol.subsets(sample));
    }
}