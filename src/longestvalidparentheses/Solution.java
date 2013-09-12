package longestvalidparentheses;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if (s == null) return 0;
        if (s.length() == 0) return 0;
        int res = 0;
        int count = 0;
        int last = -1;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
            	if (stack.size() == 0) {
                    last = i;
            	}
            	else {
                    stack.pop();
                    count+=2;
                    res = Math.max(res, count);
                } 
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.longestValidParentheses("()"));
    }
}