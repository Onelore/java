package homework1;

import java.util.Scanner;

public class training6_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	long mills=in.nextLong();
	System.out.print(convertMills(mills));
	}
	public static String convertMills(long mills)
	{
		long s,m,h,s1,m1;
		
		s=mills/1000;
		s1=s%60;
		m=s/60;
		m1=m%60;
		h=m/60;
		
		return h+":"+m1+":"+s1;
	}

}
