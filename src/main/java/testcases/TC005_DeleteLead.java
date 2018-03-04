package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Delete Lead";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Anjali";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createNewLead(String uName,String pwd, String leadId, String verifyRec) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfaLink()
		.clickLeadLink()
		.clickFindLeadLink()
		.enterLeadID(leadId)
		.clickFindLeadButton()
		.clickOnFirstFoundLead()
		.clickOnDeleteButton()
		.clickFindLeadLink()
		.enterLeadID(leadId)
		.clickFindLeadButton()
		.verifyNoRecords(verifyRec);  
		
		
		
	}


}
