package homework1;

import java.util.Arrays;
import java.util.Scanner;



public class training7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]list=new int[10];
	
	Scanner in=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextInt();	
	}

    System.out.print(Arrays.toString(eliminate(list)));
	}
	public static int[] eliminate(int []list)
	{

	
		int count=0;
		
		for(int i=0;i<list.length;i++)
		{
			
			int j;
			for(j=0;j<count;j++)
			{
				if(list[i]==list[j])
					break;
		    }
			if(j==count)
			{
				list[count]=list[i];
				count++;
			}
		
		}
		int[]list1=new int[count];
		
		for(int i=0;i<count;i++)
		{
			list1[i]=list[i];
		}
		return list1;
	}

}
