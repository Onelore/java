package homework1;

import java.util.Scanner;

public class training6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double num=in.nextDouble();
	double r=in.nextDouble();
	int y=in.nextInt();
	for(int i=1;i<=y;i++)
	{
	System.out.print(i+"\t");
	System.out.printf("%.2f\n", future(num,r,i));
	}
}
	public static double future(double num,double r,int y)
	{
		
		double future=num*(Math.pow(1+r/1200,y*12));
		return future;
		
	}

}
