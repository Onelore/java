package homework1;

import java.util.Scanner;

public class training8_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double [][]m=new double[3][3];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=in.nextDouble();
	}
	if(ismarkov(m))
		System.out.println("it is a markov matrix");
	else
		System.out.println("it is not a markov matrix");
		
				
	}
	public static boolean ismarkov(double[][]m)
	{
		int []columnsum=new int[m.length];
		for(int i=0;i<m.length;i++)
		{
			int sum=0;
			for(int j=0;j<m.length;j++)
			{
				if(m[j][i]>0)
					sum+=m[j][i];
				else
					return false;
			}
			columnsum[i]=sum;
		}
		int count=0;
		for(int i=0;i<m.length;i++)
		{
			if(columnsum[i]==0)
				count++;
				
		}
		if(count==m.length)
			return true;
		else
			return false;
	
		
	}

}
