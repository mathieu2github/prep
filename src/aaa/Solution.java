package aaa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public void sort(int[] stat) {
		Arrays.sort(stat);
	}
	
	private HashMap<Integer, String> pool;
	
	public Integer[] removeDuplicate(int[] stat) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0 ; i < stat.length; i++) {
			set.add(stat[i]);
		}
		Integer[] a = new Integer[set.size()];
		a = set.toArray(a);
		Arrays.sort(a);
		return a;
	}
	
	public static void main(String[] args) {
		int[] stat = {7,48,66,61,67,24,20,33,74,78,112,113,77,55,88,19,26,17,51,
				/*Aug 27 started*/129,120,52,50,46,
				/*Aug28*/90,83,
				/*Sep 1st */118,119,121,122,
				/*Sep 2nd */28,22,
				/*Sep 5th */111,110,102,103,107,64,98,
				/*Sep 10th */108,109,101};
		
		Solution sol = new Solution();
		
		sol.sort(stat);
		
		
//		for (int i = 0; i < stat.length; i++) {
//			System.out.println("题号是 " + stat[i] + " .");
//		}
//		System.out.println("1 ,一共刷了 " + stat.length + " 道题目");
		
		Integer[] sta = sol.removeDuplicate(stat);
		for (Integer i : sta) {
			System.out.println("题号是 " + i + " .");
		}
		System.out.println("2 ,一共刷了 " + sta.length + " 道题目");
	}
}
