package homework1;

import java.util.Scanner;

public class training5_18_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     for(int i=n;i>=1;i--) 
     {  for(int j=(n-i)*3-1;j>=0;j--) {
     	System.out.print(" ");
     }
    	 
     	for(int j=1;j<=i;j++)
     	{
     		if(j<10)
     		System.out.print("  ");
     		else
     		System.out.print(" ");
     	System.out.print(j);
     	}
     	System.out.println("");
     }

	}

}
