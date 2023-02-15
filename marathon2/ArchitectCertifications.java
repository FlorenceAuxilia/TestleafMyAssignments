package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 1.Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		// Login with username as "hari.radhakrishnan@qeagle.com" and password as
		// "Leaf@123"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		// 3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()=\"Learn More\"]")).click();

		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));

		Thread.sleep(3000);
		// 4. Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		// 5. Click Learning (inside shadow root)
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();

		// 6. And mouse hover on Learning On Trailhead.
		WebElement shaEle = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions action = new Actions(driver);
		action.moveToElement(shaEle).perform();

		// 7.Clilck on Salesforce Certifications
		WebElement shacert = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", shacert);

		// 8. Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class=\"roleMenu-item_text\"])[2]")).click();

		Thread.sleep(3000);
		// 9. Get the Text(Summary) of Salesforce Architect
		WebElement findElement = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
	    System.out.println(findElement.getText());

		// 10.Get the List of Salesforce Architect Certifications Available

		List<WebElement> findElements = driver.findElements(By.className("credentials-card_title"));

		for (int i = 0; i < findElements.size(); i++) {

			System.out.println(findElements.get(i).getText());
		}

		// 11.Click on Application Architect
		driver.findElement(By.xpath("//a[text()=\"Application Architect\"]")).click();

		// 12.Get the List of Certifications available
		findElements = driver.findElements(By.className("credentials-card_title"));

		for (int i = 0; i < findElements.size(); i++) {

			System.out.println(findElements.get(i).getText());
		}
		
		//scroll down and take snapshot
		WebElement admin = driver.findElement(By.xpath("(//div[@class='credentials-card_title'])[4]"));
		action.moveToElement(admin).perform();
		//13.Take a snapshot of Ceritificate
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1=new File("./snaps/output.png");
		FileUtils.copyFile(source1, target1);
		
		//close Window
		driver.quit()
	}

}
