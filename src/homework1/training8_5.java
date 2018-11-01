package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class training8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double [][]a=new double[3][3];
	double [][]b=new double[3][3];
	double [][]sum=new double[3][3];
	System.out.println("enter a list1:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			a[i][j]=in.nextDouble();
	}
	System.out.println("enter a list2:");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			b[i][j]=in.nextDouble();
	}
	sum=sum(a, b);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			System.out.print(sum[i][j]+" ");
		System.out.println("");
	}

		
	}
	public static double[][]sum(double[][]a,double[][]b)
	{
		double [][]sum=new double[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}

}
