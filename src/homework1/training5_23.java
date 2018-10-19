package homework1;

public class training5_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double s=0,s1=0;
    for(int i=1;i<=50000;i++)
    {
    
    	s=s+(1.0/i);
    	
    }
   
    System.out.println(s);
    for(int i=50000;i>=1;i--)
    {
    	
    	s1=s1+1.0/i;
    	
    }
    System.out.println(s1);
	}

}
