package EditCategory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Category1 {
   private WebElement category;
 
   
   
   public Category1(WebDriver driver) throws InterruptedException {
	   category=driver.findElement(By.xpath(".//div[@class='dropdown'][1]"));
   }
 
   
   public void clickOnCategory() {
	   category.click();
   }
 

   
}
