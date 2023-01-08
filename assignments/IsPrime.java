package week1.day1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =29;
		boolean prime =false;
		for (int i = 2; i < num/2; i++) {
			
			if(num % i== 0) {
				prime = true;
				
				break;
				
			}
			
			
		}
		
		if (!prime) 
			System.out.println(num + "is a prime number");
		
		else 
			System.out.println(num + "is not a prime number");
		

	}

}
