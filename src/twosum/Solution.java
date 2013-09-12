package twosum;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		
        Hashtable<Integer, List<Integer>> index = new Hashtable<Integer, List<Integer>>();
        for (int i = 0; i < numbers.length; i++) {
        	List<Integer> weizhi = index.get(numbers[i]);
        	if (weizhi == null) {
        		weizhi = new ArrayList<Integer>();
        		weizhi.add(i);
        		index.put(numbers[i], weizhi);
        	}
        	weizhi.add(i);
        }
        
        int[] res = new int[2];

        for (int i = 0; i < numbers.length; i++) {
        	if (index.get(target - numbers[i]) == null)
        		continue;
        	else {
        		if (numbers[i] == target - numbers[i]) {
        			res[0] = index.get(target - numbers[i]).get(0) 
        						< index.get(target - numbers[i]).get(1) ?
        								index.get(target - numbers[i]).get(0) :
        									index.get(target - numbers[i]).get(1);
        		    res[1] =  index.get(target - numbers[i]).get(0) 
					       		> index.get(target - numbers[i]).get(1) ?
					       				index.get(target - numbers[i]).get(0) :
					       					index.get(target - numbers[i]).get(1);
				    break;
        		}
        		else {
        			res[0] = i < index.get(target - numbers[i]).get(0) ?
        					i : index.get(target - numbers[i]).get(0);
        			res[1] = i > index.get(target - numbers[i]).get(0) ?
        					i : index.get(target - numbers[i]).get(0);
				    break;
        		}
        	}
        }
        res[0] += 1;
        res[1] += 1;
        return res;
	}
	
	/*
	 * best solution
	 */
	public int[] twoSum2(int[] numbers, int target) {
		Hashtable<Integer, Integer> index = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (index.get(numbers[i]) != null) {
				int[] res = new int[2];
				res[0] = index.get(numbers[i]) + 1;
				res[1] = i + 1;
				return res;
			}
			index.put(target - numbers[i], i);
		}
		return null;
	}

}
