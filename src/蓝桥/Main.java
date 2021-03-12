package 蓝桥;

import java.util.Scanner;

public class Main 
{
	int[][] map;
	int n,count=0;
	public Main(int n)
	{
		this.n=n;
		map=new int[n][n];
	}
	
	boolean check(int x,int y)
	{
		for(int i=0;i<x;i++)
		{
			if(map[i][y]==2)
			{
				return false;
			}
		}
		for(int i=x-1,j=y-1;i>=0&&j>=0;i--,j--)//map[x][y]左上方
		{
			if(map[i][j]==2)
			{
				return false;
			}
		}
		for(int i=x-1,j=y+1;i>=0&&j<n;i--,j++)//map[x][y]右上方
		{
			if(map[i][j]==2)
			{
				return false;
			}
		}
		
		return true;
	}
	
	void Put(int h)
	{
		if(h==n)
		{
			count++;
			return;
		}
		
		for(int j=0;j<n;j++)
		{
		
			if(map[h][j]!=0)
			if(check(h, j))
			{
				map[h][j]=2;//2代表皇后
				Put(h+1);
				map[h][j]=1;
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Main MQ=new Main(n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				MQ.map[i][j]=sc.nextInt();
			}
		}
		MQ.Put(0);
		int t=MQ.count;
		System.out.println(t);
		
	}
}
