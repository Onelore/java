package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class training7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]list=new int[10];
	int[]list1=new int[10];
	Scanner in=new Scanner(System.in);
	for(int i=0;i<list.length;i++)
	{
		list[i]=in.nextInt();
		list1[list1.length-i-1]=list[i];
		
	}

	System.out.println(Arrays.toString(list1));
}


}


