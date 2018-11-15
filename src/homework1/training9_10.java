package homework1;

public class training9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//	(代數:二次方程式)为二次方程式o +fec+^t O设计一个名为QuadraticEquation的类。这个
//	类包括: ^ • 代表三个系数的私有数据域 a、b 和 c。 • 一个参数为a、b和c的构造方法。
//	• a、b、c的三个get方法。
//	• —个名为getDiscriminant()的方法返回判别式，
//	• 名为 getRootl() 和 getRoo^t2()的方法返回等式的两个根:
//	b^2 -4ac 和 -b-俾:4ac '2a 1 2a
//	这些方法只有在判别式为非负数时才有用。如果判别式为负，这些方法返回 0。
//	両出该类的UML图并实现这个类。编写一个测试程序，提示用户输人a、b和c的值，然 后显示判别式的结果。如果判别式为正数，显示两个根;如果判别式为0,显示一个根;
//	否则，显示 “The equation has no roots.”(这个方程无根)。参见编程练习题 3.1 的运行示例。
	QuadraticEquation quadraticEquation=new QuadraticEquation(9, 18, 6);
	System.out.print(quadraticEquation.getroot1()+" "+quadraticEquation.getroot2());
	}
}
class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double geta() {
		return this.a;
	}
	public double getb() {
		return this.b;
	}
	public double getc() {
		return this.c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getroot1() {
		if(getDiscriminant()<0)
			return 0;
		else
			return (-b+getDiscriminant())/(2*a);
	}
	public double getroot2(){
		if(getDiscriminant()<0)
			return 0;
		else
			return (-b-getDiscriminant())/(2*a);
	}
	
}