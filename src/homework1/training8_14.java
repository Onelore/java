package homework1;

import java.util.Scanner;

public class training8_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int [][]matrix=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			matrix[i][j]=random();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(matrix[i][j]);
		}
		System.out.println("");
	}
	
	int count1=0,count0=0;
	for(int i=0;i<n;i++)
	{
		
	   if(matrix[i][i]==1)
		   count1++;
	   else if(matrix[i][i]==0)
		   count0++;
		   
		
	}
	if(count1==n||count0==n)
	{
		if(count1==n)
		    System.out.println("all 1s on the major diagonal");
		else 
			System.out.println("all 0s on the major diagonal");
	}
		
	else
		System.out.println("no same numbers on the major diagonal");
	
	
	
	
	}
	
	public static int random()
	{
		int random=(int)(Math.random()*2);
		return random;
	}
	

}
