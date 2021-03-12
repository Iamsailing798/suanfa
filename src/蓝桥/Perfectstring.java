package 蓝桥;

import java.util.Scanner;

public class Perfectstring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		char chs[] = str.toCharArray();
		int cnt = 0;//计算交换次数
		int flag = 0;//判断出现一次的字符
		for(int i=0;i<n-1;i++) {//i指针从0到倒数第二个字符
			for(int j=n-1;j>=i;j--) {//从后往前开始找与i位置相同的字符
				if(i==j) {//找不到的情况
					if(chs.length%2==0||flag==1) {
						System.out.println("Impossible");
						return ;
					}
					flag++;
					cnt += (chs.length/2) - i;
				}else if(chs[i]==chs[j]) {
					for(int k=j;k<n-1;k++) {//n是会变化的
						swap(chs,k,k+1);
						cnt++;
					}
					n--;
					break;
				}
			}
		}
		System.out.println(cnt);
		for(int i=0;i<9;i++) { System.out.print(chs[i]); }
	}
	private static void swap(char chs[],int k,int j) {
		char temp = chs[k];
		chs[k] = chs[j];
		chs[j] = temp;
	}
}
