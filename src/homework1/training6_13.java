package homework1;

import java.util.Scanner;

public class training6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    for(int j=1;j<=i;j++)
    {
    	System.out.print(j+"\t");
    	System.out.printf("%.4f\n",sum(j));
    }
	
	}
	public static double sum(int i)
	{
		double s=0;
		for(int j=1;j<=i;j++)
		{
			s=s+j/(j+1.0);
		}
		return s;
	}

}
