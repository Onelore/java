package homework1;

import java.util.Scanner;

public class training7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	System.out.print("enter list1:");
	int n1=in.nextInt();
	int[]list1=new int[n1];
	for (int i = 0; i < list1.length; i++) 
	    list1[i] = in.nextInt();
	    System.out.print("Enter list2: ");
	    int n2 = in.nextInt();
	    int[] list2 = new int[n2];
	    for (int i = 0; i < list2.length; i++) 
	      list2[i] = in.nextInt();
	    int[] list3 = merge(list1, list2);
	    for (int i = 0; i < list3.length; i++) 
	      System.out.print(list3[i] + " ");
	}
	public static int[] merge(int[]list1,int[]list2)
	{
	   int count1=0;
	   int count2=0;
	   int count3=0;
	   int merge[]=new int[list1.length+list2.length];
	   while(count1<list1.length&&list2.length>count2)
	   {
		   if(list1[count1]<list2[count2])
			   merge[count3++]=list1[count1++];
		   else
			   merge[count3++]=list2[count2++];
	   }
	   while(count1<list1.length)
		   merge[count3++]=list1[count1++];
	   while(count2<list2.length)
		   merge[count3++]=list2[count2++];
	   return merge;
	}

}
