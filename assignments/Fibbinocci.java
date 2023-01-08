package week1.day1.assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int firstnum=0;
		int seconnum = 1;
		int sum =0;
		System.out.println(firstnum);
		
		for (int i = 1; i < 12; i++) {
			
			sum =firstnum+ seconnum;
			firstnum =seconnum;
			seconnum=sum;
			System.out.println(sum);
			
		}
	}

}
