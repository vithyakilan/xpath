package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompname;
	
	public CreateLeadPage enterCompanyName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	
	public CreateLeadPage enterFirstName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFirstname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastname;
	
	public CreateLeadPage enterLastName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleLastname,data);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@type='submit'][@value='Create Lead']")
	private WebElement eleClickCreateLeadBtn;
	
	public ViewLeadPag clickCreateLeadButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickCreateLeadBtn);
		return new ViewLeadPag();
	}
	
	
}
