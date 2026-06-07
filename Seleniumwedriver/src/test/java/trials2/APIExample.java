package trials2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class APIExample {

		public static void main (String[] args) throws InterruptedException {
//			# 1. Launch Chrome browser.
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
//			# 2. Launch the URL "http://demowebshop.tricentis.com/"
			driver.get("http://demowebshop.tricentis.com/");
			Thread.sleep(1000);
			
//			# 3. Performing Page down action by 'actions.send_keys(Keys.PAGE_DOWN).perform()' method.
			Actions act = new Actions(driver);
			
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(1000);
//			# 4. Performing Page Up action.
			act.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(1000);
//			# 5. Again, performing Page-down action
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(1000);
//			# 6. Perform Arrow Up action.
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
//			# 7. Perform Arrow Down action.
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
//			# 8. Perform Page Up action.
			act.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(1000);
//			# 9. Perform, pressing the TAB key action multiple times till you reach to 'register' link.		
			for(int i=0; i<2 ; i++) {
				act.sendKeys(Keys.TAB).perform();
				Thread.sleep(1000);
			}
//			# 10. Perform, pressing ENTER key action. This action will take us to the registration page.
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
			
//			# 11. Perform, Page END action.
			act.sendKeys(Keys.END).perform();
			Thread.sleep(1000);
//			# 12. Perform, pressing TAB key action.
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
//			# 13. Perform, pressing Escape key action.
			act.sendKeys(Keys.ESCAPE).perform();
			Thread.sleep(1000);
//			# 14. Perform keys.END action.
			act.sendKeys(Keys.END).perform();
			Thread.sleep(1000);
//			# 15. Perform keys.UP action.
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
//			# 16. Perform, browser back action.
			driver.navigate().back();
			Thread.sleep(1000);
//			# 17. Print "Action Completed Successfully"
			System.out.println("Action Completed Successfully");
//			# 18. Close the browser.
			driver.close();
		}


	}


