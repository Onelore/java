package homework1;

public class training5_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double s=0,n;
	for(int i=1;i<=624;i++)
    {
    	n=1/(Math.pow(i, 0.5)+Math.pow(i+1, 0.5));
    	s=s+n;
    }
	System.out.println(s);
	}

}
