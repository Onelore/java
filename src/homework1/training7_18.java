package homework1;

import java.util.Scanner;

public class training7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double[]list=new double[10];
	for(int i=0;i<10;i++)
	{
		list[i]=in.nextDouble();
	}
	sort(list);
	
	}
	public static void sort(double []list)
	{
		double temp=0;
		double tempnum=0;
		for(int i=0;i<list.length;i++)
		{
	       for(int j=i;j<list.length;j++)
	       {
	    	   if(list[i]>list[j])
	    	   {
	    		   temp=list[i];
	    		   list[i]=list[j];
	    		   list[j]=temp;
	    	   }
	       }
		}
		 for(int i=0;i<list.length;i++)
		    {
		    	System.out.print(list[i]+" ");
	}

}
}
