package uniqueBST;

//from stanford

public class Solution {
	public int numTrees(int numKeys) {

    if(numKeys <= 1)
        return 1;
    // there will be one value at the root, with whatever remains 
   // on the left and right each forming their own subtrees. 
  // Iterate through all the values that could be the root... 
    int sum = 0;
    int left, right, root;

    for(root = 1; root <= numKeys; root++) {
        left = numTrees(root - 1);
        right = numTrees(numKeys - root);

        sum += left * right;
    }

    return sum;
}
}