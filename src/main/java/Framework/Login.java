package Framework;


import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Login
 *
 * @blame bella Team
 */
public class Login {

	@FindBy(className = "index_top_operation_loginBtn")
	public WebElement loginButton;
	public WebDriver driver;


	public void clickLogin(WebElement element){
		try{
			if(element.isEnabled()){
				element.click();
				System.out.println("click ");
			}
		}catch (Exception e){
			Logger.getLogger("exception "+e.getMessage()
			);
		}
	}

	public Login loginWithCookie() throws IOException {

		Browser browser = new Browser();
		browser.initConfig();
		driver = browser.getBrowser();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		//点击 企业登录
		PageFactory.initElements(driver,this);
		clickLogin(loginButton);
		System.out.println("click success");
		driver.manage().addCookie(new Cookie("wwrtx.sid","D233h0qyWWEdnKx0b7L41_VhXjZxpRRcSKycVk8ZktCaMgtrRwsg7697V9MFIy71"));
		driver.manage().addCookie(new Cookie("wwrtx.refid","5134804021114109"));
		driver.navigate().refresh();
		return this;

	}
}
