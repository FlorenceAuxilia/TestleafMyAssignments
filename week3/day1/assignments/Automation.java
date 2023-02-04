package week3.day1.assignments;

public class Automation implements TestTool  {

	
	public void ruby()
	{
		System.out.println("Ruby");
	}
		@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}
		@Override
		public void Java() {
			// TODO Auto-generated method stub
			System.out.println("JAva");
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Automation a= new Automation();
			a.ruby();
			a.Selenium();
			a.Java();
		}
		

}
