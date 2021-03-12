package pTA起步自测;

import java.util.Scanner;

public class Doublenum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] a=new int[22];
		int[] b=new int[10];//统计数字数组
		for(int i=0;i<str.length();i++)
		{
			a[i]=Integer.parseInt(str.split("")[i]);
			b[a[i]]++;//数字统计
		}
		//1.统计每个数字的出现次数 2.输出任意位数的数字 3.处理进位
		int i=str.length()-1;
		int p=0;//进位
		int f=0;
		while(i>=0)
		{
			int s=a[i]*2+p;
			a[i]=s%10;
			if(b[a[i]]==0)//出现未曾出现过的数字
			{
				f=1;
			}
			p=s/10;
			i--;
		}
		//有进位又有f==1，只输出一个No
		if(p!=0)//最后有进位
		{
			System.out.println("No");
			System.out.print(p);
		}
		else if(f==1){
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		for(int j=0;j<str.length();j++)
		{
			System.out.print(a[j]);
		}
	}
}
