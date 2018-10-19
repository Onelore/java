package homework1;

import java.util.Scanner;

public class training6_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int width=in.nextInt();
	System.out.println(format(num,width));
	
	}
	public static String format(int num,int width)
	{
		int count=0;
		int n=num;
		String str="";
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		if(count<width)
		{
			for(int i=1;i<=width-count;i++)
			{
				str=str+0+"";
			}
			return str+n;
		}
		else
			return n+"";
		
	}

}
