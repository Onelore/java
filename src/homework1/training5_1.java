package homework1;

import java.util.Scanner;

public class training5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter an int,the input ends if it is 0:");
	Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int p=0,n=0;
    int total=0,count=0;
    if(num!=0) {
    	while(num!=0) {
    		if(num>0)
    			p++;
    		else
    			n++;
    		total+=num;
    		num=in.nextInt();
    	}
    	double ave=total/(p+n);
    	System.out.println("正数的个数为："+p);
    	System.out.println("负数的个数为："+p);
    	System.out.println("总和数为："+total);
    	System.out.println("平均数为："+ave);
    }
    else
    	System.out.print("没有输入正确的数字");
	}

}
