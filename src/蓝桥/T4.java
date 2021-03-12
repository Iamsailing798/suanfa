package 蓝桥;

import java.util.Scanner;
public class T4 {//矩阵的幂
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt()+1;
		int m=sc.nextInt();
		int[][] matrix=new int[n][n];
		int[][] JT=new int[n][n];
		int[][] ma=new int[n][n];
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
				JT[j][i]=matrix[i][j];
				if(m==0)//矩阵0次方
				{
					if(i==j)
						ma[i][j]=1;
				}
			}
		}
		
		
		int sum=0;
		for(int x=0;x<m-1;x++)
		for(int i=1;i<n;i++)//第i行
		{
			for(int j=1;j<n;j++)//第j列
			{
				for(int k=1;k<n;k++)
				{
					if(x%2==0)//判断是乘几次，以此来存放矩阵
					sum+=matrix[i][k]*JT[j][k];
					else {
						sum+=ma[i][k]*JT[j][k];
					}
				}
				if(x%2==0)
				ma[i][j]=sum;
				else {
					matrix[i][j]=sum;
				}
				sum=0;
			}
			
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(m%2==0)
				{
					if(j==1)
					System.out.print(ma[i][j]);
					else {
						System.out.print(" "+ma[i][j]);
					}
				}
				else {
					if(j==1)
					System.out.print(matrix[i][j]);
					else {
						System.out.print(" "+matrix[i][j]);
					}
				}
				
			}
			System.out.println();
		}
	}
}
