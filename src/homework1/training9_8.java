package homework1;

public class training9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	(风扇类 Fan)设计一个名为 Fan 的类来表示一个风扇。这个类包括:
//		• 三个名为SLOW、MEDIUM和FAST而值为1、2和3的常量，表示风扇的速度。
//		• —个名为speed的int类型私有数据域，表示风扇的速度(畎认值为SLOW)。
//		• — 个名为 on 的 boolean 类型私有数据域.表示风扇是否打开(默认值为 false〉。
//		• 一个名为 radius 的 double 类型私有数据域，表示风扇的半径(默认值为 S)。
//		• 一个名为 color 的 string 类型数据域，表示风扇的颜色(默认值为 blue)。
//		• 这四个数据域的访问器和修改器。
//		• 一个创建默认风扇的无参构造方法。
//		• 一个名为 toStringO 的方法返回描述风扇的宇符串。如果风扇是打开的，那么该方法在一个
//		组合的宇符串中返回风扇的速度、顔色和半径。如果风扇没有打开，该方法就会返回一个由 “ fan is off” 和风扇颜色及半径组合成的字符串。
//		画出该类的 UML 图并实现这个类。编写一个测试程序，创建两个 Fan 对象。将第一个对象 设置为最大速度、半径为10、颜色为 yellow、状态为打开。
//		将第二个对象设置为中等速度、半 径为 S、颜色为 blue、状态为关闭。通过调用它们的 toString 方法显示这些对象。
		Fan fan1 = new Fan();
	    fan1.setSpeed(Fan.Fast);
	    fan1.setRadius(10);
	    fan1.setcolor("yellow");
	    fan1.isOn(true);
	    System.out.println(fan1.toString());

	    Fan fan2 = new Fan();
	    fan2.setSpeed(Fan.Medium);
	    fan2.setRadius(5);
	    fan2.setcolor("blue");
	    fan2.isOn(false);
	    System.out.println(fan2.toString());
	}

}
class Fan{
	public static int Slow=1;
	public static int Medium=2;
	public static int Fast=3;
	private int speed=1;
	
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	public Fan() {
		
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int newspeed) {
		this.speed=newspeed;
	}
	public boolean isOn() {
		return this.on;
	}
	public void isOn(boolean tureorfalse) {
		this.on=tureorfalse;
	}
	public String getcolor() {
		return this.color;
		
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		
	}
	public double getradius() {
		return this.radius;
		
	}
	public String toString() {
	    return "speed " + this.speed + "\n"
	      + "color " + this.color + "\n"
	      + "radius " + this.radius + "\n"
	      + ((this.on) ? "fan is on" : "fan is off");
	  } 
}
