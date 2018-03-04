package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleEnterFirstName;
	
	public FindLeadPage enterFirstName(String data) {
		type(eleEnterFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleEnterLeadID;
	
	public FindLeadPage enterLeadID(String data) {
		type(eleEnterLeadID, data);
		return this;		
	}	

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeadBtn;

	public FindLeadPage clickFindLeadButton() {
		click(eleClickFindLeadBtn);
		return this;		
	}	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleClickFirstFoundLead;

	public ViewLeadPag clickOnFirstFoundLead() {
		click(eleClickFirstFoundLead);
		return new ViewLeadPag();		
	}
	
	@FindBy(how = How.XPATH, using = "//div[text()='No records to display']/..")
	private WebElement eleVerifyNoRecords;
	
	public FindLeadPage verifyNoRecords(String data) {
		verifyPartialText(eleVerifyNoRecords, data);
		return this;
	}
	
	
}
