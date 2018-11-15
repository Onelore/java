package homework1;

import java.util.GregorianCalendar;





public class training9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	java.util.GregorianCalendar date=new java.util.GregorianCalendar();

	System.out.print(date.get(GregorianCalendar.YEAR)+" ");
	System.out.print(date.get(GregorianCalendar.MONTH)+1+" ");
	System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
	date.setTimeInMillis(1234567898765L);
	System.out.print(date.get(GregorianCalendar.YEAR)+" ");
	System.out.print(date.get(GregorianCalendar.MONTH)+1+" ");
	System.out.print(date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
