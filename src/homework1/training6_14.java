package homework1;

import java.util.Scanner;

public class training6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i=1;i<=901;i=i+100)
	{
		System.out.print(i+"\t");
		 
		System.out.printf("%.4f\n",sum(i));
	}
	}

	public static double sum(int i)
	{
		double m=0,s=0;
		for(int j=1;j<=i;j++)
		{
			m=Math.pow(-1, j+1)/(2*j-1);
			s=(s+m);
		}
		s=s*4;
		return s;
	}
}
