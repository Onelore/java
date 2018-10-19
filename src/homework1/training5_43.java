package homework1;

public class training5_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int j,count=0;
		for(int i=1;i<=7;i++)
    {
		
    	for(j=7;j>=1;j--)
    	{
    	if(i!=j)
    	{
    		System.out.println(i+" "+j);
    	    count++;
    	}
    	}
    	
    	   
    }
		 System.out.println("组合有："+count);
	}

}

