package homework1;

public class training5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count=1;
   for(int i=101;i<=2100;i++)
    {
    	if((i%4==0&&i%100!=0)||i%400==0)
    	{
    		count++;
    	    if(count%10==0)
    	    	System.out.println(i);
    	    else
    	    	System.out.print(i+" ");
    	}
    	
    }
   System.out.println("");
     System.out.println("闰年的数目为："+count);
	}

}
