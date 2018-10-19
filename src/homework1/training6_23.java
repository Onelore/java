package homework1;

import java.util.Scanner;

public class training6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	String str=in.next();
	String str1=in.next();
	char a=str1.charAt(0);
	System.out.println(count(str,a));
	}
	public static int count(String str,char a)
	{
		int n=str.length();
		int count=0;
		for(int i=0;i<=n-1;i++)
		{
			if(str.charAt(i)==a)
				count++;
		}
		return count;
	}

}
