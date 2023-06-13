package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test

public class Catgeory extends BaseGeneric
{
	@FindBy(xpath=".//div[@class='dropdown'][1]")
	private WebElement category;
	
	public Catgeory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}

	public void clickon() {
		category.click();
	}
	
	
}
    