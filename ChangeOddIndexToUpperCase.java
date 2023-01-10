package week1.day2.assignments;

/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		String resultText = "";
		char[] testArray = test.toCharArray();

		for (int i = 0; i < testArray.length; i++) {

			char a = testArray[i];
			// System.out.println(a);
			if (i % 2 != 0) {
				a = Character.toUpperCase(testArray[i]);
				// System.out.println(Character.toUpperCase(testArray[i]));;
			}
			resultText = resultText + a;
		}
		System.out.println(resultText);
	}

}
