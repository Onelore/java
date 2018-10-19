package homework1;

import java.util.Scanner;

public class training6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	printnum(n);
	}
	public static void printnum(int n)
	{
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++) 
		    {
		    	int m=(int)(Math.random()*2);
		    	System.out.print(m+" ");
		    }

		    System.out.println("");
		}
	}

}
