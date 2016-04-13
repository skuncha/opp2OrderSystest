package O2O.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("https://test.salesforce.com/")
//@DefaultUrl("https://dmgsalescloud--systemtest.cs8.my.salesforce.com/")

public class loginPage extends PageObject {

	private WebElementFacade userid() 	{ return element(By.cssSelector("#username"));	}
	private WebElementFacade userpasswd() 	{ return element(By.cssSelector("#password"));	}
	private WebElementFacade loginbutton()  { return element(By.id("Login"));		}
    

	public void supplyCredentialsToLogin(String userName, String Password){
		
		waitFor(5).seconds();
		userid().click();
		System.out.println("User name is "+userName);
		userid().typeAndTab(userName);
		userpasswd().type(Password);
		waitFor(1).seconds();
		
	}
	public void submitLogin(){
		
		loginbutton().click();
		waitFor(10).seconds();
	}
	
}