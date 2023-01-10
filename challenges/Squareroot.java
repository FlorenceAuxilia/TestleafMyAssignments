package challenges;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=16;
		int temp;
		int sqroot =x/2;
				
		do 
		{
			temp=sqroot;
			sqroot =(temp+(x/temp))/2;
		}
		while ((temp-sqroot)!=0);
		
		System.out.println(sqroot);
	}

}
