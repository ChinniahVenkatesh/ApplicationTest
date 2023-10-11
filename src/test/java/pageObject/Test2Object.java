package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonUtils.PropertiesFile;

public class Test2Object {
	
	public WebDriver driver;
	Properties prop = new Properties();
	
	public Test2Object(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement email() throws IOException
	{
		String path = "C:\\Users\\chinn\\OneDrive\\Desktop\\Week_Day_Batch_Aug\\Application_Test\\src\\test\\java\\testData\\Register.properties";
		PropertiesFile pf = new PropertiesFile();
		Object Email = pf.propertiesdata(path,"Email");
		System.out.println(Email);
		return driver.findElement(By.id((String) Email));
	}

	
}
