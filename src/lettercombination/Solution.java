package lettercombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ArrayList<String> res = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            res.add("");
            return res;
        }
    	process(digits, res, new StringBuffer(), 0);
    	return res;
    }
    
    private static final Map<Character, String> map = new HashMap<Character, String>();
    static {
      map.put('2', "abc");
      map.put('3', "def");
      map.put('4', "ghi");
      map.put('5', "jkl");
      map.put('6', "mno");
      map.put('7', "pqrs");
      map.put('8', "tuv");
      map.put('9', "wxyz");
    };
    
    public void process(String digits, ArrayList<String> res, StringBuffer cur, int index) {
    	if (index == digits.length() - 1) {
    		String candid = map.get(digits.charAt(index));
    		for (int i = 0; i < candid.length(); i++) {
    			String ele = new String(cur.append(candid.charAt(i)));
    			res.add(ele);
    			cur.deleteCharAt(cur.length()-1);
    		}
    	} else {
    		String candid = map.get(digits.charAt(index));
    		for (int i = 0; i < candid.length(); i++) {
    			cur.append(candid.charAt(i));
    			process(digits,res,cur,index+1);
    			cur.deleteCharAt(cur.length()-1);
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.letterCombinations("2"));
    }
}
