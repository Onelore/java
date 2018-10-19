package homework1;

import java.util.Scanner;

public class training5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double s1=0,s2=0,s=0;
    Scanner in=new Scanner(System.in);
    double n=in.nextDouble();
    for(int i=1;i<=n;i++)
    {
    	s=s+Math.pow(-1, i+1)/(2*i-1.0);
    }
    System.out.print(4*s);
	}

}
