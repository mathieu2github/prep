package subset2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
	    // Start typing your Java solution below
	    // DO NOT write main() function
	    Arrays.sort(num);
	    ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	    ret.add(new ArrayList<Integer>());

	    int start = 0;
	    for(int i = 0; i < num.length; i++)
	    {
	        int size = ret.size();
	        for(int j = start; j < size; j++)
	        {
	            ArrayList<Integer> sub = new ArrayList<Integer>(ret.get(j));
	            sub.add(num[i]);
	            ret.add(sub);
	        }
	        if(i < num.length - 1 && num[i + 1] == num[i])
	            start = size;
	        else
	            start = 0;
	    }

	    return ret;
	}
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup2(int[] num) {
	    ArrayList<ArrayList<Integer>> cache = new ArrayList<ArrayList<Integer>>();
	    // Add empty set
	    cache.add(new ArrayList<Integer>());
	    Arrays.sort(num);
	    return helper(num, 0, cache);
	}

	private ArrayList<ArrayList<Integer>> helper(int[] num, int index, ArrayList<ArrayList<Integer>> cache) {
	    if (index == num.length) return cache;

	    int count = 0;
	    ArrayList<ArrayList<Integer>> newCache = new ArrayList<ArrayList<Integer>>(cache);
	    for (ArrayList<Integer> set : cache) {
	        count = 0;
	        ArrayList<Integer> temp = new ArrayList<Integer>(set);
	        while (index + count < num.length && num[index] == num[index + count]) {
	            temp.add(num[index]);
	            newCache.add(new ArrayList<Integer>(temp));
	            count++;
	        }
	    }

	    return helper(num, index + count, newCache);
	}
}