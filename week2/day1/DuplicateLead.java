package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//login
		WebElement findElement = driver.findElement(By.id(("username")));
		findElement.sendKeys("DemoSalesManager");
		driver.findElement(By.id(("password"))).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//cmpname_firstname_lastmname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Auxilia");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JA");
		driver.findElement(By.name("departmentName")).sendKeys("finance");
		driver.findElement(By.name("description")).sendKeys("this employee is in finance Team");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JA@goomail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Page Title  " + driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement cmpname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpname.clear();
		cmpname.sendKeys("google1");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("jack");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page Title after duplicate  " + driver.getTitle());
	}

}
