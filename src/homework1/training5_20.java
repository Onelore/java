package homework1;

public class training5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int count = 1; 
        int num = 2; 
        boolean isPrime  = true; 

        System.out.println("The number is from 2 to 1000.");

        while (num <= 1000){

            isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
            	if(count%8==0)
                System.out.println(num+" ");
            	else
                System.out.print(num+" ");
            	count++;
               num++;
        }
            num++;

        }
	}
}
