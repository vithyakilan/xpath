package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadLink;
	
	public CreateLeadPage clickCreateLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLeadLink);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadLink;
	
	public FindLeadPage clickFindLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeadLink);
		return new FindLeadPage();	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleClickMergeLink;
	
	public MergeLeadPage clickMergeLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickMergeLink);
		return new MergeLeadPage();	
	}
	
	
}
