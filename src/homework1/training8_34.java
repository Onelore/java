package homework1;

import java.util.Scanner;

public class training8_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner (System.in);
	double [][]m=new double[6][2];
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<2;j++)
			m[i][j]=in.nextDouble();
	}
	double []p=points(m);
	System.out.println("the rightest lowest points:"+p[0]+","+p[1]);
	}
	public static double[]points(double[][]m)
	{
		double x=m[0][0];
		double y=m[0][1];
		int index=0;
		double []xy= new double[2];
		
		for(int i=1;i<m.length;i++)
		{
			
				if(y>m[i][1])
				{
					y=m[i][1];
					index=i;
				}
				else if(y==m[i][1]&&x>m[i][0])
				{
					x=m[i][0];
					index=i;
				}
				
			
		}
		xy[0]=m[index][0];
		xy[1]=m[index][1];
		return xy;
	}

}

		
