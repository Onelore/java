package homework1;

import java.util.Scanner;

public class training5_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter a string");
    Scanner in=new Scanner(System.in);
	String str=in.nextLine();
    int n=str.length();
    char a;
    for(int i=0;i<=n-1;i=i+2)
    {
    	a=str.charAt(i);
    	System.out.print(a);
    }
	}

}
