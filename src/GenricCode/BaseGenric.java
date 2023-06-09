package GenricCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseGenric implements Utility {
	public static String readData(String Keyname) {
		Properties p= new Properties();
		try {
			p.load(new FileInputStream("../Ecommerce/Ecommerce.properties"));
		}catch (IOException e) {
			// TODO: handle exception
		}
		String data = p.getProperty(Keyname);
		return data;
	}
		

}
