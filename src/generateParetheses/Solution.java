package generateParetheses;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> res = new ArrayList<String>();
        
        generate(n, n , res, new StringBuffer());
        return res;
    }
    
    public void generate(int n, int m, ArrayList<String> res, StringBuffer pare) {
        if ( n > m) return;
        
        if ( n == 0) {
        	StringBuffer p = new StringBuffer(pare);
            while ( m !=0) {
                p.append(")");
                m--;
            }
            res.add(p.toString());
            return;
        }
        generate(n-1, m ,res, pare.append("("));
        pare.deleteCharAt(pare.length() - 1);
        generate(n, m - 1, res, pare.append(")"));
        pare.deleteCharAt(pare.length() - 1);
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	System.out.println(sol.generateParenthesis(4));
    }
}