package BaseCode;

import org.testng.annotations.Test;

import LoginPage.logintest1;

public class OpenApp extends BaseGeneric{
	@Test
	  public void loginApp() {
			logintest1 t1=new logintest1(driver);
			t1.setValue("admin07","test1234");
			t1.clkOnLoginBtn();
			}
}
