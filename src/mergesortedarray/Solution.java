package mergesortedarray;

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if (n == 0) {
            return;
        }
        if (m==0) {
            for (int i = 0; i < n; i++) 
                A[i] = B[i];
            return;
        }
        int index = m + n - 1;
        m--;n--;

        while (index > -1) {
            if (A[m] > B[n]) {
                A[index] = A[m];
                m--;
                index--;
                if (m < 0) {
                   
                    for (int i = n ; i > -1; i--, index--) {
                        A[index] = B[i];
                    }
                    break;
                }
            } else {
                A[index] = B[n] ;
                n--;
                index--;
                if (n < 0)
                    break;
            }
        }
        
    }
}