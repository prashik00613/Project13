package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class LoginTest1 extends BaseGeneric {
	
			private WebElement username;
			private WebElement password;
			private WebElement loginBtn;
			
			public LoginTest1(WebDriver driver) {
				username=driver.findElement(By.xpath("//input[@placeholder='Enter Username/Email']"));		
				password=driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
				loginBtn=driver.findElement(By.xpath("//button[text()='LOGIN']"));
			}
			public WebElement getUsername() {
				return username;
			}
			public void setUsername(WebElement username) {
				this.username = username;
			}
			public WebElement getPassword() {
				return password;
			}
			public void setPassword(WebElement password) {
				this.password = password;
			}
			public WebElement getLoginBtn() {
				return loginBtn;
			}
			public void setLoginBtn(WebElement loginBtn) {
				this.loginBtn = loginBtn;
			}
			public void setValue(String user,String pwd) {
				username.sendKeys(user);
				password.sendKeys(pwd);
			}
			public void clkOnLoginBtn() {
				loginBtn.click();
			}
	

			
}
