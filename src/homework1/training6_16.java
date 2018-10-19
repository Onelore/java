package homework1;

public class training6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i=2000;i<=2020;i++)
	{
		System.out.println(i+"\t"+num(i));
	
	}
	
	}
	public static int num(int year)
	{
		int d=0;
		if(year%4==0&&year%100!=0||year%400==0)
		{
			d=366;
		}
		else
			d=365;
		return d;
	}
	

}
