package challenges;

public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {1,2,3,3,3,3,3,3,3,2,3,2,1,1,1,1,1,1,2,3,3,3,3,3};
		
		int len=nums.length;
		int great =len/2;             
		int count = 0;
		
		int majority = 0;
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[i]== nums[j])
				{
					count++;
				}
				
			}
			
			if (count >great)
			{
				majority=nums[i];
			}
				count=0;
				
			
			
			
		}
	System.out.println("Majority element  " + majority);       
		
		
		
	}

}
