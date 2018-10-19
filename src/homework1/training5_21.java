package homework1;

import java.util.Scanner;

public class training5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Loan Amount：");
    double m,total,i;
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
    System.out.println("number of years：");
    int y=in.nextInt();
    y=y*12;
    System.out.println("interest rate \tmonthly payment \ttotal payment");
    for(i=5;i<=8;i=i+0.125)
    {   
    	
    	
    	m=s*(i/12/100)*Math.pow((1+i/12/100), y)/((Math.pow((1+i/12/100), y)-1));
    	total=m*y;
    	System.out.printf("%.1f               %.2f                  %.2f\n",i,m,total);
   
    }
	}

}
