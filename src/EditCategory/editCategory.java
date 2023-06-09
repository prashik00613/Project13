package EditCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class editCategory {
	private WebElement ClickOnCategory;
	private WebElement ClkOnEditCategory;
	private WebElement selectList;
	private WebElement addCategory;
	public void clickcategory(WebDriver driver) {
		ClickOnCategory=driver.findElement(By.xpath(".//div[@class='dropdown'][1]"));
	}
	
	public void editCategory(WebDriver driver) {
		ClkOnEditCategory=driver.findElement(By.xpath("//div[normalize-space()='Edit Category']"));
		selectList=driver.findElement(By.xpath("(//select[@name='category'])[1]"));
	}
		public void selectchkbox(WebDriver driver) {
			selectList=driver.findElement(By.xpath("(//select[@name='category'])[1]"));
		}
		
		public void AddCategory(WebDriver driver) {
			addCategory=driver.findElement(By.xpath("(//input[@name='newcategory'])[1]"));
		}
		public void clickOnCcategory() {
			ClickOnCategory.click();
		}
	
	public void selectchkbox() {
		selectList.click();
	}
	public void ClickOnEditi() {
		ClkOnEditCategory.click();
	}
}
