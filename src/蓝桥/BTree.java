package 蓝桥;

import java.util.Scanner;

public class BTree {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BTreeClass B=new BTreeClass();
		int n=sc.nextInt();
		int pre[]=new int[n];
		int[] in=new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			in[i]=sc.nextInt();
		}
		B.createBT(pre, 0, in, 0, n);
	}
}

class TNode//节点
{
	int data;
	TNode lchild;
	TNode rchild;
	public TNode()
	{
		lchild=rchild=null;
	}
	public TNode(int data)
	{
		this.data=data;
		lchild=rchild=null;
	}
	
}

class BTreeClass
{
	TNode b;
	public BTreeClass()
	{
		b=null;
	}
	public TNode createBT(int pre[],int i,int in[],int j,int n)
	{
		TNode root=new TNode();
		if(n<=0) return null;
		int p=j;//p在in中游走
		while(p<j+n)
		{
			if(pre[i]==in[p])
			{
				break;
			}
			p++;
		}
		int k=p-j;
		root.lchild=createBT(pre, i+1, in, j, k);
		root.rchild=createBT(pre, i+k+1, in, p+1, n-k-1);
		return root;
	}
	
}