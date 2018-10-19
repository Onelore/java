package homework1;

import java.util.Scanner;

public class tarining5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
    	for(int j=(n-i)*3-1;j>=0;j--)
    	{
         	System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++)
    	{   if(j<5)
    		    System.out.print("  ");
    	    else
    	    	System.out.print(" ");
    		System.out.print((int)Math.pow(2, j-1));
    	}
    	for(int j=i-1;j>=1;j--)
    	{
    		if(j<5)
    		    System.out.print("  ");
    	    else
    	    	System.out.print(" ");
    		System.out.print((int)Math.pow(2, j-1));
    	}
    	System.out.println("");
    		 
    }
    
	}

}
