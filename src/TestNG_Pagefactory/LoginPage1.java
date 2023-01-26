package TestNG_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginbtn;
	//use constructor
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);//this is used to initialize current variable
	}
	//getters & setters
	public void enterUn(String username) {
		un.sendKeys(username);
		
	}
	public void enterPwd(String password) {
		pwd.sendKeys(password);
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}
	

}
