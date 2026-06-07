package practicescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		   // 2. Launch Chrome browser
		   WebDriver driver = new ChromeDriver();
		   // 3. Maximize window
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   // 4. Launch URL
		   driver.get("http://demowebshop.tricentis.com/");
		   Thread.sleep(2000);
		   // 5. Insert text in the newsletter text box
		   driver.findElement(By.id("newsletter-email")).sendKeys("test.user@company.com");
		   Thread.sleep(2000);
		   // 6. Click on the subscribe button
		   driver.findElement(By.id("newsletter-subscribe-button")).click();
		   Thread.sleep(2000);
		   
		   driver.close();

	}

}
