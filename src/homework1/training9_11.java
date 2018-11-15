package homework1;

import java.util.Scanner;

public class training9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	(代教:2x2的线性方程)为一个2x2的线性方程设计一个名为 LinearEquation的类: o*+ty=e x=ed-bf y=qf-ec
//	cx+dy=f ad-be ad-be
//	这个类包括:
//	• 私有数据域 a、b、c、d、e 和 f。
//	• 一个参数为 a、b、c、d、e、f的构造方法。
//	• a、b、c、d、e、f的六个get方法。
//	• 一个名为isSolvableO的 方 法，如 果 不 为 0则 返 回true。
//	• 方 法 getxo 和 getYO 返回这个方程的解。
//	画出该类的 UML图并实现这个类。编写一个测试程序，提示用户输入 a、b、c、d、e、f的值， 然后显示它的结果。如果 ad-bc 为0 , 就报告 “The equation has no solution.” 。参见编 程练习题 3.3 的运行示例。
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a, b, c, d, e, f: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    double d = input.nextDouble();
	    double e = input.nextDouble();
	    double f = input.nextDouble();
		LinearEquation linearEquation=new LinearEquation(a, b,c, d, e, f);
//	linearEquation();
	if(linearEquation.isSolvable()) {
		System.out.println("the equation hao no solution");
	}
	else {
		System.out.println(linearEquation.getx()+"  "+linearEquation.gety());
	}
	
	}

}
class LinearEquation{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
		
	}
	
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	public double getc() {
		return c;
	}
	public double getd() {
		return d;
	}
	public double gete() {
		return e;
	}
	public double getf() {
		return f;
	}
	public boolean isSolvable() {
		return a*d-b*c==0;
			
	}
	public double getx() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double gety() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
