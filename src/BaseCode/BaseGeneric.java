package BaseCode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseGeneric {
	WebDriver driver;

	@Parameters("browsername")
	@BeforeClass

	public void openBrowser(String browsername) {
		if (browsername.equals("Firefox")) {
			driver= new FirefoxDriver();
			
			
		}else if (browsername.equals("Chrome")) {
			driver=new ChromeDriver();
			
		}else {
			driver= new EdgeDriver();
		}
	}
	
	@BeforeMethod
	public void OpenApp() {
		driver.get("https://adminlm.onrender.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
		@AfterMethod
	public void testMethodExecutionResult(ITestResult result) {
		String methodName=result.getName();
		if (result.getStatus()==1) {
			Reporter.log(methodName+"execution is passed,true");
		}else {
			Reporter.log(methodName+"execution is failed,true");
		}	

	}
}
