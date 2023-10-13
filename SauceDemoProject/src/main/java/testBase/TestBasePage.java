package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBasePage {
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		String br= "Chrome";
		if(br.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		else{
			System.out.println("Provid valid browser name");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
