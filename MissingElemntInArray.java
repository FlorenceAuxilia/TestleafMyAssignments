package week1.day2.assignments;

import java.util.Arrays;

/*
 * / Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		

 */
public class MissingElemntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
		
			if (i != arr[i])
			{
				System.out.println(i);
				break;
			
			}
				
			
		}
	}
}
