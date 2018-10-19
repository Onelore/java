package homework1;

import java.util.Scanner;

public class training6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	System.out.println("字母个数有："+sum(str));
	
	}
	public static int sum(String str)
	{
		char a;
		int count=0,b;
		int n=str.length();
		for(int i=0;i<=n-1;i++)
		{
			b=(int)str.charAt(i);
			if((b>=65&&b<=90)||(b>=97&&b<=122))
			
				count++;
			
		}
		return count;
	}

}
