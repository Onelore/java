package homework1;

import java.util.Scanner;

public class training8_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int[][]matrix=new int[6][6];
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<6;j++)
			matrix[i][j]=in.nextInt();
	}
	int column=findcolumn(matrix);
	int row=findrow(matrix);
	System.out.println("the flipped cell is at"+"("+row+","+column+")");
	
	}
	public static int findrow(int [][]m)
	{
		int []rowsum=new int[m.length];
		for(int i=0;i<m.length;i++)
		{
			int sum=0;
			for(int j=0;j<m[i].length;j++)
			{
				sum+=m[i][j];
			}
			rowsum[i]=sum;
			
		}
		int row=-1;
		for(int i=0;i<m.length;i++)
		{
		  if(rowsum[i]%2!=0)
			  row=i;
		}
		return row;
	}
	public static int findcolumn(int[][]m)
	{
		int []columnsum=new int[m.length];
		for(int i=0;i<m.length;i++)
		{
			int sum=0;
			for(int j=0;j<m.length;j++)
			{
				sum+=m[j][i];
			}
			columnsum[i]=sum;
			
		}
		int column=-1;
		for(int i=0;i<m.length;i++)
		{
		  if(columnsum[i]%2!=0)
			  column=i;
		}
		return column;
	}

}
