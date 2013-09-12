package addbinary;

public class Solution {
	
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
    	/*char[] a1 = a.toCharArray();
    	char[] a2 = b.toCharArray();
        
    	int l1 = a.length();
    	int l2 = b.length();
    	
    	int duan = l1 < l2 ? l1 : l2;
    	int chang = l1 > l2 ? l1 : l2;
    	char[] res = new char[chang + 1];
    	
    	char sign = '0';
    	int i = 0;
    	
    	while (duan > 0) {
    		char last = sign;
    		sign = sign(a1[l1 - 1],a2[l2 - 1],last);
    		res[chang - i] = sum(a1[l1 - 1],a2[l2 - 1],last);
    		l1--;l2--;duan--;i++;
    		if (duan == 0) {
    			if (sign == '0') {}
    			else {
    				if (l1 == 0 && l2 == 0)
    					res[chang - i] = sign;
    				else {
    					res[chang - i] = sum£»
    				}
    			}
    				
    		}
    	}*/
    	
    	int l1 = a.length();
    	int l2 = b.length();
    	int c = 0;
    	int max = l1 > l2 ? l1 : l2;
    	char[] res = new char[max+1];
    	while (l1 > 0 || l2 > 0 || c > 0) {
    		int val = c;
    		if (l1 > 0) val += a.charAt(l1 - 1) - '0';
    		if (l2 > 0) val += b.charAt(l2 - 1) - '0';
    		
    		c = val/2;
    		res[max] = (char) (val%2 + '0');
    		l1--;l2--;max--;
    	}
    		return (new String(res)).trim();
    }
    
    public static char sign (char n1, char n2) {
    	if ( n1 == '1' && n2 == '1')
    		return '1';
    	return '0';
    }
    
    public static char sign(char n1, char n2, char n3) {
    	if (sign(n1,n2) == '1')
    		return '1';
    	return sign(sum(n1,n2), n3);
    }
    
    public static char sum(char n1, char n2) {
    	if ( n1 != n2) 
    		return '1';
    	return '0';
    }
    
    public static char sum (char n1, char n2, char n3) {
    	return sum(sum(n1, n2), n3);
    }
    
    public static void main(String[] agrs) {
//    	System.out.println(sum('0','0','0'));
//    	System.out.println(sum('0','1','0'));
//    	System.out.println(sum('1','1','0'));
//    	System.out.println(sum('1','1','1'));
//    	
//    	System.out.println(sign('0','0','0'));
//    	System.out.println(sign('0','1','0'));
//    	System.out.println(sign('1','1','0'));
//    	System.out.println(sign('1','1','1'));
    	
    	Solution sol = new Solution();
    	
//    	char[] res = new char[2];
//    	System.out.println(res[1]);
    	
    	System.out.println(sol.addBinary("0", "0"));

    }

}
