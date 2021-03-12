package 蓝桥;

import java.util.Scanner;

public class ReNQ {
	int count=0;
	int[] arr;
	int n;
	int[][] book;
	
	public ReNQ(int n)
	{
		this.n=n;
		arr=new int[n];
		this.book=new int[n][n];
	}
	
	boolean check(int row,int col)
	{
		for(int i=1;i<row;i++)//第i行，列col不变,循环是为了判断斜线
		{
			if(col==arr[i]||Math.abs(row-i)==Math.abs(col - arr[i]))
				return false;
		}
		return true;
	}
	
	void FindQ(int k)
	{
		if(k==n)
		{
			count++;
			for(int i=1;i<n;i++)
			{
				//System.out.print(arr[i]+" ");
			}
			return;
		}
		
		for(int i=1;i<n;i++)//第i列，行是k
		{
			if(book[k][i]==1)
			if(check(k, i))
			{
				arr[k]=i;
				//System.out.print(arr[i]+" ");
				FindQ(k+1);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()+1;
		ReNQ NQ=new ReNQ(n);
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				NQ.book[i][j]=sc.nextInt();
			}
		}
		
		NQ.FindQ(1);
		int t=NQ.count;
		//System.out.println();
		//System.out.println(t);
		System.out.print(t*(t-1));
	}
}
