package 蓝桥;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();

		String a[] = x.split("");
		String b[] = y.split("");
		int[] a1 = new int[101], b1 = new int[101];
		int[] c = new int[102];
		for (int i = a.length - 1, j = 0; i >= 0 && j < a.length; i--, j++) {
			a1[i] = Integer.parseInt(a[j]);
		}

		
		/*
		 * for(int i=0;i<a.length;i++) { System.out.print(a1[i]); }
		 * System.out.println();
		 */

		for (int i = b.length - 1, j = 0; i >= 0 && j < b.length; i--, j++) {
			b1[i] = Integer.parseInt(b[j]);
		}
		
		/*
		 * for(int i=0;i<b.length;i++) { System.out.print(b1[i]); }
		 * System.out.println();
		 */
		int max;
		if (a.length > b.length) {
			max = a.length;
		} else {
			max = b.length;
		}
		int j = 0;
		for (int i = 0; i <= max; i++) {
			int t = a1[i] + b1[i] + j;
			c[i] = t % 10;
			j = t / 10;
		}
		if(c[max]==0)max--;
		for (int i = max; i >= 0; i--) {
			System.out.print(c[i]);
		}

	}
}
