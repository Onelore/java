package homework1;

import java.util.Scanner;

public class training8_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double [][]a=new double [2][2];
	double[]b=new double[2];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
			a[i][j]=in.nextDouble();
	}

	for(int i=0;i<2;i++)
		b[i]=in.nextDouble();
	double []linear=linear(a, b);
	if(linear==null)
		System.out.println("方程无解");
	else
	{
	for(int i=0;i<2;i++)
	{
		System.out.print(linear[i]+" ");
	}
	}
	}
		
	public static double[]linear(double[][]a,double[]b)
	{
		double []s=new double[2];
		if(a[0][0]*a[1][1]-a[0][1]*a[1][0]==0)
		
		 
	     return null;
		
		else
		{
			s[0]=(a[1][1]*b[0]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
			s[1]=(b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
		
			return s;
		}
		
		
	}

}
