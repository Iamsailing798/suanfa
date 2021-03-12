package pTA起步自测;

import java.util.Scanner;

public class Arsavebignum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[3001];
		int n=sc.nextInt();
		int w=1,p=0;
		ar[0]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<w;j++)
			{
				int t=ar[j]*i+p;
				ar[j]=t%10;//取个位
				p=t/10;
			}
			
			while(p!=0)
			{
				ar[w]=p%10;
				p/=10;
				w++;
			}
		}
		for(int i=w-1;i>=0;i--)
		{
			System.out.print(ar[i]);
		}
	}
}
