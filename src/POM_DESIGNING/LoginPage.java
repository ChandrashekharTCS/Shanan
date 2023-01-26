package POM_DESIGNING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginbtn;
	//use constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//this is used to initialize current variable
	}
	//getters & setters
	public void enterUn() {
		un.sendKeys("admin");
		
	}
	public void enterPwd() {
		pwd.sendKeys("manager");
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}
	
}
