package PageObjects;

import Framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class ContactPage extends BasePage{

	@FindBy(id="menu_contacts")
	public WebElement contact;

	@FindBy(linkText = "添加成员")
	WebElement addMemberBtn;

	@FindBy(className="ww_compatibleTxt_ipt")
	WebElement userNameValue;

	@FindBy(id ="memberAdd_acctid")
	WebElement accountIdValue;

	@FindBy(name="mobile")
	WebElement addPhoneValue;

	@FindBy(linkText = "保存")
	WebElement clickSave;

	public WebDriver driver;


	public ContactPage(WebDriver driver){

		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	public void addMember(String userName , String accountID, String phone){

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click(contact);
		//点击 添加成员
		click(addMemberBtn);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//输入姓名
		inputType(userNameValue,userName);

		//输入账号
		inputType(accountIdValue,accountID );

		//输入手机号
		inputType(addPhoneValue, phone);

		//保存
		click(clickSave);

	}


}

