package homework1;

import java.util.Scanner;

public class training5_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("enter a string:");
	Scanner in=new Scanner(System.in);
	int count1=0,count2=0;
	char a;
	String str=in.nextLine();
	
	String str1=str.replaceAll(" ","");
	int s=str1.length();
	for(int i=0;i<=s-1;i++)
	{
		a=str1.charAt(i);
		int n=(int)a;
		if(65<=n&&n<=96)
		count1++;
	}
	System.out.println("大写字母数目为："+count1);
	}

}
