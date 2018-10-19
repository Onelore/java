package homework1;

import java.util.Scanner;

public class training5_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the initial deposit amount:");
    Scanner in=new Scanner(System.in);
    double n=in.nextDouble();
    System.out.println("enter annual percentage yield:");
    double r=in.nextDouble();
    System.out.println("enter months:");
    int m=in.nextInt();
    r=r/1200;
    double s=0;
    System.out.println("month\tcd vaule");
    for(int i=1;i<=m;i++)
    {
    	n=n+n*r;
    	System.out.print(i+"\t");
    	System.out.printf("%.2f\n", n);
    }
	}

}
