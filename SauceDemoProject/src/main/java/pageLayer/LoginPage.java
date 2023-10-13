package pageLayer;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		WebDriver driver;
		public LoginPage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//input[@id='user-name']")
		private WebElement username_txtbox;
		@FindBy(xpath = "//input[@id='password']")
		private WebElement password_txtbox;
		@FindBy(xpath = "//input[@id='login-button']")
		private WebElement login_btn;
		
		public void enterusername(String username) {
			username_txtbox.sendKeys(username);
		}
		public void enterpassword(String password) {
			password_txtbox.sendKeys(password);
		}
		public void clickonloginbtn() {
			login_btn.click();
		}
		public String getCurl() {
			String url = driver.getCurrentUrl();
			return url;
		}
		

	}

