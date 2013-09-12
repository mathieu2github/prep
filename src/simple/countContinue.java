package simple;

public class countContinue {
	
	
	public int giveMulti(int[] a) {
		int len = a.length;
		
		int pre = a[0];
		int times = 1;
		int max = 1;
		
		for (int i = 1; i < len; i++) {
			if (pre - a[i] == 0) {
				times++;
				max = max > times? max : times;
			} else {
				times = 1;
				pre = a[i];
			}	
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] a = {3, 4, 4, 4, 2, 2, 3, 4 };
		
		countContinue sol = new countContinue();
		
		System.out.println(sol.giveMulti(a));
	}

}
