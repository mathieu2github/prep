package rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int times = matrix.length / 2;
        
        for (int i = 0; i < times ; i++) {
            rotate(matrix, i);
        }
        
    }
    
    public void rotate(int[][] matrix, int times) {
        int len = matrix.length - 1;

        
        for (int i = 0; i < len - 2 * times; i++) {
            int temp = matrix[len - times - i][times];
            matrix[len - times - i][times] = matrix[len - times][len - times - i];
            matrix[len - times][len - times - i] = matrix[times + i][len - times];
            matrix[times + i][len - times] = matrix[times][times + i];
            matrix[times][times + i] = temp;
        }
            
    }
}