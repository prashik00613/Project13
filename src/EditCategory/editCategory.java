package EditCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import BaseCode.BaseGeneric;
@Test

public class editCategory extends BaseGeneric{
	
	private WebElement ClickOnCategory;
	private WebElement ClkOnAddCategory;
	private WebElement selectList;
	private WebElement addCategory;
	
	public void clickcategory(WebDriver driver) {
		ClickOnCategory=driver.findElement(By.xpath(".//div[@class='dropdown'][1]"));
	}
	
	public void AddCategory(WebDriver driver) {
		ClkOnAddCategory=driver.findElement(By.xpath("//div[normalize-space()='Add Category']"));
		//selectList=driver.findElement(By.xpath("(//select[@name='category'])[1]"));
	}
		//public void selectchkbox(WebDriver driver) {
			//selectList=driver.findElement(By.xpath("(//select[@name='category'])[1]"));
		//}
	@AfterClass
	public void clickOnCcategory() {
		ClickOnCategory.click();
	}
		public void Add_Category(WebDriver driver) {
			addCategory=driver.findElement(By.xpath("(//input[@name='newcategory'])[1]"));
		}
		
	
	//public void selectchkbox() {
		//selectList.click();
	//}
	//public void ClickOnEditi() {
	//	ClkOnEditCategory.click();
//	}
}
