package homework1;

import java.util.Scanner;

public class training7_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	
	int n=in.nextInt();
	int[]list=new int[n];
	for(int i=0;i<n;i++)
	{
		list[i]=in.nextInt();
	}
	if(isConsectivefour(list))
		System.out.println("The list has consecutive fours");
	else
		System.out.println("The list has no consecutive fours");
	}
	public static boolean isConsectivefour(int[]list)
	{
		for (int i = 0; i < list.length - 3; i++) 
		{
		      boolean isEqual = true;        
		      for (int j = i; j < i + 3; j++)
		      {
		        if (list[j] != list[j+1]) 
		        {
		          isEqual = false;
		          break;
		        }
		      }
		     
		      if (isEqual) 
		    	  return true;
	}
		return false;

}
}
