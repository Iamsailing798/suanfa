package 蓝桥;

import java.util.Scanner;

public class Fenjieshu {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		fen sf=new fen(s,e);
		
		
		for(int i=2;i<=sf.e;i++)
		{
			if(sf.a[i]==0)
			for(int j=2*i;j<=sf.e;j+=i)
			{
					sf.a[j]=1;
			}
		}
		
		for(int i=sf.s;i<=sf.e;i++)//顺序执行
		{
			//boolean f=true;
				if(sf.a[i]==0)
				{
					System.out.println(i+"="+i);
					continue;
				}
				else
				{
					sf.fm(i);
					sf.show(i);
				}
				sf.str="";
		}
		
	
		}
	
}

class fen
{
	int s;
	int e;
	int[] a;
	public fen(int s,int e)
	{
		this.s=s;
		this.e=e;
		for(int i=0;i<=e+1;i++)
		{
			a=new int[i];
		}
	}
	String str="";
	void fm(int i)
	{
		for(int j=2;j<a.length;j++)
		{
			if(a[j]==0)
			{
				double b=i/(j*1.0);//结果是否为整数
				if(b==(int)b)
				{
					int b1=(int)b;
					if(a[b1]==0)//商是否为素数
					{
						str+=b1+","+j;//b1为第二个质因数
						return;
					}
					else//b1不是质因数
					{
						fm(b1);
						str+=","+j;
					}
					break;//没有的话会执行12/3
				}
				
			}
		}
		//System.out.println(str);
	}
	
	void show(int ii)
	{
		String[] strc=str.split(",");
		System.out.print(ii+"="+strc[strc.length-1]);
		for(int i=strc.length-2;i>=0;i--)
		{
			System.out.print("*"+strc[i]);
		}
		System.out.println();
	}
}
