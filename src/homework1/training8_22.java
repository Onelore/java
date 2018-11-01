package homework1;

public class training8_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [][]m=new int[6][6];
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			m[i][j]=(int)(Math.random()*2);
	}
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m[i].length;j++)
			System.out.print(m[i][j]+" ");
		System.out.println("");
	}
	if(iseven(m))
	{
		System.out.print("每一行有偶数个1");
	}
	else
		System.out.print("每一行没有偶数个1");
		
	{
		
	}
		
	}
	public static boolean iseven(int [][]m)
	{
		int[] rowsum=new int[m.length];
		for(int i=0;i<m.length;i++)
		{
			int sum=0;
			for(int j=0;j<m[i].length;j++)
			{
				sum+=m[i][j];
			}
			rowsum[i]=sum;
		}
		int countrow=0;
		for(int i=0;i<rowsum.length;i++)
		{
		  if((rowsum[i]%2)==0&&rowsum[i]!=0)
		   {
			
			countrow++;
		   }
		}
		if(countrow==rowsum.length)
			return true;
		else
			return false;
		
		
	}
	

}
