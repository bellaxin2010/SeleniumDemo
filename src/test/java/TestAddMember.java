import Framework.BasePage;
import Framework.Login;
import PageObjects.ContactPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAddMember {

	public WebDriver driver;

	@BeforeClass
	public void setUp() throws IOException {

	}

	@Test
	public void testAddMember() throws IOException {

		Login login=new Login();
		login.loginWithCookie();
//		driver = login.driver;
		ContactPage contactPage = new ContactPage(login.driver);

		contactPage.addMember("bella","88999111","15544440000");

	}
}
