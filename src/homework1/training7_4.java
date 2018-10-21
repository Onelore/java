package homework1;


import java.util.Scanner;

public class training7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("enter 1~100");
	int []list=new int[100];
	double sum=0;
	int count=0;
	Scanner in=new Scanner(System.in);
	while(in.hasNext())
	{
	    int temp=in.nextInt();
	    if(temp<0)
	    	break;
	    list[count]=temp;
	    sum=sum+temp;
	    count++;
	
	}
	double ave=sum/count;
	int n1=0,n2=0;
	for(int i=0;i<list.length;i++)
	{
		if(list[i]>=ave)
			n1++;
		else if(list[i]>0&&list[i]<ave)
			n2++;
	}
	System.out.println("平均数： "+ave);
	System.out.println("大于等于平均数的有 "+n1);
	System.out.println("小于平均数的有 "+n2);
	

}
}
