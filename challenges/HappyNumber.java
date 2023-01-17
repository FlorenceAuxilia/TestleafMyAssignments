package challenges;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=19;
		int rem=0;
		int sum=0;
		while (num > 9)
        {
            while (num > 0)
            {
            	rem = num % 10;
                sum = sum + (rem* rem);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
		
				
				
				
		
	}

}
