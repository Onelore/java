package homework1;

import java.util.Scanner;

public class training5_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter first string:");
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
    System.out.println("enter second string:");
	String str2=in.nextLine();
	int a1=str1.length();
	int a2=str2.length();
	int i,j;
	char s1,s2;
	
		for(j=0;j<=a2-1;j++)
		{
			s1=str1.charAt(j);
			s2=str2.charAt(j);
			if(s1==s2)
			System.out.print(s1);
			
		}
	
	
	
	}

}
