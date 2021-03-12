package 复习1;

import java.util.Scanner;

public class DFS 
{
	static int n;
	static int a[],book[];
	static int count=0;
	
	static void dfs(int step)
	{
		if(step==4)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.print(a[i]);
			}
			count++;
			if(count%6==0)
			{
				System.out.println();
			}
			else 
			{
				System.out.print(" ");
			}
			return;
		}
		
		for(int i=n;i<=n+3;i++)
		{
			if(book[i]==0)
			{
				a[step]=i;
				book[i]=1;
				dfs(step+1);
				book[i]=0;
			}
			
		}
		return;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[5];
		book=new int[10];
		
		dfs(1);
	}
}
