package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadIcon;
	
	public MergeLeadPage clickLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFromLeadIcon);
		switchToWindow(1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class=' x-form-text x-form-field '][@name='id']")
	private WebElement eleFromLeadID;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindBtn;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleClickFromLeadLink;
		
	public MergeLeadPage enterFromLeadID(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFromLeadID, data);
		click(eleClickFindBtn);
		click(eleClickFromLeadLink);
		switchToWindow(0);
		return this;
	}
	
	
	
	
}
