package homework1;

public class training5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double n=10000;
    double r=0.05;
    int y=0;
    double t=0;
    while(y<14) {
    	n=n*(1+r);
    	y++;
    	if(y==10) 
    	System.out.println(y+"年后的学费为："+n);
    	while(y>10) {
    		t=n+t;
    		break;
    	}
    }
    System.out.print("10年后的四年的总学费为："+t);
	}

}
