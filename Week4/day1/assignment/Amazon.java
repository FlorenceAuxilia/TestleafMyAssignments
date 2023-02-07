package Week4.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();

		Set<String> wHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(wHandles);
		driver.switchTo().window(newWindow.get(1));

		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./snaps/output.png");
		FileUtils.copyFile(source1, target1);
		driver.findElement(By.id("add-to-cart-button")).click();
		String phonePrice = driver.findElement(By.className("a-price-whole")).getText();

		if (price.equalsIgnoreCase(phonePrice)) {
			System.out.println("Phone price is same " + phonePrice);
		} else {
			System.out.println("Phone price is not same " + phonePrice);
		}

		driver.quit();
	}
}
