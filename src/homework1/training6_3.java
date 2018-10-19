package homework1;

import java.util.Scanner;

public class training6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	if(isp(num))
		System.out.println(num+" 是回文数");
	else
		System.out.println(num+" 不是回文数");
	}

	public static int reverse(int num)
	{
		int sum=0;
		int a;
		while(num!=0)
		{
			a=num%10;
			sum=sum*10+a;
			num=num/10;
		}
		return sum;
		
		
	}
	public static boolean isp(int num)
	{
		return (num==reverse(num));
	}
	
}
