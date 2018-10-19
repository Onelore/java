package homework1;

import java.util.Scanner;

public class training5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("输入学生的个数：");
    double max=0;
    String maxname="";
    
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
  
    for(int i=1;i<=n;i++) {
    System.out.println("学生的名字和分数");
    String str=in.next();
//    System.out.println("学生的分数：");
    double s=in.nextDouble();
    System.out.println("学生的名字为："+str+"\t学生的分数为："+s);
    if(s>max) {
    	max=s;
    	maxname=str;
    }
    }
    System.out.println("成绩最好的是："+maxname+" 分数为："+max);
   
	}

}
