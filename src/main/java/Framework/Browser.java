package Framework;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser {


	public String browserName;
	public String serverUrl;
	public WebDriver driver;


	// init config

	public void initConfig() throws IOException {

		Properties properties = new Properties();
		// 加载配置文件
		InputStream inputStream = new FileInputStream(".\\src\\config.properties");
		properties.load(inputStream);
		browserName = properties.getProperty("browserName");
		serverUrl = properties.getProperty("serverUrl");

	}

	//getBrowser

	public WebDriver getBrowser(){

		if("Chrome".equalsIgnoreCase(browserName)){
			System.setProperty("webdriver.chrome.driver",".\\src\\tool\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(" Lanuching chrome ");
		}
		driver.get(serverUrl);
		System.out.println("url is " +serverUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		return driver;

	}


//	public void browserQuit() throws InterruptedException {
//		driver.quit();
//		System.out.println("browser quit..");
//		Thread.sleep(3000);
//	}



//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",".\\src\\tool\\chromedriver.exe");
//
//		//1.初始化
//		WebDriver webDriver = new ChromeDriver();
//
//		webDriver.manage().window().maximize();
//
//		webDriver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
//
//		webDriver.get("https://work.weixin.qq.com/");
//
//		webDriver.findElement(By.className("index_top_operation_loginBtn")).click();
//
//		webDriver.manage().addCookie(new Cookie("wwrtx.sid","D233h0qyWWEdnKx0b7L41wdCBHWespbHgMRbJ_ZhzfWdSaH5_wMznzwCEDkyxjWO"));
//
//		webDriver.navigate().refresh();
//
//
//
//	}
}
