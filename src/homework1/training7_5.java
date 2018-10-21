package homework1;

import java.util.Scanner;

public class training7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]list=new int[10];
	int count=0;
	Scanner in=new Scanner(System.in);
	for(int i=0;i<list.length;i++)
	{
		int num=in.nextInt();
		int j;
		for(j=0;j<count;j++)
		{
			if(num==list[j])
				break;
	    }
		if(j==count)
		{
			list[count]=num;
			count++;
		}
	
	}
	System.out.print("The distinct numbers are: ");
	for(int i=0;i<count;i++){
		System.out.print(list[i]+" ");
	}

	
	}

}
