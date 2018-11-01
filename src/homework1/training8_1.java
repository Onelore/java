package homework1;

import java.util.Scanner;

public class training8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	double[][]m=new double[3][4];
	
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=in.nextDouble();
	}
	int index=in.nextInt();
	double sum=sumcolumn(m, index);
	System.out.println("sum of the elements at column "+index+" is "+sum);
	
	}
	public static double sumcolumn(double[][]m,int columnindex)
	{
		double sum=0;
		for(int i=0;i<m.length;i++)
		{
			
			
			{
				sum+=m[i][columnindex];
			}
			
		}
		return sum;
	}

}
