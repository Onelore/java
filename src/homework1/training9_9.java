package homework1;

public class training9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		(几何:正 n 边形)在一个正;《 边形中，所有边的长度都相同，且所有角的度数都相同(即这个多 边形是等边等角的)。设计一个名为 ReguUrPolygon 的类，该类包括:
//			• 一个名为 n 的 int 型私有数据域定义多边形的边数，狀认值为 3。
//			• 一个名为 side 的 double 型私有数据域存储边的长度，默认值为 1。
//			• 一个名为 x 的 double 型私有数据域定义多边形中点的;c 坐标，默认值为 0。
//			• 一个名为 y 的 double 型私有数据域定义多边形中点的>> 坐标，默认值为 0。
//			• 一个创建带畎认值的正多边形的无参构造方法。
//			• 一个能创建带指定边数和边长度 、中心在(0,0) 的正多边形的构造方法。
//			• 一个能创建带指定边数和边长度、中心在(X«y) 的正多边形的构造方法。
//			• 所有数据域的访问器和修改器。
//			• — 个返回多边形周长的方法 getPerimeterO。
//			• 一个返回多边形面积的方法 getAreaO。计算正多边形面积的公式是:
//			画出该类的 UML 图并实现这个类。编写一个测试程序，分别使用无参构造方法、 RegularPo1ygon(6,4)和 RegularPolygon(10,4,5_6,7_8)创建三个 RegularPolygon 对象。显示每个对象的周长和面积。
	RegularPolygon regularPolygon=new RegularPolygon(6,4);
	RegularPolygon regularPolygon2=new RegularPolygon(10,4,5.6,7.8);
	RegularPolygon regularPolygon3=new RegularPolygon();
	System.out.println(regularPolygon.getPerimeter()+" "+regularPolygon.getarea());
	System.out.println(regularPolygon2.getPerimeter()+" "+regularPolygon2.getarea());
	System.out.println(regularPolygon3.getPerimeter()+" "+regularPolygon3.getarea());
	
	}
}
class RegularPolygon{
	private int n=3;
	private double side=1;
	private double x;
	private double y;
	public RegularPolygon() {
		
	}
    public RegularPolygon(int n,double side) {
		this.n=n;
		this.side=side;
	}
    public RegularPolygon(int n,double side,double x,double y) {
    	this.n=n;
    	this.side=side;
    	this.x=x;
    	this.y=y;
    }
    public void setn(int n) {
    	this.n=n;
    }
    public int getn() {
    	return this.n;
    }
    public void getside(double side) {
    	this.side=side;
    }
    public double  getside() {
    	return side;
    }
    public void setx(double x) {
    	this.x=x;
    }
    public double getx() {
    	return x;
    }
    public void  sety(double y) {
    	this.y=y;
    }
    public double gety() {
    	return y;
    }
    public double getPerimeter() {
    	return this.side*this.n;
	}
    public double getarea() {
    	return this.n * this.side * this.side / (Math.tan(Math.PI / this.n) * 4);
    }
    
     
    
    
	
	
	
}

