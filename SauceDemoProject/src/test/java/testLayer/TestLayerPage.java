package testLayer;

	import org.testng.annotations.Test;

import pageLayer.LoginPage;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBasePage;

	public class TestLayerPage extends TestBasePage {
		@Test
		
		public void Loginwithvalidcred() {
			String expected_output ="https://www.saucedemo.com/inventory.html";
			LoginPage login_obj = new LoginPage(driver);
			login_obj.enterusername("standard_user");
			login_obj.enterpassword("secret_sauce");
			login_obj.clickonloginbtn();
			AssertJUnit.assertEquals(login_obj.getCurl(), expected_output);
		}
}
