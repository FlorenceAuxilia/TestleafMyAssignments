package week3.day1.assignments;

public class Students {
	//Method Overloading
	public void getStudentInfo(int id)
	{
		System.out.println("ID: "+ id +"Name:Ram");
		
	}
	
	public void getStudentInfo(String email) {
		System.out.println("email and phne"+ email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(011);
		s.getStudentInfo("auxilia06@gmail.com");
	}

}
