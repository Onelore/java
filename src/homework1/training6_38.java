package homework1;

public class training6_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count=0;
	for(int i=1;i<=100;i++)
	{   count++;
		if(count%10==0)
		System.out.println(getlowerch(getlower(), getlower()));
		else
			System.out.print(getlowerch(getlower(), getlower())+" ");
	}
	}
	public static char getlowerch(char ch1,char ch2)
	{
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	public static char getlower()
	{
		return getlowerch('a','z');
	}

}
