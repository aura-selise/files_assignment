package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Properties Sendkeys = new Properties();
	public static FileInputStream key;
	
	
	@BeforeSuite
	public void di() throws IOException {
	
	
		if (driver==null){ {
			
			
			 fis = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\practice_file\\src\\test\\resources\\Properties\\OR.properties");
			 OR.load(fis);
			
		}
		
		if (driver==null) {
			key = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\practice_file\\src\\test\\resources\\Properties\\Sendkeys.properties");
			 Sendkeys.load(key);
		}
	}
		
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
	}

}


