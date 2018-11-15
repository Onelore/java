package homework1;

import java.util.Date;

public class training9_6 {

//	设计一个名为 Stopwatch 的类.该类包含:
//		• 具有访问器方法的私有数据域 startTime 和 endTime。
//		• 一个无参构造方法，使用当前时间来初始化 startTime。
//		• 一个名为 start()的方法，将 startTime 重设为当前时间。
//		• 一个名为 stop()的方法，将 endTime 设置为当前时间。
//		• — 个名为 getElapsedTimeO 的方法，以毫秒为单位返回秒表记录的流逝时间。
//		画出该类的 UML 图并实现这个类。编写一个测试程序.用于测童使用选择排序对 100 000 个数字进行排序的执行时间。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StopWatch time=new StopWatch();
    time.Start();
    int[]num=new int[100000000];
    for(int i=0;i<100000000;i++)
    {
    	num[i]=(int)(Math.random()*2);
    }
    time.end();
    System.out.println(time.getElapseTime());
	}

}
class StopWatch{
	private long startTime;
	private long endTime;
	public StopWatch(){
		this.startTime=System.currentTimeMillis();
		
	}
	public void Start() {

		this.startTime=System.currentTimeMillis();
	}
	public void end() {
		this.endTime=System.currentTimeMillis();
	}
	public long getElapseTime() {
		return endTime-startTime;
	}
	public long getstartTime()
	{
		return startTime;
	}
	public long getendTime() {
		return endTime ;
	}
	public void setstartTime(long startTime) {
		this.startTime=startTime;
	}
	public void setendTime(long endTime) {
		this.endTime=endTime;
	}
}

