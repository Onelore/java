package homework1;

import java.util.Scanner;

public class training8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double[][]a=new double [3][3];
	double[][]b=new double [3][3];
	double[][]mix=new double [3][3];
	System.out.println("enter list1");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			a[i][j]=in.nextDouble();
	}
	System.out.println("enter list2");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			b[i][j]=in.nextDouble();
	}
	mix=mix(a, b);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.printf("%.2f",mix[i][j]);
			System.out.print("  ");
		}
			
		    
		System.out.println("");
	}
	
	}
	
	public static double [][]mix(double[][]a,double[][]b)
	{
		double [][]mix=new double[a.length][a.length];
		for(int i=0;i<mix.length;i++)
		{
			for(int j=0;j<mix.length;j++)
			{
				mix[i][j]=a[i][1-1]*b[1-1][j]+a[i][2-1]*b[2-1][j]+a[i][3-1]*b[3-1][j];
			}
		}
		return mix;
	}

}
