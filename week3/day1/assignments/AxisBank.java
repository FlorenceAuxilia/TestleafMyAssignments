package week3.day1.assignments;

public class AxisBank extends Bankinfo{
	//method override depoist is tere in Bankinfo
	public void deposit()
	{
		System.out.println("Deposit AxisBank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		Bankinfo bi=new Bankinfo();
		bi.deposit();
		ab.deposit();
		
	}

}
