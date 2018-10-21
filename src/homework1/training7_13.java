package homework1;

public class training7_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n = getRandom(5,6,8,52);
	System.out.println(n);

	}
	public static int getRandom(int...numbers)
	{
		int num=(int)(Math.random()*54)+1;
		int temp=0;
		while(true)
		{
			for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==num)
			{
				temp=1;
				break;
			}	
		}
			if(temp==1)
			{
				num=(int)(Math.random()*54)+1;
			}
			else
				break;
			
		}
		return num;
	}

}
