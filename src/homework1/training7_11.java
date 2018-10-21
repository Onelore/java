package homework1;

import java.util.Scanner;

public class training7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double []list=new double[10];
	for(int i=0;i<list.length;i++)
	{
		list[i]=in.nextDouble();
	}
	System.out.println("the mean is: "+mean(list));
	System.out.println("the dev is: "+dev(list));
	}
	public static double dev(double[]x)
	{
		double dev;
		double x1=0;
		for(int i=0;i<x.length;i++)
		{
			x1=x1+Math.pow(x[i]-mean(x),2);
		}
		dev=Math.pow(x1/(x.length-1), 0.5);
		return dev;
	}
	public static double mean(double[]x)
	{
		double sum=0;
		double mean;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		mean=sum/x.length;
		return mean;
	}

}
