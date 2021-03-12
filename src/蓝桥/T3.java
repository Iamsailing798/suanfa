package 蓝桥;

import java.util.Scanner;


public class T3 {
	
	static int n,count=0;             //n表示棋盘的大小，count则为上文提到的计数变量记录放置方法的个数
	static int[][] map;               //二位数组表示棋盘
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();             //相关变量的录入
		map=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {          //棋盘具体值的录入
				map[i][j]=sc.nextInt();
			}
		}
		Put(0,2);                            //从第1行开始进行白皇后的放置，2代表白，3代表黑
		System.out.println(count);

	}

	private static void Put(int t, int s) {    //放置皇后的函数
		// TODO Auto-generated method stub
		if(t==n) {                             //进行当前类型皇后的防止数量是否达到要求，即是否到达了棋盘的最后一行
			if(s==2)Put(0,3);                  //如果白黄后放置成功，则进行黑皇后的放置
			else count++;                      //设置方法找到了一种，计数变量进行值加1
			return;                            //当前整体放置过程结束，进行程序的回溯
		}
		for(int i=0;i<n;i++) {                 //对每一行的值逐个进行操作
			if(map[t][i]!=1)continue;          //当前位置是否为1的判断
			if(Check(t,i,s)) {
				map[t][i]=s;                    //是否满足题目要求判断，满足赋值
			}else continue;                     //不满足，同一行的下一个位置
			Put(t+1,s);                         //下一行皇后的放置
			map[t][i]=1;                        //回溯发法的关键
		}
		return;
		
	}

	private static boolean Check(int t, int i, int s) { //满足题目要求的判断函数
		// TODO Auto-generated method stub
		for(int q=t-1;q>=0;q--) {
			if(map[q][i]==s)return false;
		}
		for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--) {
			if(map[q][w]==s)return false;
		}
		for(int q=t-1,w=i+1;q>=0&&w<=(n-1);q--,w++) {
			if(map[q][w]==s)return false;
		}
		return true;
	}

}

