package homework1;

import java.util.Scanner;

public class training5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("输入一个1～15的整数：");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++) {
    	for(int j=(n-i)*3-1;j>=0;j--) 
    	{
    	System.out.print(" ");
        }
   for(int j=i;j>=1;j--) {
	   if(j<10)
		   System.out.print("  ");
	   else
		   System.out.print(" ");
	   System.out.print(j);
   }
   for(int j=2;j<=i;j++) {
	   if(j<10)
		   System.out.print("  ");
	   else
		   System.out.print(" ");
	   System.out.print(j);
   }
   System.out.println("");
    }	
    
	}

}
