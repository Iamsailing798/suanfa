package 蓝桥;

import java.util.Scanner;

public class T1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=1,f2=1,f3=2;
		if(n==1||n==2)
		{
			f3=1;
		}
		else 
		{
			for(int i=3;i<=n;i++)
			{
				f3=(f1+f2)%10007;
				f1=f2;
				f2=f3;
			}
		}
		System.out.println(f3);
	}
}
