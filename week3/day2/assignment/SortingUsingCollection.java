package week3.day2.assignment;
// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// get the length of the array		

// sort the array			

// Iterate it in the reverse order

// print the array
	
// Required Output: Wipro, HCL , CTS, Aspire Systems

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> company = new ArrayList<String>();
		company.add("Wipro");
		company.add("CTS");
		company.add("HCL");
		company.add("Aspire System");
		
		System.out.println(company.size());
		
		Collections.sort(company);
		//System.out.println(company);
		
		Collections.reverse(company);
		System.out.println(company);
		
	}

}
