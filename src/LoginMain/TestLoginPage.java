package LoginMain;

import java.util.Locale.Category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import EditCategory.Add_Category;
import EditCategory.Category1;
import LoginPage.logintest1;

public class TestLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://adminlm.onrender.com/");
		
		logintest1 ln= new logintest1(driver);
		ln.setUn("admin07", "test1234");
		ln.clkOnLoginBtn();
		Thread.sleep(8000);

		Category1 c= new Category1(driver);
		c.clickOnCategory();
		
		Thread.sleep(6000);
		Add_Category c1= new Add_Category(driver);
		c1.clikonAdd_category();
		//c1.EnterCategoryName("abcd");
		
		
	}

}
