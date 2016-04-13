package O2O.pages;

import java.util.Map;

import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Function;

/**
 * @author srinivasa.kuncha
 */
public class accountsHomePage extends PageObject {
	
	long timeNow = System.currentTimeMillis();
	public static String customerAccount;
	public static String customerAccountName;
	public static String bookingAccountName;
	public static String bookingAccountPage;
	public static String contactFullName;
	public static String clientURL;
	/****************** Define Elements of Accounts Tab **************************************************************************/
	
	private WebElementFacade accountsTab()       { 	return element(By.partialLinkText("Accounts"));	    						}
	private WebElementFacade newBtn()       	 { 	return element(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input"));	}
	private WebElementFacade searchCustomerAcc() { 	return element(By.name("j_id0:j_id34:j_id36:customerName"));		}
	private WebElementFacade searchBtn() 	 	 { 	return element(By.name("j_id0:j_id34:j_id36:j_id48:j_id49"));		}
	private WebElementFacade newbtnUnderSearch() { 	return element(By.name("j_id0:j_id34:j_id54:j_id55:j_id56"));		}
	private WebElementFacade continueButt()      { 	return element(By.cssSelector("input[value='Continue']")); 			}
	private WebElementFacade salutation() 		 { 	return element(By.id("00ND0000005jggD"));							}
	private WebElementFacade firstname() 		 { 	return element(By.id("00ND0000005jgg9"));							}
	private WebElementFacade parentAccount()     { 	return element(By.cssSelector("#acc3"));							}
	private WebElementFacade phoneNumber()       { 	return element(By.cssSelector("#acc10"));							}
	private WebElementFacade accountName()       { 	return element(By.cssSelector("#acc2"));							}
	private WebElementFacade selectRecordType()  {	return element(By.id("p3")); 										}
	private WebElementFacade selectTypeOfAcnt()  { 	return element(By.id("acc6")); 										}
	private WebElementFacade billingStreet()     { 	return element(By.cssSelector("#acc17street"));       				}
	private WebElementFacade billingPostCode()   { 	return element(By.cssSelector("#acc17zip"));						}
	private WebElementFacade saveCustomerRecord(){  return element(By.xpath("//*[@id='topButtonRow']/input[1]"));		}
	private WebElementFacade newContact()        { 	return element(By.name("newContact"));								}
	private WebElementFacade contactFirstName()  { 	return element(By.name("name_firstcon2"));							}
	private WebElementFacade contactLastName()   { 	return element(By.name("name_lastcon2"));							}
	private WebElementFacade customerName()   	 { 	return element(By.id("con4"));										}
	private WebElementFacade contactEmail()   	 { 	return element(By.name("con15"));									}
	private WebElementFacade saveContact()       { 	return element(By.name("save"));									}
	private WebElementFacade clickOnClone()      { 	return element(By.name("clone"));									}
	private WebElementFacade navigateToAccnt()   { 	return element(By.xpath("//tbody/tr/td[2]/div[4]/div[2]/div[2]/table/tbody/tr[2]/td[2]/div/a"));}
	private WebElementFacade newRelationship()   { 	return element(By.cssSelector("input[value='New Relationship']"));	}
	private WebElementFacade relationB()		 {  return element(By.name("CF00ND0000003g0n9"));						}
	private WebElementFacade relationRole()		 {  return element(By.name("00ND0000003g0nB"));							}
	private WebElementFacade saveAssocitaion()	 {  return element(By.xpath("//*[@id='bottomButtonRow']/input[1]"));	}
	private WebElementFacade readAccountName()   { 	return element(By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2")); }
	private WebElementFacade mainCate()          { 	return element(By.name("j_id0:j_id1:j_id27:j_id36"));				}
	private WebElementFacade subCate()           { 	return element(By.name("j_id0:j_id1:j_id27:subcategory"));			}
	private WebElementFacade minorCate()         { 	return element(By.name("j_id0:j_id1:j_id27:minor"));				}
	private WebElementFacade saveIndCate()       { 	return element(By.name("j_id0:j_id1:j_id27:j_id28:j_id29"));		}
	private WebElementFacade CCICustomerMail()   {  return element(By.cssSelector("input[value='Create CCI Customer-Mail']"));		}
	private WebElementFacade accountsMapping()   { 	return element(By.partialLinkText("AM-"));	    								}
	private WebElementFacade customerRef() 		 {  return element(By.xpath("//*[@id='ep']/div[2]/div[2]/table/tbody/tr[4]/td[2]"));}
	private WebElementFacade financeAccount()    { 	return element(By.partialLinkText("- Mail"));	    							}
	private WebElementFacade privateFinanceAcc() { 	return element(By.partialLinkText("BT60JH"));	    							}
	private WebElementFacade SOPid() 		 	 {  return element(By.xpath("//*[@id='ep']/div[2]/div[2]/table/tbody/tr[6]/td[4]"));}
	private WebElementFacade CCIid() 		 	 {  return element(By.xpath("//*[@id='ep']/div[2]/div[2]/table/tbody/tr[5]/td[4]"));}
	
	@FindBy(partialLinkText="AM-") 
	WebElement accountMapping;
	@FindBy(partialLinkText="- Mail") 
	WebElement financeAccountMapping;
	
	private WebElementFacade setupLink()  		{ 	return element(By.id("setupLink")); 								}
	private WebElementFacade logs()  			{ 	return element(By.id("Logs_font")); 								}
	private WebElementFacade debugLogs()		{ 	return element(By.id("ApexDebugLogs_font")); 						}
	private WebElementFacade createNewLog()     { 	return element(By.id("Apex_Trace_List:monitoredUsersForm:newMonitoredUserButton")); }
	private WebElementFacade setUserName()      { 	return element(By.id("UserLookupInput")); 							}
	private WebElementFacade saveUserName()     { 	return element(By.name("save")); 									}
	private WebElementFacade deleteAll()        { 	return element(By.id("Apex_Trace_List:traceForm:traceTable:j_id35:deleteAll")); 	}
	private WebElementFacade viewLogRec1()		{	return element(By.xpath("//*[@id='Apex_Trace_List:traceForm:traceTable:thetracetable:0:rowActions']/a[1]"));}
	private WebElementFacade data1()				{	return element(By.xpath("//*[@id='ep']/div[2]/div[3]/table/tbody/tr[5]/td[2]/pre"));}
	private WebElementFacade selectCategory()  	 { 	return element(By.id("00ND0000003umBZ")); 							}
	private WebElementFacade selectSubCategory() { 	return element(By.id("00ND0000003umBa_unselected"));				}
	private WebElementFacade addSubCategory()  	 { 	return element(By.id("00ND0000003umBa_right_arrow")); 				}
	
	/****************** Define Elements of Accounts Tab **************************************************************************/

	public void setUserDebugLog(){
		setupLink().click();
		waitFor(4).seconds();
		logs().click();
		waitFor(2).seconds();
		debugLogs().click(); 
		waitFor(4).seconds();
		deleteAll().click();
		waitFor(3).seconds();
		deleteAll().click();
		waitFor(3).seconds();
		createNewLog().click();
		waitFor(3).seconds();
		setUserName().type("Srini Kuncha Admin");
		waitFor(1).seconds();
		saveUserName().click();
		waitFor(3).seconds();
		
	}
	
	public String  verifyDebugLogdetails(){
		/*setupLink().click();
		waitFor(3).seconds();
		logs().click();
		waitFor(2).seconds();
		debugLogs().click(); 
		waitFor(3).seconds();*/
		getDriver().get("https://dmgsalescloud--systest.cs7.my.salesforce.com/setup/ui/listApexTraces.apexp");
		waitFor(3).seconds();
		viewLogRec1().click();
		waitFor(3).seconds();
		String str = data1().getText();
		String test[] = str.split("Number of SOQL queries:");
		return test[1];
	}
	
	public void accountTabOnHomePage(){
		accountsTab().click();
		waitFor(5).seconds();
		try{newBtn().click();
		waitFor(5).seconds();} catch (Exception systest){}
	}
	
	public void openOpportunityPage(){
		getDriver().get("https://dmgsalescloud--systemtest--c.cs8.visual.force.com/apex/OpportunityToOrder?oppID=006L00000075jY6");
		waitFor(5).seconds();
	}
/*	public void newButtonUnderAccountsTab(){
		newBtn().click();
		waitFor(5).seconds();
	}*/
	
	public void searchforcustomeraccount(String accountName){
		searchCustomerAcc().type(accountName);
		waitFor(1).seconds();
		searchBtn().click();
		waitFor(5).seconds();
	}
	
	public void clickOnNewBtnToCreateCustomerAccount(){
		newbtnUnderSearch().click();
		waitFor(3).seconds();
	}
	
	public void selectRecrodTypeAndContinue(String recordType){
		selectRecordType().selectByVisibleText(recordType);
		waitFor(1).second();
		continueButt().click();
	}
	
	public void supplyMandatoryFieldsForAdviserAccount(Map<String, String> adviserMandValues){
		
		String str = adviserMandValues.get("accountType");
    	try {
    			
		    	waitFor(1).second();
		    	selectTypeOfAcnt().selectByVisibleText(adviserMandValues.get("accountType"));
		    	waitFor(1).second();
		    	accountName().type(timeNow + " " +adviserMandValues.get("accountName"));
		    	phoneNumber().type(adviserMandValues.get("phoneNumber"));
		    	billingStreet().type(adviserMandValues.get("billingStreet"));
		    	billingPostCode().type(adviserMandValues.get("postCode"));
		    	 try{ 	selectCategory().selectByVisibleText(adviserMandValues.get("mainCategory"));
			  		selectSubCategory().selectByVisibleText(adviserMandValues.get("subCategory"));
			  		addSubCategory().click();
			    	}catch(Exception NotAClassifiedAccount){}
			    if (str.equalsIgnoreCase("Brand")) 
			    {
					parentAccount().type(adviserMandValues.get("parentaccount"));
				}
			    if (str.equalsIgnoreCase("Private Advertiser"))
			    	
			    {
			    	salutation().selectByVisibleText(adviserMandValues.get("salutation"));
			        firstname().type(adviserMandValues.get("firstname"));
			    }
		  }
    		catch (Exception e) { e.printStackTrace();}
    }
	
	public void saveCustomerRecrod() {

		saveCustomerRecord().click();
		waitFor(8).seconds();
	}
	
	public String isCustomerRecrodCreated(){
		customerAccountName = readAccountName().getText();
		return readAccountName().getText();	
	}
	
	public void associateClientWithBookingAgency(){
		
		String searchKey = "xyzz";
		
		System.out.println(" Customer Account Name is :  " +customerAccountName);
		clientURL = getDriver().getCurrentUrl();
		accountsTab().click();
		waitFor(4).seconds();
		newBtn().click();
		waitFor(3).seconds();
		searchforcustomeraccount(searchKey);
		clickOnNewBtnToCreateCustomerAccount();
		selectRecrodTypeAndContinue("Agency");
		waitFor(1).seconds();
		accountName().type("Srini Agency "+timeNow);
		phoneNumber().type("0123456789");
    	billingStreet().type("DMGT Street");
    	billingPostCode().type("W8 5TT");
    	saveCustomerRecord().click();
    	waitFor(6).seconds();
    	bookingAccountPage = getDriver().getCurrentUrl();
    	createCCICustomerMail();
    	waitFor(1).seconds();
    	newRelationship().click();
    	waitFor(2).seconds();
    	relationB().type(customerAccountName);
    	relationRole().selectByVisibleText("Booking"); // User should have booking agency association otherwise agency details will not appear while creating opp
    	saveAssocitaion().click();
    	waitFor(4).seconds(); //2
    	getDriver().get(bookingAccountPage);
    	waitFor(3).seconds();
    	bookingAccountName = readAccountName().getText();
    	newRelationship().click();
    	waitFor(2).seconds();
    	relationB().type(bookingAccountName);
    	relationRole().selectByVisibleText("Billing"); // User should have booking agency association otherwise agency details will not appear while creating opp
    	saveAssocitaion().click();
    	waitFor(2).seconds();
    	getDriver().get(clientURL);
    	waitFor(5).seconds();

	}
	public void openNewContactPage(){
		customerAccount = getDriver().getCurrentUrl();
		newContact().click();
		waitFor(3).seconds();
	}
	
	public void supplyMandatoryFieldsForContact1(Map<String, String> contactMandValues){
		try {
				for (int i=0; i<=100; i++)
				{
				contactFirstName().type(contactMandValues.get("firstName"));
				contactLastName().type(contactMandValues.get("lastName") + " - " +timeNow);
		    	contactEmail().type(contactMandValues.get("email"));
		    	saveContact().click();
		    	waitFor(4).second();
		    	clickOnClone().click();
		    	waitFor(3).second();
				}			
			} catch (Exception e) {e.printStackTrace();}
	}
		
	public void supplyMandatoryFieldsForContact(Map<String, String> contactMandValues){
		try {
			contactFirstName().type(contactMandValues.get("firstName"));
			contactLastName().type(contactMandValues.get("lastName"));
	    	contactEmail().type(contactMandValues.get("email"));
	    	waitFor(2).second();
	
		} catch (Exception e) {e.printStackTrace();}
		contactFullName = contactMandValues.get("firstName").concat(" "+contactMandValues.get("lastName").concat(" - ").concat(customerAccountName));
	}
	
	public String saveContactRecrod(){
		saveContact().click();
		waitFor(4).second();
		getDriver().get(customerAccount);
		return contactFullName;
	}
	public void clickOneditIndustryCategory() {

		waitFor(1).second();
		getDriver().switchTo().frame("066D0000000kh27");
		WebElement editable = getDriver().switchTo().activeElement();
		editable.findElement(
				By.cssSelector("input[name='j_id0:j_id1:j_id27:j_id28:j_id31']"))
				.click();
		waitFor(3).seconds();
	}

	public void selectCategories(String mainCategory, String subCategory,
			String minorCategory) {
		mainCate().selectByVisibleText(mainCategory);
		waitFor(4).seconds();
		subCate().selectByVisibleText(subCategory);
		waitFor(4).seconds();
		minorCate().selectByVisibleText(minorCategory);
	}

	public void createIndustryCategory() {
		waitFor(1).seconds();
		saveIndCate().sendKeys(Keys.RETURN);
		waitFor(2).seconds();
		getDriver().switchTo().defaultContent();
	}

	public void createCCICustomerMail() {
		try {
			waitFor(1).seconds();
			CCICustomerMail().click();
			waitFor(5).seconds();
			getDriver().switchTo().alert().accept();
			waitFor(15).seconds();
			getDriver().switchTo().alert().accept();
			waitFor(5).seconds();
		} catch (Exception syncfailed) {
			syncfailed.getCause();
		}
	}
	public boolean isAccountMappingSuccessful() {
	    try {
	    
	    	WebElementWait wait = new WebElementWait(accountMapping, 1);
	        WebElement icon = wait
	                .until(new Function<WebElement, WebElement>() {
	                    public WebElement apply(WebElement d) {
	                        return d.findElement(By.partialLinkText("AM-"));
	                    }
	                });
	        return false;
	    } catch (TimeoutException exception) {
	        return true;
	    }
	}

	public void accountMapping() {

		waitFor(3).seconds();
		accountsMapping().click();
	}
	
	public boolean getCustomerRef() {
		waitFor(3).seconds();
		String str = customerRef().getText();
		if (str.equals(null))
			return false;
			return true;
	}
	public boolean isFinaceAccountMappingSuccessful() {
	    try {
	    
	    	WebElementWait wait = new WebElementWait(financeAccountMapping, 1);
	        WebElement icon = wait
	                .until(new Function<WebElement, WebElement>() {
	                    public WebElement apply(WebElement d) {
	                        return d.findElement(By.partialLinkText("- Mail"));
	                    }
	                });
	        return false;
	    } catch (TimeoutException exception) {
	        return true;
	    }
	}
	public void accessFinanceAccount(){
		try{
		waitFor(3).seconds();
		financeAccount().click();
		} catch (Exception pFinanceAcc){
			privateFinanceAcc().click();
		}
	}
	public String checkFinanceAccountDetails(){
		waitFor(3).seconds();
		String str = SOPid().getText();
		return str;
	}
}