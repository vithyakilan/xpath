package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit'][@value='Create Lead']")
	private WebElement eleClickCreateBtn;
	
	public ViewLeadPag clickCreateButton() {
		click(eleClickCreateBtn);
		return new ViewLeadPag();		
	}
	
	

}
