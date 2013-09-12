package longestSubWithoutRepeat;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        s = s.toLowerCase();
        int[] table = new int[26];
    	for (int i = 0; i < 26; i++)
    		table[i] = -1;
    	int mark = 0;
    	int max = 0;
    	
    	for (int i = 0; i < s.length() ; i++) {
    		if (table[s.charAt(i) - 'a'] == -1) {
    			table[s.charAt(i) - 'a'] = i;
    		} else {
    			max = Math.max(max, i - mark);   
    			while (s.charAt(i) != s.charAt(mark)) {
    				table[s.charAt(mark) - 'a'] = -1;
    				mark++;
    			}
    			mark++;
    		}
    	}
    	max = Math.max(max, s.length() - mark);
    	return max;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	String test = "abcabcde";
    	System.out.println("the max of " + test + " is " + s.lengthOfLongestSubstring(test));
    }
} 