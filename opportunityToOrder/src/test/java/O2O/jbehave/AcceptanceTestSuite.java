package O2O.jbehave;

import O2O.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptanceTestSuite  {
	
	public AcceptanceTestSuite() {
		
		WebDriverConfigurer.configureDrivers();
		
		/*DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "chrome");
	    caps.setCapability("browser_version", "39.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "7");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("browserstack.debug", "true");*/
		
		}
}
