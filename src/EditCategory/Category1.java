package EditCategory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BaseCode.BaseGeneric;
@Test

public class Category1 extends BaseGeneric {
	WebDriver driver;
   private WebElement category;
 
  
   public Category1(WebDriver driver) throws InterruptedException {
	   this.driver=driver;
	   category=driver.findElement(By.xpath(".//div[@class='dropdown'][1]"));
   }
 
   @AfterTest
   public void clickOnCategory() {
	   category.click();
   }
 

   
}
