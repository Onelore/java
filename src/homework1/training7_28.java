package homework1;

import java.util.Scanner;

public class training7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int []list=new int[10];
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		for(int j=i+1;j<10;j++)
		{
			System.out.println(list[i]+","+list[j]);
		}
	}
	}
	

}
