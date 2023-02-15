package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		//Login with username as "hari.radhakrishnan@qeagle.com" and password as "Leaf@123"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()=\"Learn More\"]")).click();

		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));
		
		Thread.sleep(3000);
		//4. Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//5. Click Learning (inside shadow root)
		Shadow shadow = new Shadow(driver);
        shadow.findElementByXPath("//span[text()='Learning']").click();
        
        //6. And mouse hover on Learning On Trailhead.
        WebElement shaEle = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
        Actions action=new Actions(driver);
        action.moveToElement(shaEle).perform();
        
        //7.Clilck on Salesforce Certifications
        WebElement shacert = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
        driver.executeScript("arguments[0].click();", shacert);
        
        //8. Click on first resulting Ceritificate
        driver.findElement(By.className("roleMenu-item_text")).click();
        
        //verify - Administrator Overview page
        String pageTitle = driver.getTitle();
        //System.out.println(pageTitle);
        if(pageTitle.contains("Administrator Overview"))
        {
        	System.out.println("landed on correct page"+pageTitle);
        }
        else
        {
        	System.out.println("Page incorrect");
        }
		
        //10.Print the Certifications available for Administrator Certifications (List)

		List<WebElement> findElements = driver.findElements(By.className("credentials-card_title"));
		
		
		for (int i = 0; i < findElements.size(); i++) {
			
			System.out.println(findElements.get(i).getText());
		}
		
		//11.Take a snapshot of Ceritificate
		WebElement admin = driver.findElement(By.xpath("(//div[@class='credentials-card_title'])[4]"));
		action.moveToElement(admin).perform();
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1=new File("./snaps/output.png");
		FileUtils.copyFile(source1, target1);
		
		//close window
		driver.quit();
		
		
		
		
	}

}
