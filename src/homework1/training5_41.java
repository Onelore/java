package homework1;

import java.util.Scanner;

public class training5_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("enter numbers:");
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int max=0;
    int count=0;
    if(num!=0) {
    	while(num!=0) {
    		if(num>max)
    		{
    			max=num;
    		}
    		
    		num=in.nextInt();
    	}
    	
    	
    	System.out.println("最大数为："+max);
    	
    	
    }
    else
    	System.out.print("没有输入正确的数字");
	}

}
