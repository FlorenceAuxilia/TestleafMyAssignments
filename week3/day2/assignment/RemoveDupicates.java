package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;

//Declare a String as "PayPal India"

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print it

public class RemoveDupicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text ="PayPal India";
		text=text.toLowerCase();
		char[] charArray = text.toCharArray();
		Set <Character> charset=new HashSet<Character>();
		Set <Character> dupcharset=new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			boolean add=charset.add(charArray[i]);
			
			if (!add)
			{
				dupcharset.add(charArray[i]);
			}
		}
		
		System.out.println(charset);
		System.out.println(dupcharset);
		String str="";
		for (Character charloopset:charset)
		{
		 if (charloopset != ' ')
		 {
			 str=str+charloopset;
			 
		 }
		}
		System.out.println(str);
	}

}
