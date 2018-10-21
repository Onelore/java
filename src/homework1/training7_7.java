package homework1;

public class training7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]list=new int[100];
    int[]list1=new int[100];
	for(int i=0;i<100;i++)
	{
		list[i]=(int)(Math.random()*10);
				
	}
	int count=0;
	for(int i=0;i<100;i++)
	{
		for(int j=0;j<100;j++)
		{
			if(list[i]==list[j])
			list1[i]++;
		}

		System.out.println(list[i]+" "+list1[i]);
		
		
		
	}
	
	}

}
