package challenges;

public class SameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] word1 = { "ab", "c" };
		//String[] word2 = { "a", "bc" };

		//String[] word1 = { "a", "cb" };
		//String[] word2 = { "a", "bc" };

		String[] word1 = { "abc", "d" ,"efg"};
		String[] word2 = { "abcdefg" };
		
		int len1 = word1.length;
		int len2 = word2.length;
		String newstr1 = "";
		String newstr2 = "";

		for (int i = 0; i < word1.length; i++) {

			newstr1 = newstr1 + word1[i];
		}

		for (int j = 0; j < word2.length; j++) {

			newstr2 = newstr2 + word2[j];
		}

		System.out.println(newstr2);
		System.out.println(newstr1);
		
		if (newstr1.equals(newstr2))

		{
			System.out.println("both string are equal");
		} else {
			System.out.println("Both strings are unequal");
		}

	}

}
