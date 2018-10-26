package homework1;

import java.util.Scanner;

public class training7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n1=in.nextInt();
	int[]list1=new int[n1];
	for(int i=0;i<n1;i++)
	{
		list1[i]=in.nextInt();
	}
	int n2=in.nextInt();
	int[]list2=new int[n2];
	for(int i=0;i<n1;i++)
	{
		list2[i]=in.nextInt();
	}
	if(equals(list1,list2))
	{
		System.out.println("两个数组严格相同");
	}
	else
		System.out.println("两个数组不完全相同");
	}
	public static boolean equals(int[]list1,int[]list2)
	{
		if(list1.length!=list2.length)
			return false;
		
			for(int i=0;i<list1.length;i++)
			{
				if(list1[i]!=list2[i])
					return false;;
			}
			return true;
		
	}

}
