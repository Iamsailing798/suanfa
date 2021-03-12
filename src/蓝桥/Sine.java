package 蓝桥;

import java.util.Scanner;
public class Sine {
	static int n;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n=sc.nextInt();
         int q=n;
        System.out.println(getSn(n,q));
       
    }
    
    static String getSn(int count,int end)
    {
    	if(1==count)
    	{
    		return getAn(1,end)+"+"+n;
    	}
    	return "("+getSn(count-1,end-1)+")"+getAn(1,end)+"+"+--n;
    }
    
    static String getAn(int count,int end)
    {
    	if(end==count)
    	{
    		return "sin("+count+")";
    	}
    	
    	String op="-";
    	if(count%2==0)
    	{
    		op="+";
    	}
    	
    	return "sin("+count+op+getAn(count+1,end)+")";
    }
}
