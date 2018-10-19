package homework1;

public class training6_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	n1=0,n2=0;
	sum(n1, n2);
	}
	public static void sum(int n1,int n2)
	{
//		n1=(int)(Math.random()*6+1);
//		n2=(int)(Math.random()*6+1);
		int r=random(n1,n2);
		if(r==2||r==3||r==12)
		{
			System.out.print("you roolled:"+r+"\nyou lose");
			
		}
		else if(r==7||r==11)
		{
			System.out.print("you roolled:"+r+"\nyou win");
		}
		else
		{
			System.out.println("you roolled:"+r+"\nthe point is:"+r);
			int r1=random(n1, n2);
			System.out.println("you roolled:"+r1);
			if(r==r1)
				System.out.println("you win");
			else
				System.out.println("you lose");
		}
		
	}
	public static int random(int n1,int n2)
	{
		n1=(int)(Math.random()*6+1);
		n2=(int)(Math.random()*6+1);
		int n=n1+n2;
		return n;
	}

}
