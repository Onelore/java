package homework1;

import java.util.Scanner;

public class training6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("enter a letter:");
	Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String str=s1.toLowerCase();
    char a ;
    int n=str.length();
    for(int i=0;i<=n-1;i++)
    {a=str.charAt(i);
    
    System.out.print(getnumber(a));
    }
	}
	public static int getnumber(char a)
	{
	    	
	    if(a=='a'||a=='b'||a=='c')
	    {
	    	a=2;
	    	
	    }
	    else if(a=='d'||a=='e'||a=='f')
	    {
	    	a=3;
	    }
	    else if(a=='g'||a=='h'||a=='i')
	    {
	    	a=4;
	    }
	    else if(a=='j'||a=='k'||a=='l')
	    {
	    	a=5;
	    }
	    else if(a=='m'||a=='n'||a=='o')
	    {
	    	a=6;
	    }
	    else if(a=='p'||a=='q'||a=='r'||a=='s')
	    {
	    	a=7;
	    }
	    else if(a=='t'||a=='u'||a=='v')
	    {
	    	a=8;
	    }
	    else if(a=='y'||a=='w'||a=='x'||a=='z')
	    {
	    	a=9;
	    }
	    else if(a>='0'&&a<='9')
	    	return a-48;
	
	    else
	    {
	    	System.out.println(a+" is an invalid input");
	    	
	    }
	    return a;
	   
	}
		
		
	}


