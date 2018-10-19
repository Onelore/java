package homework1;

public class training6_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int	n1=0,n2=0;
		sum(n1, n2);
		}
		public static void sum(int n1,int n2)
		{
//			n1=(int)(Math.random()*6+1);
//			n2=(int)(Math.random()*6+1);
			int count=0;
			for(int i=1;i<=10000;i++) {
			int r=random(n1,n2);
			
			if(r==7||r==11)
			{
				
				count++;
			}
			else
			{
				
				int r1=random(n1, n2);
				
				if(r==r1)
				{
//					
					count++;
				}
				    
				
			}
			
		}
			System.out.println(count);
		
		}
		public static int random(int n1,int n2)
		{
			n1=(int)(Math.random()*6+1);
			n2=(int)(Math.random()*6+1);
			int n=n1+n2;
			return n;
		}

	
}
