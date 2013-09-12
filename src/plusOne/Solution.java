package plusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int sign = 0;
        

        int i = digits.length;
        while ( i > 0) {
            int last = sign;
            if ( i == digits.length) {
                sign = sign(digits[i - 1] +1, last);
                digits[i - 1] = sum(digits[i - 1] + 1, last);
            } else {
                sign = sign(digits[i - 1], last);
                digits[i - 1] = sum(digits[i - 1], last);   
            }
            
            
            if (sign == 0)
                break;
            if ( i == 1) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int j = 1; j < result.length; j++) {
                    result[j] = digits[j-1];
                }
                return result;
            }
            i--;
        }
        
        return digits;
    }
    
    public int sum(int num, int sign) {
        return (num + sign) % 10;
    }
        
    public int sign(int num, int sign) {
        return (num + sign) / 10;
    }
    
    public static void main(String[] args) {
    	int[] test = {9};
    	Solution sol = new Solution();
    	System.out.println(sol.sign(9, 0));
    	System.out.println(sol.plusOne(test).length);
    }
}