package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logintest1 
{
	
	private WebElement username;
	private WebElement password;
	private WebElement loginBtn;

	
	
	public logintest1(WebDriver driver){
		username=driver.findElement(By.name("username"));
		password=driver.findElement(By.name("password"));
		loginBtn=driver.findElement(By.xpath(".//button[text()='LOGIN']"));
		
		
	}
	public void setUn(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
	}
	public void clkOnLoginBtn() {
		loginBtn.click();
	}
	
}
