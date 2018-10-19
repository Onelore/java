package homework1;

public class training6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2;
		int count=0;
		while(count<=100)
		{if(isnotp(i)&&isprime(i))
		{
		count++;
		if(count%10==0)
		System.out.println(i);
		else
		System.out.print(i+"\t");
		}
		i++;
		}
	}
	public static boolean isprime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		int num1 = 0;
	    while (num != 0) {
	        num1 = num % 10 + (num1 * 10);
	        num = num / 10;
	    }
	    for (int i = 2; i < num1; i++) 
	    {
	        if (num1 % i == 0)
	            return false;
	    }
		return true;
	}
	public static boolean isnotp(int num)
	{
		int num1=0;
		int temp=num;
		while(temp!=0)
		{
			num1=temp%10+num1*10;
			temp=temp/10;
		}
		return num!=num1;
	}
		
	
}
