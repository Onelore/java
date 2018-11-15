package homework1;

import java.util.Scanner;

public class training9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(位置类 Location)设计一个名为Location的类，定位二维数组中的最大值及其位置。这个类 包括公共的数据域 row、column 和 maxValue, 
//		二维数组中的最大值及其下标用 int 型的 row 和 column 以及 double 型的 maxValue 存储。 编写下面的方法，返回一个二维数组中最大值的位置。
//		public static Location 1ocateLarges(t double[][] a)
//		返回值是一个 Location的实例。编写一个测试程序，提示用户输人一个二维数组.然后
//		显示这个数组中最大元素的位置。下面是一个运行示例:
	Scanner in=new Scanner(System.in);
	int r=in.nextInt();
	int c=in.nextInt();
	double[][]a=new double[r][c];
	for(int i=0;i<r;i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=in.nextDouble();
		}
		System.out.println("");
	}
	Location location = locationlagerest(a);
	System.out.println("the max is "+location.maxVaule+" ("+location.row+","+location.column+")");
	}

	public static Location locationlagerest(double[][]a) {
		Location location=new Location();
		location.maxVaule=a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(location.maxVaule<a[i][j]) {
					location.row=i;
					location.column=j;
					location.maxVaule=a[i][j];
				}
			}
			
		}
		return location;
	}
}

class Location{
	public int row;
	public int column;
	public double maxVaule;
}

