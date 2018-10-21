package homework1;

import java.util.Scanner;

public class training6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	password(str);
	}

	public static void password(String str)
	{
		int n=str.length();
		int count1=0,count2=0;
		if(n>=8)
		{
			for(int i=0;i<=n-1;i++)
		{
			char a=str.charAt(i);
			int b=(int)a;
			if((b>=48&&b<=57)||(b>=65&&b<=90)||(b>=97&&b<=122))
			{
				if(b>=48&&b<=57)
				    count1++;
				else
					count2++;
			}
		}
		if(count1>=2&&count2>=8-count1)
			System.out.println("valid password!");
		else
			System.out.println("invalid password!");	
		}
		else
			System.out.println("invalid password!");
		
	}
}
