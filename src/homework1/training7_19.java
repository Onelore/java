package homework1;

import java.util.Scanner;

public class training7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[]list=new int[n];
	for(int i=0;i<n;i++)
	{
		list[i]=in.nextInt();
	}
	if(isSorted(list)==true)
	{
		System.out.println("The list is already sorted");
	}
	else
		System.out.println("The list is not sorted");
	}
	public static boolean isSorted(int[]list)
	{
		for(int i = 1; i < list.length; ++i)
		{
			if(list[i] < list[i-1]){
				
				return false;
			}
		}

		return true;
	}

}
