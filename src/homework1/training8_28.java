package homework1;

import java.util.Scanner;

public class training8_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
	int[][]m1=new int[3][3];
	for(int i=0;i<m1.length;i++)
	{
		for(int j=0;j<m1[i].length;j++)
			m1[i][j]=in.nextInt();
	}
	int[][]m2=new int[3][3];
	for(int i=0;i<m2.length;i++)
	{
		for(int j=0;j<m2[i].length;j++)
			m2[i][j]=in.nextInt();
	}
	if(equal(m1,m2))
		System.out.print("the two arrays are strictly identical");
	else
		System.out.print("the two arrays are not strictly identical");
		
		
	}
	public static boolean equal(int[][]m1,int [][]m2)
	{
		int count=0;
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1.length;j++)
			{
				if(m1[i][j]==m2[i][j])
					count++;
			}
		}
		if(count==(m1.length*m1.length))
			return true;
		else
			return false;
	}

}
