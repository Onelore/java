package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class training7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("enter student numbers");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int max=0;
    int maxindex;
    System.out.println("enter student scores:");
    int[]list = new int[n];
    for(int i=0;i<=n-1;i++)
    {
    	list[i]=in.nextInt(); 	
    	if(list[i]>max)
    	
    		max=list[i];
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print("student "+i+" score is "+list[i]+" and grade is ");
    	if(list[i]>=max-10)
    		System.out.println("A");
    	else if(list[i]>=max-20)
    		System.out.println("B");
    	else if(list[i]>=max-30)
    		System.out.println("C");
    	else if(list[i]>=max-40)
    		System.out.println("D");
    	else
    		System.out.println("F");
    	
    	
    		
    }
    		
    	
    	
    	    
    	
    
    

   
   

    
    
	}

}
