package homework1;

public class training7_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[]suit= {"spades","hearts","diamons","clubs"};
	String[]rank= {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
	int[]deck=new int[52];
	boolean[]find=new boolean[4];
	int numpicks=0;
	int count=0;
	while(count<4)
	{
		numpicks++;
		int index=(int)(Math.random()*deck.length);
		if(!find[index/13])
		{
			find[index/13]=true;
			count++;
			String suits=suit[index/13];
			String ranks=rank[index%13];
			System.out.println("Card number "+index+" : "+ranks+" of "+suits);
		}
	}
	System.out.println("Number of picks: " + numpicks);
	
	
	}
	

}
