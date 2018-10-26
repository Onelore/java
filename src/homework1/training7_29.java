package homework1;

public class training7_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]list= new int [13];

	
	for(int i=0;i<13;i++)
	{
		list[i]=i+1;
	}
	int a1=0,a2=0,a3=0,a4=0,count=0;
	while((a1+a2+a3+a4)!=24)
	{
		 a1=random(list);
		 a2=random(list);
		 a3=random(list);
		 a4=random(list);
		 count++;
	}
	System.out.print("抽到四张牌为24的次数为："+count);
	
	
	
	
	}
	public static int random(int []list)
	{
		int a;
		a=list[(int)(Math.random()*13)];
		return a;
	}

}
