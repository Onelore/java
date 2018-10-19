package homework1;

import java.util.Scanner;

public class training5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("输入一个数字");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println("输入一个利率");
    double r=in.nextDouble();
    System.out.println("输入一个月份");
    int m=in.nextInt();
    r=r/12/100;
    double s=0;
    for(int i=1;i<=m;i++)
    {
    	s=(s+n)*(1+r);
    	System.out.println("第"+i+"月账户的金额为：");
    	System.out.printf("%.3f\n",s);
    }
	}

}
