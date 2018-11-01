package homework1;

import java.util.Scanner;

public class training8_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	double [][]m=new double[3][3];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=in.nextDouble();
	}
	double [][]m2=sortcolumn(m);
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			System.out.print(m2[i][j]+" ");
		System.out.println("");
	}
	}
	public static double[][]sortcolumn(double[][]m)
	{
		for(int i=0;i<m.length;i++)
		{
			
			for(int j=0;j<m[i].length-1;j++)
			{
				double currentmin=m[j][i];
				int index=j;
				for(int k=j+1;k<m.length;k++)
				{
					if(currentmin>m[k][i])
					{
						currentmin=m[k][i];
						index=k;
					}
				}
				if(currentmin!=j)
				{
					m[index][i]=m[j][i];
					m[j][i]=currentmin;
				}
			}
		}
		return m;
	}

}
