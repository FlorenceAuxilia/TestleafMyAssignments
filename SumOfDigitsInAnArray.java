package week1.day2.assignments;
/*
 * Method 1
 * Pseudo Code
 
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) using replaceAll(), replace all the non-digits into ""
 * b) Now, convert the String into array
 * c) Iterate over the array and get each character
 * d) Using Character.getNumericValue(), Change the char into int
 * e) Add the values to sum & print
 * 
 */

/*
 * Method 2
 * Pseudo Code
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) Iterate an  array over the String
 * b) Get each character and check if it is a number using Character.isDigit()
 * c) Now covert char to int using Character.getNumericValue() and add it to sum
 * d) Now Print the value
 */
public class SumOfDigitsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum=0;
		int sum1=0;
		//Method 1
		String newtest = text.replaceAll("[0-9]","");
		
		System.out.println(newtest);
		
		char[] newArray = newtest.toCharArray();
		for (int i = 0; i < newArray.length; i++) {
			
			sum =sum + Character.getNumericValue(newArray[i]);
			
		}
		
		System.out.println(sum);
		
		
		//Method 2
		char[] newArray2 = text.toCharArray();	
		for (int i = 0; i <newArray2.length ; i++) {
			
			
			if ( !(Character.isDigit(newArray2[i])))
			{
				sum1 =sum1 +Character.getNumericValue(newArray2[i]);
			}
			
		}
		
		System.out.println(sum1);
	}

}
