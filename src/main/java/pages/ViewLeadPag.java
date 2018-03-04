package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPag extends ProjectMethods{
	
	public ViewLeadPag() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	
	public ViewLeadPag verifyFirstName(String data) {
		verifyExactText(eleVerifyFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	private WebElement eleClickEditBtn;
	
	public EditLeadPage clickOnEditButton() {
		click(eleClickEditBtn);
		return new EditLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Duplicate Lead")
	private WebElement eleClickDupBtn;
	
	public DuplicateLeadPage clickOnDuplicateButton() {
		click(eleClickDupBtn);
		return new DuplicateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleClickDeleteBtn;
	
	public MyLeadPage clickOnDeleteButton() {
		click(eleClickDeleteBtn);
		return new MyLeadPage();		
	}
	
	
	@FindBy(how =How.ID, using="viewLead_companyName_sp")
	private WebElement eleVerifyUpdatedValue;

	public ViewLeadPag verifyUpdatedValue(String data) {
		verifyPartialText(eleVerifyUpdatedValue, data);
		return this;		
	}

	
	
}
