package 复习1;

import java.util.Scanner;

public class BFS 
{
	public static void main(String[] args)
	{
	int[][] a=new int[51][51];
	int[][] book=new int[51][51];
	int[][] next=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	queue[] qa=new queue[2501];
	
	int n,m,head,tail,tx,ty,sx,sy,p,q;
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	for(int i=0;i<n;i++)
		for(int j=0;j<m;j++)
		{
			a[i][j]=sc.nextInt();
		}
	sx=sc.nextInt();
	sy=sc.nextInt();
	p=sc.nextInt();
	q=sc.nextInt();
	
	head=0;
	tail=0;
	
	qa[tail]=new queue();
	qa[tail].x=sx;
	qa[tail].y=sy;
	qa[tail].s=0;
	qa[tail].f=0;
	tail++;
	book[sx][sy]=1;
	int flag=0;
	
	while(head<tail)
	{
		
		for(int i=0;i<=3;i++)
		{
			tx=qa[head].x+next[i][0];
			ty=qa[head].y+next[i][1];
			
			if(tx<0||tx>=n||ty<0||ty>=m)continue;
			
			if(book[tx][ty]==0&&a[tx][ty]==0)
			{
				qa[tail]=new queue();
				book[tx][ty]=1;
				qa[tail].x=tx;
				qa[tail].y=ty;
				qa[tail].s=qa[head].s+1;
				qa[tail].f=head;
				tail++;
			}
			if(tx==p&&ty==q)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			break;
		head++;
	}
	
	System.out.println(qa[tail-1].s);
	
	}
}

class queue
{
	int x;
	int y;
	int f;
	int s;
}

class bf
{
	int[][] a=new int[51][51];
	int[][] book=new int[51][51];
	int[][] next=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	
	int n,m;
	void create(int[][] ar,int n,int m)
	{
		this.n=n;
		this.m=m;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				a[i][j]=ar[i][j];
			}
	}
	
	void bfs(int x,int y)
	{
		
	}
}

