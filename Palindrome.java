package challenges;

public class Palindrome {
//input1 race a car
	//input A man, a plan,a canal: Panama
	//input " "
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "A man, a plan,a canal: Panama ";
		String rev = "";
		String input1=input.replaceAll(",", "");
		String input2=input1.replaceAll(":", "");
		String input3=input2.replaceAll(" ", "");
		
		char[] inputArray = input3.toCharArray();
		
		for (int i = input3.length() - 1; i >= 0; i--) {
			rev = rev + inputArray[i];
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(input3))
		{
			System.out.println(input + " is a Palindrome");
		}
		else
		{
			System.out.println(input + " is not a Palindrome");
		}
	}
}
