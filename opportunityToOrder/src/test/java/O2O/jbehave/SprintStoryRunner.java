package O2O.jbehave;


import O2O.utils.*;
import net.thucydides.jbehave.ThucydidesJUnitStories;

/**
 * @author srinivasa.kuncha
 */
public class SprintStoryRunner extends ThucydidesJUnitStories {
	
	private static final String STORY_NAME_PATTERN = "**/${jbehave.story.name:*}.story";
	
	public SprintStoryRunner() {
		
		WebDriverConfigurer.configureDrivers();
		findStoriesCalled(storyNamesFromEnvironmentVariable());
		
//		findStoriesCalled("Test in Development.story");
//		 findStoriesCalled("Opportunity To Order Smoke Tests.story");
		// findStoriesCalled("Advertiser Scenarios.story");
//		 findStoriesCalled("Opportunity To Digital.story");
		// findStoriesCalled("Campaign To Opportunity.story");
	}

	@Override
	public void run() throws Throwable {
		super.run();
	}

	private String storyNamesFromEnvironmentVariable() {
		return SystemPropertyUtils.resolvePlaceholders(STORY_NAME_PATTERN);

	}
}
