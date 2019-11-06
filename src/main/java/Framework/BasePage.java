package Framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.ref.SoftReference;


/**
 * BasePage
 *
 * @blame bella
 */
public class BasePage {
//	public static WebDriver driver;

	public BasePage() {

	}

//	public WebDriver driver;

	protected void click(WebElement element){
		try {
			if(element.isEnabled()){
				element.click();
				System.out.println("Element is clicked "+ element);
			}
		}catch (Exception e){
			Logger.getLogger("exception is " +e.getMessage());
		}
	}


	protected void addCookies(String cookie){
		try {
			if(cookie!=null){
				addCookies(cookie);
				System.out.println("auth with cookie" + cookie);
			}
		}catch (Exception e){
			Logger.getLogger("exception is " +e.getMessage());
		}
	}

	protected void inputType(WebElement element, String text){

		try {

			if(element.isEnabled()){
				element.clear();
				System.out.println("not found");
				element.sendKeys(text);
			}
		}catch (Exception e){
			Logger.getLogger("exception is "+ e.getMessage());
		}
	}


	protected void clean(WebElement element){
		try{
			if(element.isEnabled()){
				element.clear();
				System.out.println("clean element");
			}
		}catch (Exception e){
			Logger.getLogger("exception is "+ e.getMessage());
		}
	}




	protected void elementIsVisible(WebElement element){
		try{
			if(element.isDisplayed()){
				System.out.println("Element is displayed " + element);
			}
		}catch (Exception e){
			Logger.getLogger("exception is "+ e.getMessage());
		}
	}

}
