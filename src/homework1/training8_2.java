package homework1;

import java.util.Scanner;

public class training8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double[][]m=new double[4][4];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=in.nextDouble();
	}
	double sum=sum(m);
	System.out.println("sum of elements in the major diagonal is "+sum);
	
	}
	public static double sum(double[][]m)
	{
		double sum=0;
		for(int i=0;i<m.length;i++)
		{
			sum+=m[i][i];
		}
		return sum;
	}

}
