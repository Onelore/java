package homework1;

import java.util.Scanner;

public class training5_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.print("enter a string:");
    Scanner in=new Scanner(System.in);
    int count1=0,count2=0;
    char a;
    String str=in.nextLine();
    String str1=str.toLowerCase();
    String str2=str1.replaceAll(" ","");
    int s=str2.length();
    for(int i=0;i<=s-1;i++)
    {
    	a=str2.charAt(i);
    	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    	count1++;
    	else
    	count2++;
    }
    System.out.println(str2+"元音有："+count1);
    System.out.println("辅音有："+count2);
	}

}
