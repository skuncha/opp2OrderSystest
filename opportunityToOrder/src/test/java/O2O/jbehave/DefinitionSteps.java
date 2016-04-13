package O2O.jbehave;

import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import O2O.steps.EndUserSteps;

/**
 * @author srinivasa.kuncha
 *
 */
public class DefinitionSteps {

    @Steps
    EndUserSteps salesExecutive;
    
    
    @Given("Sales Executive is on the Salesfoce Login Page")
    public void homepage(){
    	salesExecutive.accesshomepage();
    }
    
    @When(" Sales Executive login to glue with valid credentials")
    public void userCredentials()
    {
    	salesExecutive.supplyCredentialsToLogin();
    }
    
    @When(" Sales Executive login to glue with digital user credentials")
    public void digitalUserCredentials()
    {
    	salesExecutive.digitalUserCredentialsToLogin();
    }
    
    
    
    @When(" Sales Executive set debug log on")
    public void debuglog(){
    	salesExecutive.setDebugLog();
    }
 /*   @When("Sales Executive verify debug log")
    public void verifydebuglog() throws Exception{
    	salesExecutive.verifydebuglog();
    }*/
    
    @Then(" Sales Executive should be able to login to glue successfully")
    public void successfulLogin(){
    	salesExecutive.isLoginSuccessful();
    }
    
    @When("  Sales Executive clicks on 'Accounts' Tab on glue Home page")
    public void clickOnAccountsTabOnHomePage(){
    	salesExecutive.clickOnAccountTab();
    }
    
    @When("  Sales Executive navigate to Opportunity page")
    public void navigateToOpportunityPage(){
    	salesExecutive.accessOpportunityPage();
    }
    
    @When("  Sales Executive search for an account on Account Search Screen using $searchAccountName")
    public void clickOnSearchButtonFromAccountsSearchScreen(String searchAccountName){
    	salesExecutive.searchForCustomerPreviousAccount(searchAccountName);
    }
    
    @When("  Sales Executive clicks on 'NewAccount' button from search results section")
    public void clickOnNewAccountButtonUnderSearchResults(){
    	salesExecutive.clickOnNewBtnUnderSerachResults();
    }
    
    @When(" Sales Executive selects record type as '$Advertiser' and clicks on 'Continue' button")
    public void clickOnContinueButtonUnderRecrodTypeSection(String Advertiser)
    {
    	salesExecutive.selectRecrodType(Advertiser);
    }
    @When(" Sales Executive supply input as required to create customer account:$AccountTable")
    public void supplyInputValuesToCustomerNewAccount(ExamplesTable AccountTable){
    	Map<String, String> adviserMandValues = new HashMap<String, String>();
		for (Map<String, String> row : AccountTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			adviserMandValues.put(fieldName, fieldValue);
		}
		salesExecutive.supplyMandatoryFieldsForAdviserAccount(adviserMandValues);
    }
    @When("  Sales Executive clicks on 'Save' button")
    public void clickOnSaveButton(){
    	salesExecutive.saveCustomerRecrod();
    }
    @Then("Sales Executive should be able to create new customer account successfully")
    public void customerRecrodShouldBeCreatedSuccessfully(){
    	salesExecutive.recrodShouldBeCreatedSuccessfully();
    }
    @When("Sales Executive makes Booking Agency association with client")
    public void associateAgency(){
    	salesExecutive.associateBookingAgency();
    }
    @Then("Sales Executive should be able to create Agency association with client successfully")
    public void associationSuccessfull(){
    	
    }
    @When("Sales Executive clicks on 'new Contact' button to create contact record for customer:$ContactTable")
    public void createContactforCustomer(ExamplesTable ContactTable){
    	Map<String, String> contactMandValues = new HashMap<String, String>();
		for (Map<String, String> row : ContactTable.getRows()) {
			String fieldName = row.get("ElementName");
			String fieldValue = row.get("ElementValue");
			contactMandValues.put(fieldName, fieldValue);
		}
		salesExecutive.createNewContact(contactMandValues);
    }
    @Then("Sales Executive should be able to create contact successfully")
    public void contactRecordshouldBeCreatedSuccessfully(){
    	salesExecutive.isContactRecrodCreated();
    }
    @When("Sales Executive clicks on edit button to create Industry Category")
	public void editIndustryCategory(){
    	salesExecutive.editIndustryCategory();
	}
	@When("  Sales Executive supply input for $mainCategory, $subCategory and $minorCategory")
	public void selectCategoryValues(String mainCategory, String subCategory, String minorCategory){
		salesExecutive.selectCategoryValues(mainCategory, subCategory, minorCategory);
	}
	@When("  Sales Executive clicks on Save button")
	public void createIndustryCategory(){
		salesExecutive.createIndustryCategory();
	}
	@When("Sales Executive integrates customer account with CCI")
	public void linkBookingAgencyAccountWithCCI() {
		salesExecutive.linkBookingAgencyAccountWithCCIMail();
	}
	@When("  Sales Executive clicks on a record under Account Mapping Tab")
	public void clickOnAccountMapping() {
		salesExecutive.accessAccountMapping();
	}
	@Then("Sales Executive should see customer account mapping details returned from CCI when verified")
	public void checkAccountMapping() {
		salesExecutive.validateAccountMappingDetails();
	}	
	@When("Sales Executive clicks on a record under Finance Account Tab")
	public void clickOnFinanceAccount() {
		salesExecutive.accessFinanceAccount();
	}
	@Then("Sales Executive should see finance account details")
	public void checkFinanceAccountDetails(){
		salesExecutive.checkFinanceAccountDetails();
	}
	@When("Sales Executive clicks on 'Opportunity To Order' link to create Opportunity")
	public void clickOnOpportunityToOrderButton(){
		salesExecutive.clickOnOpportunityToOrder();
	}
	@When(" Sales Executive supplies input data from CSV $file to create Opportunity")
	public void supplyInputForOpportunity(String file) throws Exception{
		salesExecutive.supplyInputForNewOpportunity(file);
	}
	@Then("Sales Executive should be able to create Opportunity successfully")
	public void verifyOppotunityRecord(){
		salesExecutive.validateOppotunityRecord();
	}
	@When("Sales Executive clicks on 'New Opportunity Line' button to create Opportunity line")
	public void clickOnNewOpportunityLineButton(){
		salesExecutive.clickOnNewOpportunityLine();
	}
	@When("Sales Executive clicks on 'Add Classified Products' button to create Opportunity line")
	public void addClassifiedProductsToCreateOppLine(){
		salesExecutive.clickOnAddClassifiedProducts();
	}
	@When(" Sales Executive supplies input data from CSV $file to create Opportunity Line")
	public void supplyInputForNewOpportunityLine(String file) throws Exception{
		salesExecutive.supplyInputForNewOpportunityLine(file);
	}
	@When(" Sales Executive supplies input data from CSV $file1 to create multiple Opportunity Line")
	public void supplyInputToCreateMultipleOppLines(String file1) throws Exception{
		salesExecutive.creaetMultipleOppLines(file1);
	}

	@When(" Sales Executive supplies input data from CSV $file to create Classified Opportunity Line")
	public void supplyInputForNewClassifiedOppLine(String file) throws Exception{
		salesExecutive.supplyInputToCreateClassfiedOppLine(file);
	}
	@Then("Sales Executive should be able to create Opportunity Line successfully")
	public void verifyOppotunityLineRecord(){
		salesExecutive.validateOppotunityLineRecord();
	}
	@Then("Sales Executive should be able to create Classifed Opportunity Line successfully")
	public void saveClassifiedOppLine(){
		salesExecutive.saveAndValidateClassifedOppotunityLine();
	}
	@When("Sales Executive choose to edit opplines")
		public void editOppLine(){
			salesExecutive.editOppLines();
	}
	@Then("Sales Executive should be able to edit successfully successfully")
		public void verifychanges(){
			salesExecutive.oppLinesShouldBeUpdatedSuccessfully();
	}
	@When("Sales Executive wish to deactivate Oppline")
	public void deactivateOpportunityLine(){
		salesExecutive.deactivateOppLine();
	}
	
	@Then("Sales Executive should be able to deactivate Oppline successfully")
	public void opportunityLineShouldBeDeactivatedSuccessfully(){
		salesExecutive.oppLineDeactivateSuccessfully();
	}
	@When("Sales Executive selects 'Opportunity Line(s)' to be converted as an Order")
	public void selectOpportunityLineThatNeedsToBeConverted(){
		salesExecutive.selectOpportunityLine();
	}
	@When("Sales Executive selects multiple packages to be converted as an Order")
	public void selectMultiplePackagesToBeConvertedAsAnOrder(){
		salesExecutive.selectMultiplePackages();
	}
	
	@Then("Sales Executive should be able to open Order plugin with Opportunity Line details successfully")
	public void clickOnConvertButton(){
		salesExecutive.convertSelectedOpportunityLines();
	}
	@When("When Sales Executive wish to cancel Order line")
	public void clickOncancelOrderLine(){
		salesExecutive.cancelOrderLine();
	}
	@Then("Sales Executive should see line status as cancelled and price on it becomes zero")
	public void rrderLineShouldBeCancelledSuccessfully(){
		salesExecutive.orderLineShouldBeCancelled();
	}
	@When("Sales Executive clicks on 'New Account Mapping' link and creates accoutMapping")
	public void newAccountMappingWithSourceSystemInformation(){
		salesExecutive.createAccountMapping();
	}
	
	@When("Sales Executive clicks on 'Add Digital Products' button to create Digital Lines")
	public void clickOnNewDigitalLineButton(){
		salesExecutive.createDigitalLines();
	}
	@When(" Sales Executive supplies input to create Digital Lines")
	public void selectDigitalLines() {
		salesExecutive.selectDigitalLines();
	}
	@Then("Sales Executive should be able to create Digital Lines successfully")
	public void verifyDigitalLineRecord(){
		salesExecutive.validateDigitalLineRecord();
	}

	@Then("Sales Executive should be able to update line description on the Digital Line")
	public void updateDigitalLines(){
		salesExecutive.editExitingDigitalLines();
	}
	@Then("Sales Executive should be able to create new line using copy functionality")
	public void createNewLineUsingCopyFunction(){
		salesExecutive.copyNewLineAndSave();
	}
	
	@Then("Sales Executive should be able to copydates on '$NoOfLines' new lines copied from existing line")
	public void copyDatesOnAllLines(int NoOfLines){
		salesExecutive.copyDates(NoOfLines);
	}
	
	@Then("Sales Executive should be able to deactivate Digital Line")
	public void DeactivateDigitalLine(){
		salesExecutive.cancelDigitalLine();
	}
	
	@Then("Sales Executive selects the Digital Line and create new Opportunity using those lines")
	public void createOppportunityFromSelectDigitalLine(){
		salesExecutive.createOpppUsingExistingDigitalLine();
	}
	
	@When("Sales Executive should be able to changes opportunity stage as Close Won and save")
	public void changeOppStageAsClosedWon(){
		salesExecutive.changeOppStage();
	}
	@Then("Sales Executive should see opportunity stage changed to Closed Won successfully")
	public void oppStageShouldChangedToClosedWon(){
		salesExecutive.oppStageShouldBeChanged();
	}
	@When("Sales Executive should be able to changes opportunity stage as Close Lost and save")
	public void changeOppStageAsClosedLost(){
		salesExecutive.changeOppStageToClosedLost();
	}
	@Then("Sales Executive should see opportunity stage changed to Closed Lost successfully")
	public void oppStageShouldChangedToClosedLost(){
		salesExecutive.oppStageShouldBeChangedAsClosedLost();
	}
	@Then("Sales Executive should be shown error message as $error when try to add new digital line")
	public void errorMessage(String error){
		salesExecutive.errorMessageAsExpected(error);
	}
}