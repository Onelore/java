package homework1;

import java.util.Scanner;

public class training8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int[][]m=new int[8][7];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=in.nextInt();	
	}
	int[][]sum=sumlist(m);
	
//	for(int i=0;i<8;i++)
//	{
//		System.out.println(sum[i][0]+" "+sum[i][1]);
//	}
	int[][]sort=sort(sum);
	for(int i=0;i<8;i++)
	{
		for(int j=0;j<8;j++)
		{
			if(sort[i][1]==sum[j][1])
				System.out.println(j+" "+sort[i][1]);
		}
			
				
	 }
		
		
	}
	
	public static int [][]sumlist(int[][]m)
	{
		int[][]sumlist=new int[m.length][2];
		for(int i=0;i<m.length;i++)
		{
			int sum=0;
			for(int j=0;j<m[i].length;j++)
			{
			    sum+=m[i][j];	  
			}
			    sumlist[i][0]=i;
				sumlist[i][1]=sum;
			
			
			    
		}
		return sumlist;
	}
	public static int[][]sort(int[][]list)
	{
		for(int i=0;i<list.length-1;i++)
		{
			int currentmax=list[i][1];
			int currentmaxindex=list[i][0];
			for(int j=i+1;j<list.length;j++)
			{
				if(currentmax<list[j][1])
				{
					currentmax=list[j][1];
					currentmaxindex=list[j][0];
				}
			}
			if(currentmaxindex!=list[i][0])
			{
				list[currentmaxindex][1]=list[i][1];
				list[i][1]=currentmax;
			}
			
		}
		return list;
	}

}
