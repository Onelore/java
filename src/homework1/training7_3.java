package homework1;

import java.util.Scanner;

public class training7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    System.out.println("enter 1~100");
	int []list=new int[100];
	Scanner in=new Scanner(System.in);
    while(in.hasNext())
    {
    	int temp=in.nextInt();
    	if(temp==0)break;
    	list[temp]++;
    }
    for(int i=0;i<list.length;i++)
    {
    	if(list[i]==1)
    		System.out.println(i+" occurs "+list[i]+" time");
    	else if(list[i]>1)
    		System.out.println(i+" occurs "+list[i]+" times");
    		
    }
	    
	    
	  
	}

}
