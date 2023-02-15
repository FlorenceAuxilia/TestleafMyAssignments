package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.sukgu.Shadow;

public class ServiceNowOrderingMobile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 1. Launch ServiceNow application
		driver.get("https://dev57553.service-now.com/");
		//2. Login with valid credentials username as admin and password as 5$dJ*EFdhhW0
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("5$dJ*EFdhhW0");
		driver.findElement(By.id("sysverb_login")).click();
		
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//4. Click on  mobiles
		WebElement mobileEle = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(mobileEle);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//5. Select Apple iphone6s
		driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
		
		//6. Update color field to gold and storage field to 128GB
		WebElement selectElement = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select color=new Select(selectElement);
		color.selectByVisibleText("Gold");
		
		selectElement=driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select storage=new Select(selectElement);
		storage.selectByVisibleText("128");
		
		//7. Select  Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
		//8. Verify order is placed and copy the request number"
		String text = driver.findElement(By.xpath("//div[@class='notification notification-success']/span")).getText();
		
		if(text.contains("request has been submitted"))
		{
			System.out.println("order has been placed");
		}
		else
		{
			System.out.println("order has not been placed");
		}
		
		String reqNumber = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request number is "+reqNumber);
		
		//9. Take a snapshot of Order Status
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target1=new File("./snaps/output.png");
		FileUtils.copyFile(screenshotAs, target1);
		
		//close window
		driver.quit();
	}

}
