package homework1;

import java.util.Scanner;

public class training6_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	double s=in.nextDouble();
	System.out.println("the area of the polygon is "+area(n,s));
	}
	public static double area(int n,double side)
	{
		double area=n*side*side/(4*Math.tan(Math.PI/n));
		return area;
	}

}
