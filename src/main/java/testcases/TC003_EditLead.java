package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="Edit an Existing Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Anjali";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createNewLead(String uName,String pwd, String fName, String compName) {
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
		.clickOnEditButton()
		.updateCompanyName(compName)
		.clickUpdateButton()
		.verifyUpdatedValue(compName);
		
		
		
		
	}


}
