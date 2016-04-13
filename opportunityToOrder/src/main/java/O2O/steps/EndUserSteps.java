package O2O.steps;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import O2O.pages.accountsHomePage;
import O2O.pages.loginPage;
import O2O.pages.opportunityToClassified;
import O2O.pages.opportunityToDigital;
import O2O.pages.opportunityToOrderPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author srinivasa.kuncha
 *
 */
public class EndUserSteps extends ScenarioSteps {

	loginPage salesforceLoginPage;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> debugList = new ArrayList<String>();
	public static String AccountName;
	public static String Username, Password;
	public static String DUsername, DPassword;
	public static String CUsername, CPassword;

	public void SystestConfig() {

		try (FileReader SandBoxConfig = new FileReader("thucydides.properties")) {
			Properties prop = new Properties();
			prop.load(SandBoxConfig);
			Username = prop.getProperty("mailDisplayUsername");
			Password = prop.getProperty("mailDisplayPassword");
			DUsername = prop.getProperty("digitalUsername");
			DPassword = prop.getProperty("digitalPassword");
			CUsername = prop.getProperty("classifiedUsername");
			CPassword = prop.getProperty("classifiedPassword");

		} catch (Exception configFN) {
			configFN.printStackTrace();
		}
	}
	
	@Step
	public void accesshomepage() {

		salesforceLoginPage.open();
		waitFor(8).seconds();
		getDriver().manage().window().maximize();
		waitFor(2).seconds();
	}
	public void supplyCredentialsToLogin() {

		SystestConfig();
		loginPage sfLoginPage = getPages().get(loginPage.class);
		sfLoginPage.supplyCredentialsToLogin(Username, Password);
		sfLoginPage.submitLogin();
	}
	
	public void digitalUserCredentialsToLogin() {

		SystestConfig();
		loginPage sfLoginPage = getPages().get(loginPage.class);
		sfLoginPage.supplyCredentialsToLogin(DUsername, DPassword);
		sfLoginPage.submitLogin();
	}
	
	public void setDebugLog(){
		accountsHomePage homePage =getPages().get(accountsHomePage.class);
		homePage.setUserDebugLog();
	}
	/*public void verifydebuglog() throws Exception{
		accountsHomePage homePage =getPages().get(accountsHomePage.class);
		String view = homePage.verifyDebugLogdetails();
		debugList.add(view);
//		System.out.println("  Number of SOQL queries: "+debugList.get(0));
		sendEmail email =getPages().get(sendEmail.class);
		email.test(debugList.get(0));
	}*/

	/*** Verify title of Glue Home Page  ***/
	public void isLoginSuccessful() {
		loginPage sfLoginPage = getPages().get(loginPage.class);
		sfLoginPage.submitLogin();
		assertThat(getDriver().getTitle(),is(equalTo("salesforce.com - Unlimited Edition")));
	}
	/*** Verify title of Accounts Page  ***/
	public void clickOnAccountTab(){
		accountsHomePage homePage =getPages().get(accountsHomePage.class);
		homePage.accountTabOnHomePage();
		/*assertThat(getDriver().getTitle(),is(equalTo("Accounts: Home ~ salesforce.com - Unlimited Edition")));*/
		assertThat(getDriver().getTitle(),is(equalTo("Salesforce - Unlimited Edition")));
	}
	
	public void accessOpportunityPage(){
		accountsHomePage homePage =getPages().get(accountsHomePage.class);
		homePage.openOpportunityPage();
	}
	/*** Verify title of Search Customer Account Page  ***/
/*	public void clickOnNewBtnUnderAccountsTab(){
		accountsHomePage homePage =getPages().get(accountsHomePage.class);
		homePage.newButtonUnderAccountsTab();
//		assertThat(getDriver().getPageSource().contains("Please enter either Customer Name or Post Code to start Account Search."), is(true));		
	}*/
	
	public void searchForCustomerPreviousAccount(String accountName){
		accountsHomePage customerAccountSearch =getPages().get(accountsHomePage.class);
		customerAccountSearch.searchforcustomeraccount(accountName);
	}
	/*** Verify title of record Type selection Page  ***/
	public void clickOnNewBtnUnderSerachResults(){
		accountsHomePage customerAccountSearch =getPages().get(accountsHomePage.class);
		customerAccountSearch.clickOnNewBtnToCreateCustomerAccount();
		assertThat(getDriver().getTitle(),is(equalTo("New Account: Select Account Record Type ~ Salesforce - Unlimited Edition")));
	}
	
	public void selectRecrodType(String recordType){
		accountsHomePage typeOfAccount =getPages().get(accountsHomePage.class);
		typeOfAccount.selectRecrodTypeAndContinue(recordType);
	}
	
	public void supplyMandatoryFieldsForAdviserAccount(Map<String, String> adviserMandValues) {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.supplyMandatoryFieldsForAdviserAccount(adviserMandValues);
		AccountName = adviserMandValues.get("accountType");
		}
	public void saveCustomerRecrod(){
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.saveCustomerRecrod();
	}
	/*** Verify whether customer account is created or not  ***/
	public void recrodShouldBeCreatedSuccessfully(){
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		assertThat(accountsPage.isCustomerRecrodCreated(),not(equalTo(null)));
		list.clear();
		list.add(accountsPage.isCustomerRecrodCreated()); // 1. adding customer name to array list
	}
	
	public void associateBookingAgency(){
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.associateClientWithBookingAgency();
	}
	public void createNewContact(Map<String, String> contactMandValues) {
		accountsHomePage accountsPage = getPages().get(accountsHomePage.class);
		accountsPage.openNewContactPage();
		accountsPage.supplyMandatoryFieldsForContact(contactMandValues);
	}
	public void isContactRecrodCreated(){
		accountsHomePage accountsPage = getPages().get(accountsHomePage.class);
		String s = accountsPage.saveContactRecrod();
		assertThat(s,not(equalTo(null)));
		list.add(s); // 2. adding customer contact to array list
	}
	
	/*** Add Categories to customer account  ***/
	public void editIndustryCategory() {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.clickOneditIndustryCategory();
	}

	public void selectCategoryValues(String mainCategory, String subCategory,
			String minorCategory) {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.selectCategories(mainCategory,subCategory,minorCategory);
	}

	public void createIndustryCategory() {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.createIndustryCategory();
	}
	/*** Associate customer account with CCI  ***/
	public void linkBookingAgencyAccountWithCCIMail() {
		
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		accountsPage.createCCICustomerMail();
	}
	
	public void accessAccountMapping() {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		assertThat(accountsPage.isAccountMappingSuccessful(),is(true));
		accountsPage.accountMapping();
	}
	
	/*** Verify customer association is successful with CCI or not ****/
	public void validateAccountMappingDetails() {
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		assertThat(accountsPage.getCustomerRef(),is(true));
		getDriver().navigate().back();
	}
	
	public void accessFinanceAccount(){
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		assertThat(accountsPage.isFinaceAccountMappingSuccessful(),is(true));
		accountsPage.accessFinanceAccount();
	}
	/*** Verify customer finance account association with CCI is successful with CCI or not ****/
	public void checkFinanceAccountDetails(){
		accountsHomePage accountsPage =getPages().get(accountsHomePage.class);
		assertThat(accountsPage.checkFinanceAccountDetails(),not(equalTo(null)));
		String financeid =accountsPage.checkFinanceAccountDetails();
		list.add(financeid);  // 3. adding customer finance ID (SOP ID) to array list
		getDriver().navigate().back();
	}
	
	public void clickOnOpportunityToOrder(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.clickOnOpportunityToOrder();
		assertThat(getDriver().getTitle(),is(equalTo("Opportunity To Order ~ Salesforce - Unlimited Edition")));
	}
	
	public void supplyInputForNewOpportunity(String file) throws Exception{
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.createOpportunityUsingCSV(file);
		opp2OrderPage.selectAgencyToBeBilled(AccountName);
		opp2OrderPage.selectContactForOpportunity(list.get(1)); // Using Contact Name on Create New Opportunity Page
//		System.out.println("Account Name is ------------------------------------------->> "+AccountName);
	}

	public void validateOppotunityRecord(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.validateOppotunityRecord();
	}
	public void clickOnNewOpportunityLine(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.clickOnNewOpportunityLine();
	}
	
	public void clickOnAddClassifiedProducts(){
		opportunityToClassified opp2Classified = getPages().get(opportunityToClassified.class);
		opp2Classified.clickOnNewOpportunityLine();
	}
	public void supplyInputToCreateClassfiedOppLine(String file) throws Exception{ 
		opportunityToClassified opp2Classified = getPages().get(opportunityToClassified.class);
		opp2Classified.createClassifiedOppLineUsingCSVDataInput(file);
	}
	
	public void saveAndValidateClassifedOppotunityLine(){
		opportunityToClassified opp2Classified = getPages().get(opportunityToClassified.class);
		opp2Classified.classifiedOppShouldBeCreated();
	}
	public void supplyInputForNewOpportunityLine(String file) throws Exception{ 
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.createOpportunityLineUsingCSV(file);
	}
	public void creaetMultipleOppLines(String file) throws Exception{ 
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.creaetMultipleOppLinesUsingCSV(file);
	}

	public void validateOppotunityLineRecord(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.validateOppotunityLineRecord();
		System.out.println("\n");
		for(int i = 0; i < list.size(); i++) 
		{
			System.out.print((list.get(i)).toString() + " + ");
		}
		System.out.println("\n");
		list.clear();
	}
	
	public void editOppLines() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.editOppLine();
	}

	public void oppLinesShouldBeUpdatedSuccessfully() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.oppLinesShouldBeUpdated();
	}
	
	public void deactivateOppLine() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.cancelOppLine();
	}

	public void oppLineDeactivateSuccessfully() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.OppLineDeactivated();
	}
	
	public void cancelOrderLine() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.orderLinecancelled();
	}
	public void orderLineShouldBeCancelled() {
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.verifyCancelledOrderLine();
	}
	
	public void selectOpportunityLine(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.selectOpportunityLinesToConvertAsOrders();
	}
	public void selectMultiplePackages(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.selectPackagesToConvertedAsOrders();
	}
	
	public void convertSelectedOpportunityLines(){
		opportunityToOrderPage opp2OrderPage = getPages().get(opportunityToOrderPage.class);
		opp2OrderPage.openCCIPluginToConvert();
		opp2OrderPage.convertApprovedOppLinesAsOrder();
	}
	
	/**************************************************************************************************************/
	
	public void createAccountMapping(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.mapAccountWithSourceSystem();
		
	}
	public void createDigitalLines(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.addDigitalProducts();
		
	}
	public void selectDigitalLines(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.createDigitalLine();
	}
	public void validateDigitalLineRecord(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		System.out.println("\n");
		String digitalLine = getDriver().getCurrentUrl();
		System.out.println(" ********* URL is  :   "+digitalLine);
	}
	
	public void editExitingDigitalLines(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.editLines();
	}
	public void copyNewLineAndSave(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.copyAndSaveALine();
	}
	
	public void copyDates(int NumberOfLines){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.copyDatesOnMltipleLines(NumberOfLines);
	}
	
	public void cancelDigitalLine(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.deactivateLines();
	}
	public void createOpppUsingExistingDigitalLine(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.createNewOppFromSelectedLines();
	}
	
	public void changeOppStage(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.oppStageAsClosedWon();
	}
	public void oppStageShouldBeChanged(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.OppStageShouldBeChanged();
	}
	public void changeOppStageToClosedLost(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.oppStageAsClosedLost();
	}
	public void oppStageShouldBeChangedAsClosedLost(){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.OppStageShouldBeClosedLost();
	}
	
	public void errorMessageAsExpected(String errorMessage){
		opportunityToDigital digitalPage = getPages().getPage(opportunityToDigital.class);
		digitalPage.errorMessageWhenOppIsClosed(errorMessage);
	}
	
	/**************************************************************************************************************/
	
	
}