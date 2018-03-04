package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleUpdateCompName;
	
	public EditLeadPage updateCompanyName(String data) {
		type(eleUpdateCompName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit'][@value='Update']")
	private WebElement eleClickUpdateBtn;
	
	public ViewLeadPag clickUpdateButton() {
		click(eleClickUpdateBtn);
		return new ViewLeadPag();		
	}
	
	

}
