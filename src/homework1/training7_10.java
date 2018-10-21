package homework1;

import java.util.Scanner;

public class training7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner in=new Scanner(System.in);
	double []array=new double[10];
	for(int i=0;i<10;i++)
	{
		array[i]=in.nextDouble();
	}
		System.out.print("the min index is: "+indexOfmin(array));
	}
	public static String indexOfmin(double[]array)
	{
		double min=array[0];
		String indexOfmin=null;
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
				indexOfmin=i+" ";
				
			}
			else if(min==array[i])
			{
				indexOfmin=indexOfmin+i+" ";
			}
		}
		return indexOfmin;
	}

}
