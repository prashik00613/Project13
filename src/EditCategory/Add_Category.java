package EditCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Add_Category {
		private WebElement addCategory;
		private WebElement SelectChkBox;
	
		
		
		public Add_Category(WebDriver driver) {
			addCategory=driver.findElement(By.xpath("//a[@href='/dashboard/addcategory']"));
			SelectChkBox=driver.findElement(By.xpath("(//input[@name='category'])[1]"));
		}
		public void clikonAdd_category() {
			addCategory.click();
		}
	
		public void EnterCategoryName(String un) {
			SelectChkBox.sendKeys(un);
		}
	}
