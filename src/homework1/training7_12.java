package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class training7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double []list=new double[10];
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextDouble();
	}
	double []rev=rev(list);
	
		System.out.print(Arrays.toString(rev));
	
	
	
	
	}
	public static double[] rev(double[]array)
	{
		double []rev=new double[array.length];
	
		for(int i=0,j=array.length-1;i<array.length;i++,j--)
		{
			rev[j]=array[i];
		
		}
		return rev;
		
	}

}
