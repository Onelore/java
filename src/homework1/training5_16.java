package homework1;

import java.util.Scanner;

public class training5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("输入一个整数：");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int n1=2;
    while(n1<=n) {
    	if(n%n1==0) {
    		n=n/n1;
    		System.out.print(n1+" ");
    	}
    	else
    		n1++;
    }
	}

}
