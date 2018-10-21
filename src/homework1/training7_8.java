package homework1;

import java.util.Scanner;

public class training7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	
	double[]arrary=new double[10];
	int[]list=new int[10];
	for(int i=0;i<10;i++)
	{
		arrary[i]=in.nextDouble();

	}
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextInt();
	}
	System.out.println(ave(arrary));
	System.out.println(ave(list));
	
	
	}
	public static int ave(int[]arrary)
	{
		int sum=0;
		int ave;
		for(int i=0;i<arrary.length;i++)
		  {
			  sum=sum+arrary[i];
		  }
		  ave=sum/(arrary.length);
		  return ave;
	}
	public static double ave(double[]arrary)
	{
	  double sum=0;
	  double ave;
	  for(int i=0;i<arrary.length;i++)
	  {
		  sum=sum+arrary[i];
	  }
	  ave=sum/(arrary.length);
	  return ave;
	}

}
