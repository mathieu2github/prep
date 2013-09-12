package reverseInteger;

public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int result = 0;
        boolean neg =  x < 0 ? true : false;
        if (neg)
            x = 0-x;
        while ( x > 0) {
            int n = x % 10;
            result = n + result * 10;
            x /= 10;
        }
        
        if (neg)
            result = 0- result;
        
        return result;
    }
}