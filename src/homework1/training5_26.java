package homework1;

import java.util.Scanner;

public class training5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    double e=1,item=1;
    double n=in.nextDouble();
    
	for(int i=1;i<=n;i++)
	{
		item=item/i;
	    e=e+item;
		}
	System.out.print(e);
	}
	
	}


