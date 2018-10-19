package homework1;

public class training6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int p=2;p<=31;p++)
	{
		if(isprime(p))
		System.out.println(p+"\t"+num(p));
	}
	}
	public static int num(int p)
	{
		int num=(int)(Math.pow(2, p)-1);
		return num;
	}
	public static boolean isprime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
