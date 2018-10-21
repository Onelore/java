package homework1;

import java.util.Scanner;

public class training7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double []array=new double[10];
	for(int i=0;i<10;i++)
	{
		array[i]=in.nextDouble();
	}
	System.out.print(min(array));
	
	
	}
	public static double min(double[]array)
	{
		double min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
				min=array[i];
		}
		return min;
	}

}
