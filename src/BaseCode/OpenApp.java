
package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OpenApp extends BaseGeneric
{
	@Test
	  public void loginApp() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Username/Email']")).sendKeys("admin07");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	
		
			
	Catgeory c= new Catgeory(driver);
	c.clickon();
		}
}
	


