package homework1;

import java.util.Scanner;

public class training8_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int r=in.nextInt();
	int c=in.nextInt();
    double[][]a=new double[r][c];
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<a[i].length;j++)
    		a[i][j]=in.nextDouble();
    }
    int[]list=locate(a);
    System.out.println("the location of max is at ("+list[0]+","+list[1]+")");
	}
	public static int[]locate(double[][]a)
	{
		double max=0;
		
		int[]list=new int[2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				{
				   if(a[i][j]>max)
				   {
					  
					   max=a[i][j];
					    
				   }
				}
		}
		System.out.println("the max is "+max);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==max)
					{
					  list[0]=i;
					  list[1]=j;
					}
				   
				   
					
			}
			
		}
		
		return list;
		
		
		
	}
	

}
