package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Anjali";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createNewLead(String uName,String pwd,String compName,
			String fName, String lName) {
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
		.clickCreateLeadLink()
		.enterCompanyName(compName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName);
		
	}


}
