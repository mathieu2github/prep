package removedupfromsortedarray;

public class Solution {
	
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int n = A.length;
        int i=0;
        int j;
        if (n<=1) return n;

        for (j=1;j<n;j++)
        {            
            if (A[j] != A[i])
            {                
                A[++i]=A[j];
            }
        }
        return i+1;
    }
}
