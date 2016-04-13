package O2O.pages;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;

import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class opportunityToClassified extends PageObject{
	

	/******** Define Elements of Classified Tab **********************************************************************************************************************************************************/
	
	private WebElementFacade oppToPrint() 			{ 		return element(By.id("j_id0:tab1_lbl")); 																				}
	private WebElementFacade oppToDigital() 		{ 		return element(By.id("j_id0:tab2_lbl")); 																				}
	private WebElementFacade oppToClassified() 		{ 		return element(By.id("j_id0:tab3_lbl")); 																				}
	private WebElementFacade addClassifiedProducts(){  		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1303")); 											}
	private WebElementFacade availableProducts()	{  		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1308:j_id1309:multiselectPanel:leftList")); 		}
	private WebElementFacade addProducts()			{  		return element(By.xpath("//*[@id='j_id0:opportunityToClassifiedForm:j_id1271:j_id1308:j_id1309:btnRight']/img")); 		}
	private WebElementFacade clickOnNext() 			{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1343")); 											}
	private WebElementFacade insertDate() 			{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:selectedInsertionDates")); 					}
	private WebElementFacade salesPrice() 			{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:j_id1409")); 								}
	private WebElementFacade enterSize() 			{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:j_id1414")); 								}
	private WebElementFacade enterURN() 			{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:j_id1418")); 								}
	private WebElementFacade enterPosition() 		{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:j_id1422")); 								}
	private WebElementFacade enterComments() 		{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1378:0:j_id1426")); 								}
	private WebElementFacade copyLine() 			{ 		return element(By.xpath("//*[@id='j_id0:opportunityToClassifiedForm:j_id1271:configureClassifiedInsertionsPanel']/table/tbody/tr/td[11]/img")); }
	private WebElementFacade saveAll() 				{ 		return element(By.id("j_id0:opportunityToClassifiedForm:j_id1271:j_id1442")); 											} 
	private WebElementFacade selectLineItem() 		{ 		return element(By.xpath("//table/tbody/tr/td[1]/input")); 																}
	
	/*********************************************************************************************************************************************************************************************************/

public void clickOnNewOpportunityLine(){
	addClassifiedProducts().click();
	waitFor(4).seconds();
}

public void createClassifiedOppLineUsingCSVDataInput(String CSVfile) throws Exception {
	File filePath = new File(CSVfile);
	if (filePath.isFile()) {
		String file = filePath.getAbsolutePath();
		CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
		for (Map<String, String> record : testDataSrc.getData()) {
			try {
				insertDate().type(record.get("insertionDates"));
				waitFor(1).seconds();
				salesPrice().type(record.get("salesPrice"));
				waitFor(1).seconds();
				enterSize().type(record.get("size"));
				waitFor(1).seconds();
				enterURN().type(record.get("URN"));
				waitFor(1).seconds();
				enterPosition().type(record.get("position"));
				waitFor(1).seconds();
				enterComments().type(record.get("comments"));
			} catch (Exception e1) {}
		}
	}
}

public void classifiedOppShouldBeCreated(){
	
	saveAll().click();
	waitFor(8).seconds();
	
}

}

	 