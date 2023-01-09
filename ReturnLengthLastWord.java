package challenges;

public class ReturnLengthLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="luffy is still joyboy";
		String [] textArray = s.split(" ");
		String rev = "";
		
		int length=textArray.length;
		
		String b =textArray[length-1];
		
		char[] finalword=b.toCharArray();
		
		for (int i = finalword.length - 1; i >= 0; i--) {
			rev = rev + finalword[i];
		}
		System.out.println(rev);			

	}

}
