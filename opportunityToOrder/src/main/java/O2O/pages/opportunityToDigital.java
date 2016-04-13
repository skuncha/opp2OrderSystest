package O2O.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.reports.history.SystemDateProvider;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class opportunityToDigital extends PageObject {
	
	public static String lnDesc, oppName;
	long timeNow = System.currentTimeMillis();
/*	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date sysdate = new Date();*/
	
	private WebElementFacade accountMapping() 			 {	return element(By.xpath("//div[14]/div/div/div/table/tbody/tr/td[2]/input")); 			}
	private WebElementFacade sourceSystem() 			 {	return element(By.id("00ND0000005WVcR")); 												}
	private WebElementFacade customerRef() 			 	 {	return element(By.id("00ND0000005WVcQ")); 												}
	private WebElementFacade accountMappingSave() 		 {	return element(By.xpath("//*[@id='bottomButtonRow']/input[1]")); 						}
	
	private WebElementFacade clickOnAddDigitalProducts() {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id993"));   				}
	private WebElementFacade selectProduct() 		     {	return element(By.xpath("//div[@id='j_id0:opportunityToDigitalForm:j_id961:j_id998:j_id999:multiselectPanel']/table/tbody/tr/td/select/option[13]")); }
	private WebElementFacade addProduct() 				 {	return element(By.xpath("//div[2]/a/img")); 							   				}
	private WebElementFacade clickOnNext() 				 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1033"));   			}
	private WebElementFacade enterSalesPrice() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1069:0:j_id1098")); 	}
	private WebElementFacade saveDigitalLines() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1119")); 				}
	private WebElementFacade selectDigitalLine() 		 {	return element(By.xpath("//span[3]/table/tbody/tr/td[1]/input")); 						}
	private WebElementFacade editDigitalLine() 		 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1198")); 				}
	private WebElementFacade copyLine() 		 	 	 {	return element(By.xpath("//table/tbody/tr/td[8]/img")); 								}
	private WebElementFacade copydates() 		 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1120")); 				}
	private WebElementFacade deactivateDigitalLine() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1199")); 				}
	private WebElementFacade deactivateReason() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1153:j_id1154")); 		}
	private WebElementFacade deactivateReasonSave() 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1158")); 				}
	private WebElementFacade refreshTable() 			 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1166")); 				}
	private WebElementFacade createNewOppFromSelected()  {	return element(By.name("j_id0:opportunityToDigitalForm:j_id961:j_id1200")); 			}
	private WebElementFacade opportunityCopy()  		 {	return element(By.xpath("//*[@id='j_id0:sectionHeaderPanel']/div[1]/div/div[1]/h2")); 	}
	private WebElementFacade lineDescription() 	 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1069:0:j_id1103")); 	}
	private WebElementFacade lineDescFromTable() 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1171:0:j_id1181")); 	}
	private WebElementFacade closedWon() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id115:j_id329"));					 		}
	private WebElementFacade oppStage() 			 	 {  return element(By.id("j_id0:opportunityForm:j_id115:j_id258:j_id275"));					}
	private WebElementFacade closedLost() 	 	 		 {	return element(By.id("j_id0:opportunityForm:j_id115:j_id331"));					 		}
	private WebElementFacade closedLostreason() 		 {  return element(By.id("j_id0:opportunityForm:j_id115:j_id253:j_id254"));					}
	private WebElementFacade closedLostSave() 			 {  return element(By.id("j_id0:opportunityForm:j_id115:j_id332"));							}
	private WebElementFacade oppClosedError() 			 {	return element(By.xpath("//*[@id='j_id0:opportunityToDigitalForm:j_id961:j_id962']/div[2]/table/tbody/tr/td[2]/span")); }
	private WebElementFacade lineOneFID() 		 	 	 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1069:0:selectedInsertionDates")); 		}
	private WebElementFacade lineOneProductName() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1171:0:j_id1179")); 	}
	private WebElementFacade lineTwoProductName() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1171:1:j_id1179")); 	}
	private WebElementFacade scheduledlineOneFID() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1171:0:j_id1193")); 	}
	private WebElementFacade scheduledlineTwoFID() 		 {	return element(By.id("j_id0:opportunityToDigitalForm:j_id961:j_id1171:1:j_id1193")); 	}
	
	public void mapAccountWithSourceSystem() {                                                                                                 
		
		String customDetailsPage = getDriver().getCurrentUrl(); 
		accountMapping().click();
		waitFor(3).seconds();
		sourceSystem().selectByVisibleText("Operative One"); // Hard coded because it is the only value is valid
		waitFor(1).second();
		customerRef().type("DT - " + timeNow);
		accountMappingSave().click();
		waitFor(3).seconds();
		getDriver().get(customDetailsPage);
		waitFor(5).seconds();
	}
	
	public void addDigitalProducts() {

		clickOnAddDigitalProducts().click();
		waitFor(5).seconds();
	}

	public void createDigitalLine() {
		
		selectProduct().click();
		waitFor(1).second();
		addProduct().click();
		waitFor(1).second();
		clickOnNext().click();
		waitFor(5).seconds();
		enterSalesPrice().type("100");
		waitFor(1).second();
		saveDigitalLines().click();
		waitFor(5).seconds();
	}

	public void editLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		lineDescription().typeAndTab("test description");
		waitFor(1).second();
		saveDigitalLines().click();
		waitFor(5).seconds();
		lnDesc = lineDescFromTable().getText();
		assertThat(lnDesc,is(equalTo("test description")));
	}

	public void copyAndSaveALine() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		copyLine().click(); 
		waitFor(5).seconds();
		saveDigitalLines().click();
		waitFor(5).seconds();
		assertThat(lineOneProductName().getText(),is(equalTo(lineTwoProductName().getText())));
	}
	
	public void copyDatesOnMltipleLines(int NoOfLines) {
		
	/*	String s = dateFormat.format(sysdate);*/
		selectDigitalLine().click();
		waitFor(5).seconds();
		editDigitalLine().click();
		waitFor(5).seconds();
		while (NoOfLines > 0) {
			copyLine().click();
			waitFor(5).seconds();
			NoOfLines--;
		}
		lineOneFID().typeAndTab("14/3/2016");
		waitFor(1).seconds();
		copydates().click();
		waitFor(3).seconds();
		saveDigitalLines().click();
		waitFor(5).seconds();
		assertThat(scheduledlineOneFID().getText(),is(equalTo(scheduledlineTwoFID().getText())));
	}
	
	public void deactivateLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		deactivateDigitalLine().click();
		waitFor(5).seconds();
		deactivateReason().selectByVisibleText("Created in error");
		deactivateReasonSave().click();
		waitFor(5).seconds();
		refreshTable().click();
		waitFor(3).seconds();
	}

	public void createNewOppFromSelectedLines() {
		
		selectDigitalLine().click();
		waitFor(5).seconds();
		createNewOppFromSelected().click();
		waitFor(8).seconds();
		oppName = opportunityCopy().getText();
		assertThat(oppName,is(equalTo("Srini Sanity Test-Copy")));
		System.out.println("Copied Opportunity is :     "+getDriver().getCurrentUrl());
	}
	
	public void oppStageAsClosedWon() {
		closedWon().click();
		waitFor(1).seconds();
		try {	getDriver().switchTo().alert().accept();	}
		catch (Exception noPopUp){}
		waitFor(5).seconds();
	}
	public void OppStageShouldBeChanged(){
		String str = oppStage().getText();
		assertThat(str,is(equalTo("Closed Won")));
	}
	
	public void oppStageAsClosedLost(){
		closedLost().click();
		waitFor(5).seconds();
		closedLostreason().selectByVisibleText("Entered in Error");
		waitFor(1).seconds();
		closedLostSave().click();
		waitFor(4).seconds();
	}
	public void OppStageShouldBeClosedLost(){
		String str = oppStage().getText();
		assertThat(str,is(equalTo("Closed Lost")));
	}
	
	public void errorMessageWhenOppIsClosed(String errMessage){
		clickOnAddDigitalProducts().click();
		waitFor(3).seconds();
		String str = oppClosedError().getText();
		assertThat(str,is(equalTo(errMessage)));
		
	}
	
}