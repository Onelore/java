package homework1;

import java.util.Scanner;

public class training6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    String n=in.nextLine();
    System.out.print(sum(n));
	}

	public static int sum(String n)
	{
		int i=n.length();
		int s=0;
		char m;
		for(int j=i-1;j>=0;j--)
		{
		    m=n.charAt(j);
		    s=s+Integer.parseInt(String.valueOf(m));
		}
		
		return s;
	}
}
