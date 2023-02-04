package week3.day2.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//Find the most duplicate number -> First most duplicate
/*
* input: abbaba
* output: b
* 
* 
*/

/*
 * Psuedocode
 * 
 * a) Map -> HashMap 
 * b) String -> ch[] -> Get all the character -> occurance
 * c) Keep comparing the occurance with other values -> max value -> character
 * 
 */


public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abbaa";
			// a=2, m=2, z=1, o=2

			Map<Character, Integer> occ = new HashMap<Character, Integer>();

			char[] charArray = s.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				if (occ.containsKey(charArray[i])) {
					int existingCount = occ.get(charArray[i]);
					occ.put(charArray[i], existingCount + 1);
				} else {
					occ.put(charArray[i], 1);
				}
			}
			System.out.println(occ);
			
			
			
	}

}
