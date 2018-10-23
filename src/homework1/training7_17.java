package homework1;


import java.util.Scanner;

public class training7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String[]name=new String[n];
	double[]sore=new double[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("输入学生的名字：");
		name[i]=in.next();
		System.out.println("输入学生的成绩：");
		sore[i]=in.nextDouble();
	}
	listsort(sore,name,n);
	
    
	
	}
	public static void listsort(double[]sore,String[]name,int num)
	{
		double tmpSore;
	    String tmpName;
	    for (int i = 0; i < num; i++) 
	    {
	        for (int j = i; j < num; j++)
	        {
	            if (sore[i] < sore[j]) 
	            {
	                tmpSore = sore[j];
	                sore[j] = sore[i];
	                sore[i] = tmpSore;
	 
	                tmpName = name[j];
	                name[j] = name[i];
	                name[i] = tmpName;
	            }
	        }
	    }
	    for(int i=0;i<num;i++)
	    {
	    	System.out.println(name[i]+" "+sore[i]);
	    }

	
	}
	

}
