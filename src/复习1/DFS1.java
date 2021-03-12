package 复习1;

import java.util.Scanner;

public class DFS1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] ar1=new int[51][51];
		df df=new df();
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		df.createlost(ar1,n,m);
		int sx=sc.nextInt();
		int sy=sc.nextInt();
		System.out.println(sx+" "+sy);
		df.start(sx, sy);
		df.endp(sc.nextInt(), sc.nextInt());
		df.dfs(sx,sy, 0);
		System.out.println(df.s);
	}
}

class df
{
	int[][] book=new int[51][51];
	int[][] next=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	int[][] ar=new int[51][51];
	int p,q,n,m,s=9999;
	
	void createlost(int[][] ar1,int n,int m)
	{
		this.n=n;
		this.m=m;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				ar[i][j]=ar1[i][j];
			}
		
	}
	
	void start(int sx,int sy)
	{
		book[sx][sy]=1;
	}
	
	void endp(int p,int q)
	{
		this.p=p;
		this.q=q;
	}
	
	void dfs(int x,int y,int step)
	{
		int tx,ty;
		//System.out.print(p+" "+q);
		if(x==p&&y==q)
		{
			//System.out.println(1);
			if(step<s)
				s=step;
			return;
		}
		
		for(int i=0;i<=3;i++)
		{
			//System.out.println(1);
			tx=x+next[i][0];
			ty=y+next[i][1];
			
			if(tx<0||tx>n||ty<0||ty>m)
			{
				
				continue;
			}
			
			if(book[tx][ty]==0 && ar[tx][ty]==0)
			{
				
				book[tx][ty]=1;
				dfs(tx, ty, step+1);
				book[tx][ty]=0;
			}
		}
		return;
	}
}
