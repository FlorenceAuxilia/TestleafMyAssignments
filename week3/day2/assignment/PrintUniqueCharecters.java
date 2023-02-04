package week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="babu";
		char[] charArray = text.toCharArray();
		
		Set <Character> textset=new HashSet<Character>();
		String output="";
		for (int i = 0; i < charArray.length; i++) {
			
			boolean add=textset.add(charArray[i]);
			
			if (add)
			{
				output=output + charArray[i];
			}
		}
		
		System.out.println(output);
			
		

	}

}
