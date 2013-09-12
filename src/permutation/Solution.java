package permutation;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
        if ( num.length == 1) {
            ArrayList<Integer> ele = new ArrayList<Integer>();
            ele.add(num[0]);
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            res.add(ele);
            return res;
        }
        
        int first = num[0];
        int[] num1 = new int[num.length-1];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = num[i+1];
        }
        ArrayList<ArrayList<Integer>> sub = permute(num1);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> ele : sub) {
            for (int i = 0 ; i <= ele.size(); i++) {
                ArrayList<Integer> ele1 = new ArrayList<Integer>(ele);
                ele1.add(i,first);
                res.add(ele1);
            }
        }
        
        return res;
    }
}