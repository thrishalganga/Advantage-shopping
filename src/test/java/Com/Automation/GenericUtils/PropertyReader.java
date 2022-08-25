package Com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
static Properties prop = new Properties();
	
	public static void initProperty() throws FileNotFoundException, IOException {
		prop.load(new FileInputStream("C:\\Users\\thrishal.g\\eclipse-workspace\\AdvantageShoppingcucumber\\src\\test\\resources\\Config\\Config.properties"));
	}
	
	public static String get(String str)
	{
		return prop.getProperty(str);
	}


}
