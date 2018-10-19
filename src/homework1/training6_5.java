package homework1;

import java.util.Scanner;

public class training6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double num1=in.nextDouble();
	double num2=in.nextDouble();
	double num3=in.nextDouble();
	display(num1,num2,num3);

	}
	public static void display(double n1, double n2, double n3) {
		// TODO Auto-generated method stub
		if(n1>n2&&n1>n3)
		{
			if(n2>n3)
				System.out.println(n3+" "+n2+" "+n1);
			else
				System.out.println(n2+" "+n3+" "+n1);
		}
		else if(n2>n1&&n2>n3)
		{
			if(n1>n3)
				System.out.println(n3+" "+n1+" "+n2);
			else
				System.out.println(n1+" "+n3+" "+n2);
		}
		else if(n3>n1&&n3>n2)
		{
			if(n1>n2)
				System.out.println(n2+" "+n1+" "+n3);
			else
				System.out.println(n1+" "+n2+" "+n3);
		}
	}
}
