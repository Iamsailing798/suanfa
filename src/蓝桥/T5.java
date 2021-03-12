package 蓝桥;

import java.util.ArrayList;
import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[][] matrix=new int[x][y];
		int[] a=new int[x*y+1];
		int k=0;
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		int j=0;
		int i=0;
		int h=0;
		int l=1;
		int count=0;
		int kong=0;
		int f=y-1;
		while(true)
		{
		for(i=h;i<x-h;i++)
		{
			if(kong==0)
			{
				System.out.print(matrix[i][j]);
				kong=1;
			}
			else {
				System.out.print(" "+matrix[i][j]);
			}
			count++;
		}
		if(count==x*y)break;
		i--;
		for(j=l;j<y-(l-1);j++)
		{
			System.out.print(" "+matrix[i][j]);
			count++;
		}
		if(count==x*y)break;
		j--;
		for(i=i-1;i>=h;i--)
		{
			System.out.print(" "+matrix[i][j]);
			count++;
		}
		if(count==x*y)break;
		i++;
		for(j=f-1;j>h;j--)
		{
			System.out.print(" "+matrix[i][j]);
			count++;
		}
		if(count==x*y)break;
		j++;
		h++;
		l++;
		f--;
		}
	}
}
