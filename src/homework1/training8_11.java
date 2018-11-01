package homework1;


import java.util.Scanner;

public class training8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
		int t = 0;  //用来记录位数
        int bin = 0; //用来记录最后的二进制数
		int r = 0;  //用来存储余数
		int[]list=new int[9];
		while(n != 0)
		{
		r = n % 2;
		n = n / 2;
		bin += r * Math.pow(10,t);
//		System.out.print(bin+"  ");
		t++; 
		}
		for(int i=8;i>=0;i--)
	    {
	    	
	    	list[i]=bin%10;
	    	bin/=10;
	    	
	    }
        char []a=new char[9];
        for(int i=0;i<9;i++)
        {
        	if(list[i]==1)
        		a[i]='T';
        	else
        		a[i]='H';
        	
        }
        int count=1;
        for(int i=0;i<9;i++)
        {    
        	
            if(count%3!=0)
            	System.out.print(a[i]+" ");
            else
            	System.out.println(a[i]+" ");
            count++;
        }
		
	
	}
	
	

}
