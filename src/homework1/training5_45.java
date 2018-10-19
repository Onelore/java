package homework1;

import java.util.Scanner;

public class training5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("enter 10 numbers:");
    Scanner in=new Scanner(System.in);
    double m=0,ave=0,s=0,s1=0;
    for(int i=1;i<=10;i++)
    {  
    	
    	double n=in.nextDouble();
    	m=m+n;
    	s1=s1+n*n;
  
    }
    ave=m/10;
    s=Math.pow((s1-(Math.pow(m, 2)/10))/(10-1), 0.5);
		System.out.println("平均数为："+ave+" 方差为："+s);

	
	}

}
