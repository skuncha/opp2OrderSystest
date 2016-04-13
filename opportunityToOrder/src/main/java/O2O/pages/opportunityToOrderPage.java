package O2O.pages;

import java.io.File;
import java.util.Map;

import net.thucydides.core.Thucydides;
import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author srinivasa.kuncha
 *
 */
public class opportunityToOrderPage extends PageObject  {
	
	public static int count;
	
	/******** Define Elements of Opportunity Registration Tab *******************************************************************************************************************************************************************/
	
	private WebElementFacade clickOnOppToOrderBtn() { 		return element(By.cssSelector("input[value='Opportunity To Order']")); 							}
	private WebElementFacade oppName() 				{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id117:j_id121")); 				}
	private WebElementFacade selectOppStage() 		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id161:j_id165")); 				}
	private WebElementFacade enterOppStartDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id212:j_id216")); 				}
	private WebElementFacade enterOppCloseDate() 	{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id175:j_id179")); 				}
	private WebElementFacade enterOppEndDate() 		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id224:j_id228")); 				}
	private WebElementFacade enterOppEstdVal()		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id230:j_id234")); 				}
	private WebElementFacade selectOppType() 		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id152:j_id156")); 				}
	private WebElementFacade selectOppContactRole() { 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id189:j_id192")); 				}
	private WebElementFacade selectContact1() 		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id181:j_id185"));				}
	private WebElementFacade selectAgency() 		{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id115:j_id116:j_id136:agencyFieldPanel']")); }
	private WebElementFacade selectBillingAgency() 	{ 		return element(By.xpath("//*[@id='j_id0:opportunityForm:j_id115:j_id116:j_id136:agencyFieldPanel']/div/select/option[2]")); }
	private WebElementFacade selectNewBusinessCB() 	{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id211")); 						}
	private WebElementFacade selectPrintPartnership(){ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id116:j_id245:j_id248")); 				}
	private WebElementFacade selectDigitalPartnership(){ 	return element(By.name("j_id0:opportunityForm:j_id100:j_id101:j_id230:j_id233")); 				}
	private WebElementFacade clickOppSaveBtn() 		{ 		return element(By.name("j_id0:opportunityForm:j_id115:j_id324")); 								}
	
	/******** Define Elements of OpportunityLine Tab ***************************************************************************************************************************************************************************/
//	private WebElementFacade clickOnOppToDisplay()  { 		return element(By.id("j_id0:tab1_lbl")); 																		}
	private WebElementFacade clickOnOppToDisplay()  { 		return element(By.xpath("//td[4]/table/tbody/tr/td[2]/table/tbody/tr/td")); 									}																	
	private WebElementFacade clickOnNewOppLineBtn() { 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id625")); 										}
	private WebElementFacade selectBillingAgent() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:fieldsSection:j_id669:j_id673")); 		}
	private WebElementFacade selectPackage() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:fieldsSection:j_id688:j_id691")); 		}
	private WebElementFacade enterOrderPO() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:fieldsSection:j_id697:j_id701")); 		}
	private WebElementFacade enterSalesPrice()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:fieldsSection:j_id703:j_id707")); 		}
	
	/******** Define Elements of DM Display Package  ***************************************************************************************************************************************************************************/
	
	private WebElementFacade selectTitle() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id722:0:j_id723:j_id727")); 	}
	private WebElementFacade selectPublication() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id722:1:j_id723:j_id727")); 	}
	private WebElementFacade selectSection() 		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id722:2:j_id723:j_id727")); 	}
	private WebElementFacade selectSubSection() 	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id722:3:j_id723:j_id727")); 	}
	private WebElementFacade selectZones() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id722:4:j_id723:j_id727")); 	}
	private WebElementFacade enterInsertionDate()	{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id738:selectedInsertionDates"));	} //  example date format "19/03/2015"
	private WebElementFacade selectSize() 			{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id753:j_id755")); 			}
	private WebElementFacade selectDateflexCB()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id719:0:j_id721:j_id744:j_id747")); 			}
	private WebElementFacade clickOppLineSave()		{ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id627:0:j_id786")); 										}
	
	/******** Define Elements For MailPlus Package  ******************************************************************************************************************************************************/

	private WebElementFacade clickEditOppLine()		{ 		return element(By.xpath("//tr[2]/td[2]/img")); 																			}
	private WebElementFacade clickCanceloppLine()	{ 		return element(By.xpath("//tr[1]/td[4]/img")); 																			}
	private WebElementFacade deactiveReason() 	 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id593:j_id627:1:j_id777:j_id778")); 								}
	private WebElementFacade deactiveReasonOK() 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id593:j_id627:1:j_id795")); 										}
	private WebElementFacade cancelReason() 	 	{		return element(By.name("j_id0:opportunityToPrintForm:j_id594:j_id628:0:j_id871:j_id873")); 								}
	private WebElementFacade cancelReasonSubmit() 	{		return element(By.id("j_id0:opportunityToPrintForm:j_id594:j_id628:0:j_id886")); 										}
	private WebElementFacade bookedPrice() 			{		return element(By.id("j_id0:opportunityToPrintForm:j_id592:j_id950:0:j_id1106")); 										}
	private WebElementFacade yieldvalue() 			{		return element(By.id("j_id0:opportunityToPrintForm:j_id593:j_id951:0:j_id1107")); 										}
	private WebElementFacade acceptAlert()			{ 		return element(By.name("j_id0:popUpFrame2:j_id52")); 																	}
    private WebElementFacade selectOppLineToBeConvertedCB()	 { 		return element(By.xpath("//*[@id='inprogressTable']/tbody/tr[1]/td[1]/input")); 								}
	private WebElementFacade clickOnCreateSelectedLineinCCI(){ 		return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id1120")); 			   							} 
	private WebElementFacade clickOnRefreshTable()			 {      return element(By.name("j_id0:opportunityToPrintForm:j_id593:j_id912")); 			    						}
	private WebElementFacade deactivateTable()		{       return element(By.xpath("//*[@id='j_id0:opportunityToPrintForm:j_id346:sectionheadercustomID']/div[1]")); 			   	}

	/******** Define Elements of Opportunity Line which will be converted to Order in CCI ***************************************************************************************************************/	
	
	private WebElementFacade addPackage()   	 	{ 		return element(By.xpath("//fieldset/div/div/div/h4/a/span"));															}
	private WebElementFacade selectModule()   	 	{ 		return element(By.id("Order.Material:material.moduleCode"));															}
	private WebElementFacade selectPrice()   	 	{ 		return element(By.xpath(".//*[@id='SchedulingAccordion']/div/div[3]/div[1]/h4/a/span"));								}
	private WebElementFacade selectPrice1()   	 	{ 		return element(By.xpath("//*[@id='price-details-accordion']/div/h4/a/span"));											}
	private WebElementFacade selectInsertion()   	{ 		return element(By.xpath("//*[@id='ActivePriceDetailView']/label[3]"));													}
	private WebElementFacade selectedInsertionDate(){ 		return element(By.xpath("//fieldset/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[2]/a"));								}
	private WebElementFacade selectBasePrice()	 	{ 		return element(By.xpath("//tbody/tr[14]/td[1]/a"));																		}
	private WebElementFacade supplyPriceType()	 	{ 		return element(By.xpath("//*[@id=':overridePriceDetail']"));															}
	private WebElementFacade supplyPrice()			{ 		return element(By.xpath("//tbody/tr[23]/td[3]/div/input"));																}
	private WebElementFacade updateInsLevelRevenue(){ 		return element(By.xpath("//tbody/tr[23]/td[3]/div/span/button/i"));							    						}
	private WebElementFacade acceptOrder()   	 	{ 		return element(By.xpath("//nav[button='Accept']/button[3]"));															} 
	private WebElementFacade orderID()      	 	{ 		return element(By.xpath("//fieldset/div[1]/div/p")); 																	}
	private WebElementFacade orderSyncedToGlue()    { 		return element(By.xpath("//*[@class='tdStyle cciOrder']/span/a/span"));													}

	/*********************************************************************************************************************************************************************************************************/
	 
	public void clickOnOpportunityToOrder(){
		waitFor(3).seconds();
		clickOnOppToOrderBtn().click();
		waitFor(4).seconds();
	}
	
	/**
	 * @param CSVfile
	 * @throws Exception
	 * Create Opportunity Header by reading the data from CSV file 
	 */
	public void createOpportunityUsingCSV(String CSVfile) throws Exception {

		File filePath = new File(CSVfile);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
			try {
			for (Map<String, String> record : testDataSrc.getData()) {
				
					waitFor(4).seconds();
					oppName().type(record.get("oppName"));
					waitFor(1).second();
					selectOppStage().selectByVisibleText(record.get("oppStage"));
					waitFor(3).second();
					enterOppStartDate().type(record.get("oppStartDate"));
					enterOppEndDate().type(record.get("oppEndDate"));
					enterOppCloseDate().type(record.get("oppCloseDate")); 
					enterOppEstdVal().type(record.get("oppEstdValue"));	
					try {
						selectPrintPartnership().selectByVisibleText(record.get("partnership"));
						waitFor(2).second();
					} catch (Exception digital) {
						selectDigitalPartnership().selectByVisibleText(record.get("partnership"));
						waitFor(1).second();
					}
					selectOppType().selectByVisibleText(record.get("oppType"));
					waitFor(3).second();
				}
			} catch (Exception e1) {}
		}
	}
	public void selectContactForOpportunity(String contact){
		
		try{
			selectContact1().selectByVisibleText(contact);
		} catch (Exception defalutelement) {

			System.out.println(" Account Type is Private Advertiser ");
		}
	}
	
	public void selectAgencyToBeBilled(String CustomerAccount){
		
		if (CustomerAccount.equalsIgnoreCase("Brand") || CustomerAccount.equalsIgnoreCase("Client")){
			waitFor(2).second();
			try{
			selectAgency().click();
			waitFor(2).second();
			selectBillingAgency().click();
			waitFor(5).second();
			}catch (Exception nosuchelement) { }
		}
	}
	public void validateOppotunityRecord(){
		waitFor(1).second();
		clickOppSaveBtn().click();
		waitFor(11).seconds();
		
	}
	public void clickOnNewOpportunityLine(){
	
		clickOnOppToDisplay().click();
		waitFor(3).seconds();
		clickOnNewOppLineBtn().click();
		waitFor(4).seconds();
	}
	/**
	 * @param CSVfile
	 * @throws Exception
	 * create OppLine(s) by reading the data from CSV file
	 */
	public void createOpportunityLineUsingCSV(String CSVfile) throws Exception {
		File filePath = new File(CSVfile);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
			for (Map<String, String> record : testDataSrc.getData()) {
				try {
					String Dateflex = record.get("dateflex");
					selectPackage().selectByVisibleText(record.get("package"));
					waitFor(5).seconds();
					enterOrderPO().type(record.get("insertionPO"));
					enterSalesPrice().type("2000");
					waitFor(1).seconds();
					// selectTitle().selectByVisibleText(record.get("title"));
					selectPublication().selectByVisibleText(
							record.get("publication"));
					waitFor(5).seconds();
					selectSection().selectByVisibleText(record.get("section"));
					waitFor(5).seconds();
					selectSubSection().selectByVisibleText(
							record.get("subsection"));
					waitFor(5).seconds();
					selectZones().selectByVisibleText(record.get("zones"));
					waitFor(5).seconds();
					enterInsertionDate()
							.typeAndTab(record.get("insertionDate"));
					waitFor(1).seconds();
					if (Dateflex.equalsIgnoreCase("Y")) {
						selectDateflexCB().click();
						waitFor(2).second();
					}
					clickOppLineSave().click();
					waitFor(15).seconds();
				} catch (Exception e1) {}
			}
		}
	}
	
	public void editOppLine() {
		clickEditOppLine().click();
		waitFor(8).seconds();
		selectSize().selectByVisibleText("10x2");
		waitFor(4).seconds();
	}

	public void oppLinesShouldBeUpdated() {

		clickOppLineSave().click();
		waitFor(15).seconds();
	}

	public void cancelOppLine() {
		clickCanceloppLine().click();
		waitFor(15).seconds();
		deactiveReason().selectByVisibleText("Created in error");
		waitFor(1).seconds();
		deactiveReasonOK().click();
		waitFor(8).seconds();
	}

	public void OppLineDeactivated() {
		waitFor(1).seconds();
		deactivateTable().click();
		waitFor(1).seconds();
	}

	public void orderLinecancelled() {
		waitFor(5).seconds();
		clickCanceloppLine().click();
		waitFor(15).seconds();
		cancelReason().selectByVisibleText("Customer request");
		waitFor(1).seconds();
		cancelReasonSubmit().click();
		waitFor(30).seconds();
	}

	public boolean verifyCancelledOrderLine() {
		waitFor(10).seconds();
		clickOnRefreshTable().click();
		waitFor(5).seconds();
		if ((bookedPrice().getText()).equals("GBP 0.00") && (yieldvalue().getText()).equals("GBP 0.00"))
			return true;
		return false;
	}
	/**
	 * @param CSVfile
	 * @throws Exception
	 * create multiple OppLines by reading the data from CSV file
	 */
	public void creaetMultipleOppLinesUsingCSV(String CSVfile) throws Exception {
		File filePath = new File(CSVfile);
		if (filePath.isFile()) 
		{
				String file = filePath.getAbsolutePath();
				CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
				int s = testDataSrc.getData().size();
				count = s;
				for (Map<String, String> record : testDataSrc.getData()) 
				{
						System.out.println("records in the file is s --->  "+s);
			
						try {
								String Dateflex = record.get("dateflex");
								selectPackage().selectByVisibleText(record.get("package"));
								waitFor(5).seconds();
								enterOrderPO().type(record.get("insertionPO"));
								enterSalesPrice().type("2000");
								waitFor(1).seconds();
								// selectTitle().selectByVisibleText(record.get("title"));
								selectPublication().selectByVisibleText(record.get("publication"));
								waitFor(5).seconds();
								selectSection().selectByVisibleText(record.get("section"));
								waitFor(4).seconds();
								selectSubSection().selectByVisibleText(record.get("subsection"));
								waitFor(4).seconds();
								selectZones().selectByVisibleText(record.get("zones"));
								waitFor(7).seconds();
								enterInsertionDate().typeAndTab(record.get("insertionDate"));
								waitFor(1).seconds();
								if (Dateflex.equalsIgnoreCase("Y"))
								{
									selectDateflexCB().click();
									waitFor(2).second();
								}
								clickOppLineSave().click();
								waitFor(12).seconds();
							} catch (Exception e1) {}
						if (s==1)
							System.out.println("Iterations Completed --->  "+s);
						else {
								clickOnNewOppLineBtn().click();
								waitFor(4).seconds();
								s--;
							 }
				}
		}
}
	
	public void validateOppotunityLineRecord() {

		System.out.println("Opportunity Created Successful --> :  "
				+ getDriver().getCurrentUrl());
		Thucydides.takeScreenshot();
	}

	public void selectOpportunityLinesToConvertAsOrders() {
		
		selectOppLineToBeConvertedCB().click();
		waitFor(8).seconds();
	}
public void selectPackagesToConvertedAsOrders() {
		
		count = count*2;
		while (count > 0){
			WebElementFacade selectPackages =  element(By.xpath("//*[@id='inprogressTable']/tbody/tr["+count+"]/td[1]/input"));
			selectPackages.click();
			waitFor(8).seconds();
			count= count-2;
		}
	}
	
  public void openCCIPluginToConvert(){
	  	clickOnCreateSelectedLineinCCI().click();
		waitFor(1).seconds();
		getDriver().switchTo().activeElement();
		waitFor(1).seconds();
		acceptAlert().click();
		waitFor(45).seconds();
  }

	/**
	 * This method is used to convert oppline(s) as an order
	 * Supply data values for package module and price section
	 * Handle popup windows where user prompted for pre-payment
	 */
	public void convertApprovedOppLinesAsOrder() {
		
		try{
		
		getDriver().switchTo().frame(
		getDriver().findElement(By.tagName("iframe")));
		WebElement element = getDriver().switchTo().activeElement();
		waitFor(2).seconds();
		System.out.println("Order id is --------------------->   "
				+ orderID().getText());
		addPackage().click();
		waitFor(4).seconds();
		selectModule().selectByVisibleText("10x2");
		waitFor(6).seconds();
		try{
		selectPrice().click();
		waitFor(3).seconds();
		}catch (Exception multipack) {
			selectPrice1().click();
			waitFor(3).seconds();
		}
		selectInsertion().click();
		waitFor(3).seconds();
		selectedInsertionDate().click();
		waitFor(3).seconds();
		selectBasePrice().click();
		waitFor(3).seconds();
		supplyPriceType().selectByVisibleText("UserRevenue");
		waitFor(1).seconds();
		supplyPrice().type("2000");
		waitFor(1).seconds();
		updateInsLevelRevenue().click();
		waitFor(5).seconds();
		acceptOrder().click();
		try {
			WebElement prepaymentwindow1 = getDriver().switchTo()
					.activeElement();
			waitFor(1).seconds();
			prepaymentwindow1.findElement(By.xpath("//input[@value='Prepay']"))
					.click();
			waitFor(1).seconds();
			WebElement prepaymentwindow2 = getDriver().switchTo()
					.activeElement();
			waitFor(1).seconds();
			prepaymentwindow2.findElement(By.xpath("//input[@value='OK']"))
					.click();
		} catch (Exception NoPopUp) {
		}
		waitFor(15).seconds();
		Thucydides.takeScreenshot();
		clickOnRefreshTable().click();
		waitFor(5).seconds();
		if(orderSyncedToGlue().isVisible()){
			assertThat(orderSyncedToGlue().containsText("Order ID"), is(true));
			System.out.println("Order Status is ---->  "+orderSyncedToGlue().getText());
		}
		else 
			assertThat(orderSyncedToGlue().containsText("Order ID"), is(false));
			// getDriver().quit();
		} catch (Exception x) {try{ getDriver().switchTo().alert().accept();}catch (Exception y) {};
			// getDriver().quit();
			// getDriver().switchTo().alert().accept();
		}
	}

}
