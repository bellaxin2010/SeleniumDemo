import Framework.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import java.io.IOException;

public class TestLogin {

	public static WebDriver driver;


	@BeforeClass
	public void setUp() {

	}

	@Test
	public TestLogin() throws IOException {
		Login login = new Login();
		login.loginWithCookie();

		System.out.println("test login");
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
