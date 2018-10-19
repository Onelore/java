package homework1;

import java.util.Scanner;

public class training6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i%10==0)
			System.out.println(getnum(i));
		else
			System.out.print(getnum(i)+"\t");
	}
	
	}

	public static int getnum(int n)
	{
		int s;
		s=n*(3*n-1)/2;
		return s;
	}
}
