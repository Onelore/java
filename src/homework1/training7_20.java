package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class training7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int []list=new int[10];
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextInt();
	}
	System.out.print(Arrays.toString(sort(list)));
	}
	public static int[]sort(int []list)
	{
		int temp;
		for(int i=list.length-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(list[i]<list[j])
				{
					temp=list[j];
					list[j]=list[i];
					list[i]=temp;
				}
			}
				
		}
		return list;
	}

}
