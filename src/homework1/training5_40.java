package homework1;

import java.util.Scanner;

public class training5_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
 
    int i,count1=0,count0=0;
	for(i=1;i<=n;i++)
	{   int s=(int)(Math.random()*2);
		if(s==1)
			count1++;
		else if(s==0)
			count0++;
			
	}
	System.out.print("正面的次数为："+count1+" 反面的次数为："+count0);
	}

}
