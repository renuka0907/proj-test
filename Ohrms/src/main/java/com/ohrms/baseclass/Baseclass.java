package com.ohrms.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass() throws IOException{
		prop =new Properties();
		FileInputStream fip= new FileInputStream("D:\\eclipse-workspace\\Ohrms\\src\\main\\java\\com\\ohrms\\config\\config.properties");
		prop.load(fip);
		
	}
	
	public void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}

}
