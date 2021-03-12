package pTA起步自测;
import java.util.Scanner;;

public class Main1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=0,count=0;
		int c=0;
		cqueue cq=new cqueue();
		for(int k=2;k<=n;k++)
		{
			p=0;
			//System.out.println(1);
			for(int i=2;i<=Math.sqrt(k);i++)
			{
				if(k%i==0)
				{
					p=1;
					break;
				}
			}
			if(p==0)//是素数
			{
				//System.out.println("素数:"+k);
				cq.insert(k);
				if(cq.isFUll())
				{
					//System.out.println(2);
					if(cq.istwo())
					{
						//System.out.println(3);
						count++;
					}
					cq.del();
				}
				
			}
		}
		System.out.print(count);
	}
	
}
class cqueue
{
	int[] ar=new int[3];
	int head=0,rear=-1;
	int prear;
	int maxsize=2;
	void insert(int x)
	{
		rear=(rear+1)%maxsize;
		ar[rear]=x;
		prear=rear;
		
	}
	void del()
	{
		head=(head+1)%maxsize;

	}
	boolean isFUll()
	{
		//System.out.println("队尾"+rear);
		int r=(prear+1)%maxsize;
		//System.out.println("队头"+head);
		if(head==r)
		{
			//System.out.println(r+" "+head+"嘻嘻");
			return true;
		}
			
		else {
			return false;
		}
	}
	
	boolean istwo()
	{
		//System.out.println(ar[head]+" "+ar[rear]);
		if((ar[rear]-ar[head])==2) 
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
