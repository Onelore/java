package homework1;

import java.util.Scanner;

public class training6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	double s1=in.nextDouble();
	double s2=in.nextDouble();
	double s3=in.nextDouble();
	System.out.println("面积为："+area(s1,s2,s3));
	}
	public static boolean isVaild(double s1,double s2,double s3)
	{
		if(s1+s2>s3&&s1+s3>s2&&s2+s3>s1)
			return true;
		else
			System.out.print("输入错误！");
			return false;
		
	}
	public static double area(double s1,double s2,double s3)
	{
		if(isVaild(s1, s2, s3));
		double s=(s1+s2+s3)/2;
		double a=Math.pow(s*(s-s1)*(s-s2)*(s-s3), 0.5);
		return a;
		
	}

}
