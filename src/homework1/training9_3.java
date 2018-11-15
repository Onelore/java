package homework1;

public class training9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	
	java.util.Date date=new java.util.Date();

	

    int count = 1;
    long time = 10000;
    
    while (count <= 8) {
      date.setTime(time);
      System.out.println(date.toString());   
      count++;
      time *= 10;
    }
  }
}




