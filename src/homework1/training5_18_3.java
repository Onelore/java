package homework1;

import java.util.Scanner;

public class training5_18_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=5;i>=1;i--) 
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j+" ");
    	}
    	System.out.println("");
    }
	}

}
