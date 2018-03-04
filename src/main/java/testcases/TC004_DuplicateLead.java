package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods{
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DuplicateLead";
		testDescription="To Duplicate a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Anjali";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createNewLead(String uName,String pwd, String fName) {
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
		.enterFirstName(fName)
		.clickFindLeadButton()
		.clickOnFirstFoundLead()
		.clickOnDuplicateButton()
		.clickCreateButton()
		.verifyFirstName(fName);
		
		
		
		
	}


}
