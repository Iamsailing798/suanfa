package 复习1;

import java.util.Scanner;

public class Qs {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		qus q = new qus();
		int e[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			e[i]=sc.nextInt();
		}
			
		q.create(e,n);
		q.qs(1, n);
		q.show();
	}
}

class qus
{
	int a[];
	
	
	void create(int e[],int n)
	{
		System.out.println(n);
		a=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=e[i];
		}
	}
	
	void qs(int left,int right)
	{
		if(left>right)return;
		int temp=a[left];
		int i=left;
		int j=right;
		
		while(i!=j)
		{
			while(a[j]>=temp&&i<j)
			{
				j--;
			}
			while(a[i]<=temp&&i<j)
			{
				i++;
			}
			if(i<j)
			{
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
			}
		}
		a[left]=a[i];
		a[i]=temp;
		System.out.println(i);
		qs(left, i-1);
		qs(i+1, right);
	}
	
	void show()
	{
		for(int i=1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}