package validateparentheses;

import java.util.Stack;

public class Solution {
	
	public char pair (char c) {
		if (c == ')')
			return '(';
		if (c == ']')
			return '[';
		if (c == '}')
			return '{';
		return ' ';
	}
	
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	Stack<Character> array = new Stack<Character>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (!array.isEmpty() && pair(s.charAt(i)) == array.peek()) {
    			array.pop();
    		} else {
    			array.push(s.charAt(i));
    		}
    	}
    	
    	return array.isEmpty();
    }

}
