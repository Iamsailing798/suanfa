package pTA起步自测;

import java.util.Scanner;

public class Main2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		cqueue1 nq=new cqueue1(n,m);
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			nq.insert(a);
		}
		nq.show();
	}
	
}
class cqueue1
{
	int n,m,rear=0,head=-1;
	int[] ar;
	public cqueue1(int n,int m)
	{
		this.n=n;
		this.m=m;
		head+=m;
		//System.out.println(n);
		ar=new int[n];
	}
	void insert(int x)
	{
		head=(head+1)%n;
		//System.out.println(head);
		ar[head]=x;
	}
	void show()
	{
		for(int i=0;i<n;i++)
		{
			if(i==0)
			System.out.print(ar[i]);
			else {
				System.out.print(" "+ar[i]);
			}
		}
	}
	
}