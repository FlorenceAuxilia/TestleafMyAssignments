package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;


/*
* Pseudo code 
* a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
*
*Output= We learn java basics as part of sessions in week1
*
* Psuedocode
*
* b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
* c) Create a empty Set 
* d) Iterate the String array
            d.1) add each word into Set
* e) Print the Set values which is having unique words
*/
public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] newtext=text.split(" ");
		Set <String>s= new HashSet<String>( );
		String output ="" ;
		for (int i = 0; i < newtext.length; i++) {
			
			boolean add=s.add(newtext[i]);

			
			if (add)
			{
				output= output + " "+ newtext[i];
			}
		}
			
		System.out.println(output);
	}

}
