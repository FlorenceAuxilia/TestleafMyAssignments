package week1.day2.assignments;


/* Pseudo Code:
	 
	 * Declare the input as Follow
     		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	
	d)split the words and have it in an array
	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).*/

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test =  "i am a software tester";
		String[] testArray =test.split(" ");
		String newtext=" ";
		char temp;
		for (int i = 0; i < testArray.length; i++) {
			if (i%2 != 0)
			{
				char[] nameArray= testArray[i].toCharArray();
				for (int j = nameArray.length-1; j >=0; j--) {
					temp =nameArray[j];
					newtext =newtext + temp;
				}
			}else 
			{
				newtext =  newtext  +" "+ testArray[i] ;
			}
		}
		System.out.println(newtext);
	}

}
