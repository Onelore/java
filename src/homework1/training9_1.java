package homework1;

public class training9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    reangle r1=new reangle();
    System.out.println(r1.h+" "+r1.w+" "+r1.getarea()+" "+r1.getperimer());
	reangle r2=new reangle(3,5);
	System.out.println(r2.h+" "+r2.w+" "+r2.getarea()+" "+r2.getperimer());
	r1.h=7;
	r1.w=8;
	 System.out.println(r1.h+" "+r1.w+" "+r1.getarea()+" "+r1.getperimer());
	}

}

class reangle{
	double w;
	double h;
	reangle(){
		w=1;h=1;
	}
	reangle(double neww,double newh){
		w=neww;
		h=newh;
	}
	double getarea() {
		return w*h;
	}
	double getperimer() {
		return 2*(w+h);
	}
	void set(double neww,double newh) {
		w=neww;
		h=newh;
	}
	
	
}
